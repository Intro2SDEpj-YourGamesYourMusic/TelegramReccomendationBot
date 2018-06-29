package bot.main;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;

import javax.ws.rs.client.Client;
import javax.ws.rs.client.ClientBuilder;

import org.telegram.telegrambots.api.methods.send.SendMessage;
import org.telegram.telegrambots.api.methods.updatingmessages.DeleteMessage;
import org.telegram.telegrambots.api.methods.updatingmessages.EditMessageText;
import org.telegram.telegrambots.api.objects.MessageEntity;
import org.telegram.telegrambots.api.objects.Update;
import org.telegram.telegrambots.api.objects.replykeyboard.InlineKeyboardMarkup;
import org.telegram.telegrambots.api.objects.replykeyboard.buttons.InlineKeyboardButton;
import org.telegram.telegrambots.bots.TelegramLongPollingBot;
import org.telegram.telegrambots.exceptions.TelegramApiException;

import game.soap.ws.Game;
import project.ws.Artist;
import project.ws.CentralLogic;
import project.ws.CentralLogicImplService;
import project.ws.Song;
import project.ws.User;
import recombee.ws.Recombee;
import recombee.ws.RecombeeService;

public class MyBot extends TelegramLongPollingBot{
	
	Client client = ClientBuilder.newClient();
	//final String baseUri = "https://registration-service-sde.herokuapp.com/app/user";

	RecombeeService rs = new RecombeeService();
	Recombee recombee = rs.getRecombeeImplPort();
	
	CentralLogicImplService ms = new CentralLogicImplService();
	CentralLogic musicservice = ms.getCentralLogicImplPort();
	
	String[] genresAvailable = {"Action","Indie","Strategy","RPG","Casual","Simulation","Racing","Violent"};
	
	
	public InlineKeyboardMarkup CreateOwnLikeDiscard(Game game) {
		InlineKeyboardMarkup markupInline = new InlineKeyboardMarkup();
		List<List<InlineKeyboardButton>> keyboard = new ArrayList<List<InlineKeyboardButton>>();
		List<InlineKeyboardButton> buttons = new ArrayList<InlineKeyboardButton>();

		buttons.add(new InlineKeyboardButton().setText("Owned").setCallbackData("game_"+game.getAppId()+"_"+game.getName()+"_owned"));
		buttons.add(new InlineKeyboardButton().setText("Like").setCallbackData("game_"+game.getAppId()+"_"+game.getName()+"_like"));
		buttons.add(new InlineKeyboardButton().setText("Discard").setCallbackData("game_"+game.getAppId()+"_"+game.getName()+"_discard"));
		
		keyboard.add(buttons);
		
		markupInline.setKeyboard(keyboard);
		return markupInline;
	}
	
	public InlineKeyboardMarkup CreateLikeDiscard(Song song) {
		InlineKeyboardMarkup markupInline = new InlineKeyboardMarkup();
		List<List<InlineKeyboardButton>> keyboard = new ArrayList<List<InlineKeyboardButton>>();
		List<InlineKeyboardButton> buttons = new ArrayList<InlineKeyboardButton>();

		buttons.add(new InlineKeyboardButton().setText("Like").setCallbackData("song_"+song.getIdSong()+"_"+song.getName()+"_like"));
		buttons.add(new InlineKeyboardButton().setText("Discard").setCallbackData("song_"+song.getIdSong()+"_"+song.getName()+"_discard"));
		
		keyboard.add(buttons);
		
		markupInline.setKeyboard(keyboard);
		return markupInline;
	}
	
	boolean checkRegistration(String user) {
		//getAllUsers();		
		User u = musicservice.getUser(user);
		if(u!=null) {
			if(u.getId()!=null)
				return true;
			else
				return false;
		}
		return false;
	}
	
	List<User> getAllUsers() {
		return musicservice.getAllUser();
	}
	
	boolean registerUser(String user, long chatId) {
		//musicservice.initDB();
		//TODO add chatid to user
		User u = new User();
		u.setId(user);
		u.setChatId(chatId+"");
		u = musicservice.createUser(user, chatId+"");
		if(u!=null)
			return true;
		else
			return false;
	}
	
	void InitUser(String user, long chatId) {
		List<Game> games = recombee.randomGames();
		for(Game game : games) {
			String genres = "";
			for(String genre : game.getGenres().getGenre())
				genres += genre + " ";
    		SendMessage message = new SendMessage().setChatId(chatId).setText("Game: "+game.getName()+" - Genre: "+ genres);
    		message.setReplyMarkup(CreateOwnLikeDiscard(game));
    		try {
    			execute(message);
    		}
    		catch (TelegramApiException e) {
	            e.printStackTrace();
	        }
		}
		

		List<Song> songs = musicservice.initSongs(); //problema INSERT INTO Song (idSong, artistName, name) VALUES (?, ?, ?)
		//List<Song> songs = musicservice.getAllSong();
		for(Song song : songs) {
    		SendMessage message = new SendMessage().setChatId(chatId).setText("Song: "+song.getName()+" - Artist: "+ song.getArtistName());
    		message.setReplyMarkup(CreateLikeDiscard(song));
    		try {
    			execute(message);
    		}
    		catch (TelegramApiException e) {
	            e.printStackTrace();
	        }
		}
	}
	
	List<Game> getGamesByGenre(String user, String genre) {
		List<Game> games = new ArrayList<Game>();
		games = recombee.getReccomendationByGenre(user, genre);
		return games;
	}
	
	List<Song> getSongsByArtist(String user, String artist) {
		List<Song> songs = new ArrayList<Song>();
		try {
			Artist a = musicservice.getArtist(artist);
			songs = musicservice.getSongsFromArtist(a);
		}
		catch(Exception ex) {
			return null;
		}
		return songs;
	}
	
	List<Game> getGames(String user){
		List<Game> games = new ArrayList<Game>();
		games = recombee.getReccomendation(user);
		
		return games;
	}
	
	List<Song> getSongs(String user){
		List<Song> songs = new ArrayList<Song>();
		User u = musicservice.getUser(user);
		songs = musicservice.getRecommendation(u);
		
		return songs;
	}
	
	void commandGame(String user,long chatId) {
		List<Game> games = getGames(user);
		for(Game game : games) {
			String genres = "";
			for(String genre : game.getGenres().getGenre())
				genres += genre + " ";
    		SendMessage message = new SendMessage().setChatId(chatId).setText("Game: "+game.getName()+" - Genre: "+ genres);
    		message.setReplyMarkup(CreateOwnLikeDiscard(game));
    		try {
    			execute(message);
    		}
    		catch (TelegramApiException e) {
	            e.printStackTrace();
	        }
		}
	}
	
	void commandSong(String user,long chatId) {
		List<Song> songs = getSongs(user);
		for(Song song : songs) {
    		SendMessage message = new SendMessage().setChatId(chatId).setText("Song: "+song.getName()+" - Artist: "+ song.getArtistName());
    		message.setReplyMarkup(CreateLikeDiscard(song));
    		try {
    			execute(message);
    		}
    		catch (TelegramApiException e) {
	            e.printStackTrace();
	        }
		}
	}
	
	void commandRegister(String user, long chatId){

		if(checkRegistration(user)) {
			String text = "You have already registered!";
			SendMessage message = new SendMessage().setChatId(chatId).setText(text);
			try {
				execute(message);
			}
			catch (TelegramApiException e) {
	            e.printStackTrace();
	        }	
			return;
		}
		
		//boolean resultDb = registerUser(user, chatId);
		boolean created = registerUser(user, chatId);
		if(created) {
			boolean result = recombee.registerUser(user);
			String text = "";
			if(result)
				text = "Fine, you are registered!";
			else
				text = "You have already registered!";
			SendMessage message = new SendMessage().setChatId(chatId).setText(text);
			try {
				execute(message);
				if(result) {
					InitUser(user, chatId);
				}
			}
			catch (TelegramApiException e) {
	            e.printStackTrace();
	        }
		}
	}
	
	void commandShowGamesGenres(String user, long chatId) {
		String text = "";
		for(String s : genresAvailable)
		{
			text += s+", ";
		}
		text = text.substring(0, text.length()-2);
		SendMessage message = new SendMessage().setChatId(chatId).setText("Available game genres:\r\n"+text);
		try {
			execute(message);
		}
		catch(TelegramApiException e){
			e.printStackTrace();
		}
	}
	
	void commandGameGenre(String user, long chatId, String genre) {
		List<Game> games = getGamesByGenre(user, genre);
		for(Game game : games) {
			String genres = "";
			for(String g : game.getGenres().getGenre())
				genres += g + " ";
    		SendMessage message = new SendMessage().setChatId(chatId).setText("Game: "+game.getName()+" - Genre: "+ genres);
    		message.setReplyMarkup(CreateOwnLikeDiscard(game));
    		try {
    			execute(message);
    		}
    		catch (TelegramApiException e) {
	            e.printStackTrace();
	        }
		}
	}
	
	void commandSongsArtist(String user, long chatId, String artist) {
		List<Song> songs = getSongsByArtist(user, artist);
		for(Song song : songs) {
    		SendMessage message = new SendMessage().setChatId(chatId).setText("Song: "+song.getName()+" - Artist: "+ song.getArtistName());
    		message.setReplyMarkup(CreateLikeDiscard(song));
    		try {
    			execute(message);
    		}
    		catch (TelegramApiException e) {
	            e.printStackTrace();
	        }
		}
	}
	
	void ShowBookmarks(String user, long chatId){
		List<Game> games = recombee.showBookmarks(user);
		if(games==null)
			return;
		for(Game game : games) {
    		SendMessage message = new SendMessage().setChatId(chatId).setText("Game: "+game.getName());
    		//message.setReplyMarkup(CreateOwnLikeDiscard(game));
    		
    		InlineKeyboardMarkup markupInline = new InlineKeyboardMarkup();
    		List<List<InlineKeyboardButton>> keyboard = new ArrayList<List<InlineKeyboardButton>>();
    		List<InlineKeyboardButton> buttons = new ArrayList<InlineKeyboardButton>();

    		buttons.add(new InlineKeyboardButton().setText("Owned").setCallbackData("game_"+game.getAppId()+"_"+game.getName()+"_owned"));
    		buttons.add(new InlineKeyboardButton().setText("Remove like").setCallbackData("game_"+game.getAppId()+"_"+game.getName()+"_removelike"));
    		buttons.add(new InlineKeyboardButton().setText("Discard").setCallbackData("game_"+game.getAppId()+"_"+game.getName()+"_discard"));
    		buttons.add(new InlineKeyboardButton().setText("Cancel").setCallbackData("cancel"));
    		
    		keyboard.add(buttons);
    		
    		markupInline.setKeyboard(keyboard);
    		
    		message.setReplyMarkup(markupInline);
    		
    		try {
    			execute(message);
    		}
    		catch (TelegramApiException e) {
	            e.printStackTrace();
	        }
		}
	}
	
	void ShowLikedSongs(String user, long chatId){
		User u = musicservice.getUser(user);
		List<Song> songs = musicservice.getLikedSongs(u);
		if(songs==null)
			return;
		for(Song song : songs) {
    		SendMessage message = new SendMessage().setChatId(chatId).setText("Song: "+song.getName());
    		//message.setReplyMarkup(CreateOwnLikeDiscard(game));
    		
    		InlineKeyboardMarkup markupInline = new InlineKeyboardMarkup();
    		List<List<InlineKeyboardButton>> keyboard = new ArrayList<List<InlineKeyboardButton>>();
    		List<InlineKeyboardButton> buttons = new ArrayList<InlineKeyboardButton>();

    		buttons.add(new InlineKeyboardButton().setText("Remove like").setCallbackData("song_"+song.getIdSong()+"_"+song.getName()+"_removelike"));
    		buttons.add(new InlineKeyboardButton().setText("Discard").setCallbackData("song_"+song.getIdSong()+"_"+song.getName()+"_discard"));
    		buttons.add(new InlineKeyboardButton().setText("Cancel").setCallbackData("cancel"));
    		
    		keyboard.add(buttons);
    		
    		markupInline.setKeyboard(keyboard);
    		
    		message.setReplyMarkup(markupInline);
    		
    		try {
    			execute(message);
    		}
    		catch (TelegramApiException e) {
	            e.printStackTrace();
	        }
		}
	}
	
	void ShowLikedArtists(String user, long chatId){
		User u = musicservice.getUser(user);
		List<Artist> artists = musicservice.getLikedArtists(u);
		if(artists==null)
			return;
		for(Artist artist : artists) {
    		SendMessage message = new SendMessage().setChatId(chatId).setText("Artist: "+artist.getName());
    		//message.setReplyMarkup(CreateOwnLikeDiscard(game));
    		
    		InlineKeyboardMarkup markupInline = new InlineKeyboardMarkup();
    		List<List<InlineKeyboardButton>> keyboard = new ArrayList<List<InlineKeyboardButton>>();
    		List<InlineKeyboardButton> buttons = new ArrayList<InlineKeyboardButton>();

    		buttons.add(new InlineKeyboardButton().setText("Remove like").setCallbackData("artist_"+artist.getIdArtist()+"_"+artist.getName()+"_removelike"));
    		buttons.add(new InlineKeyboardButton().setText("Discard").setCallbackData("artist_"+artist.getIdArtist()+"_"+artist.getName()+"_discard"));
    		buttons.add(new InlineKeyboardButton().setText("Cancel").setCallbackData("cancel"));
    		
    		keyboard.add(buttons);
    		
    		markupInline.setKeyboard(keyboard);
    		
    		message.setReplyMarkup(markupInline);
    		
    		try {
    			execute(message);
    		}
    		catch (TelegramApiException e) {
	            e.printStackTrace();
	        }
		}
	}
	
	void ShowPurchases(String user, long chatId){
		List<Game> games = recombee.showPurchases(user);
		if(games==null)
			return;
		for(Game game : games) {
    		SendMessage message = new SendMessage().setChatId(chatId).setText("Game: "+game.getName());
    		//message.setReplyMarkup(CreateOwnLikeDiscard(game));
    		InlineKeyboardMarkup markupInline = new InlineKeyboardMarkup();
    		List<List<InlineKeyboardButton>> keyboard = new ArrayList<List<InlineKeyboardButton>>();
    		List<InlineKeyboardButton> buttons = new ArrayList<InlineKeyboardButton>();

    		buttons.add(new InlineKeyboardButton().setText("Remove owned").setCallbackData("game_"+game.getAppId()+"_"+game.getName()+"_removeowned"));
    		buttons.add(new InlineKeyboardButton().setText("Like").setCallbackData("game_"+game.getAppId()+"_"+game.getName()+"_like"));
    		buttons.add(new InlineKeyboardButton().setText("Discard").setCallbackData("game_"+game.getAppId()+"_"+game.getName()+"_discard"));
    		buttons.add(new InlineKeyboardButton().setText("Cancel").setCallbackData("cancel"));
    		
    		keyboard.add(buttons);
    		
    		markupInline.setKeyboard(keyboard);
    		
    		message.setReplyMarkup(markupInline);
    		try {
    			execute(message);
    		}
    		catch (TelegramApiException e) {
	            e.printStackTrace();
	        }
		}
	}
	
	void showDiscards(String user, long chatId){
		List<Game> games = recombee.showRatings(user);
		if(games==null)
			return;
		for(Game game : games) {
    		SendMessage message = new SendMessage().setChatId(chatId).setText("Game: "+game.getName());
    		//message.setReplyMarkup(CreateOwnLikeDiscard(game));
    		InlineKeyboardMarkup markupInline = new InlineKeyboardMarkup();
    		List<List<InlineKeyboardButton>> keyboard = new ArrayList<List<InlineKeyboardButton>>();
    		List<InlineKeyboardButton> buttons = new ArrayList<InlineKeyboardButton>();

    		buttons.add(new InlineKeyboardButton().setText("Owned").setCallbackData("game_"+game.getAppId()+"_"+game.getName()+"_owned"));
    		buttons.add(new InlineKeyboardButton().setText("Like").setCallbackData("game_"+game.getAppId()+"_"+game.getName()+"_like"));
    		buttons.add(new InlineKeyboardButton().setText("Remove discard").setCallbackData("game_"+game.getAppId()+"_"+game.getName()+"_removediscard"));
    		buttons.add(new InlineKeyboardButton().setText("Cancel").setCallbackData("cancel"));
    		
    		keyboard.add(buttons);
    		
    		markupInline.setKeyboard(keyboard);
    		
    		message.setReplyMarkup(markupInline);
    		try {
    			execute(message);
    		}
    		catch (TelegramApiException e) {
	            e.printStackTrace();
	        }
		}
	}
	
	void showDiscardedSongs(String user, long chatId){
		User u = musicservice.getUser(user);
		List<Song> songs = musicservice.getDislikedSongs(u);
		if(songs==null)
			return;
		for(Song song : songs) {
    		SendMessage message = new SendMessage().setChatId(chatId).setText("Song: "+song.getName());
    		//message.setReplyMarkup(CreateOwnLikeDiscard(game));
    		InlineKeyboardMarkup markupInline = new InlineKeyboardMarkup();
    		List<List<InlineKeyboardButton>> keyboard = new ArrayList<List<InlineKeyboardButton>>();
    		List<InlineKeyboardButton> buttons = new ArrayList<InlineKeyboardButton>();

    		buttons.add(new InlineKeyboardButton().setText("Like").setCallbackData("song_"+song.getIdSong()+"_"+song.getName()+"_like"));
    		buttons.add(new InlineKeyboardButton().setText("Remove discard").setCallbackData("song_"+song.getIdSong()+"_"+song.getName()+"_removediscard"));
    		buttons.add(new InlineKeyboardButton().setText("Cancel").setCallbackData("cancel"));
    		
    		keyboard.add(buttons);
    		
    		markupInline.setKeyboard(keyboard);
    		
    		message.setReplyMarkup(markupInline);
    		try {
    			execute(message);
    		}
    		catch (TelegramApiException e) {
	            e.printStackTrace();
	        }
		}
	}
	
	void showDiscardedArtists(String user, long chatId){
		User u = musicservice.getUser(user);
		List<Artist> artists = musicservice.getDislikedArtists(u);
		if(artists==null)
			return;
		for(Artist artist : artists) {
    		SendMessage message = new SendMessage().setChatId(chatId).setText("Artist: "+artist.getName());
    		//message.setReplyMarkup(CreateOwnLikeDiscard(game));
    		InlineKeyboardMarkup markupInline = new InlineKeyboardMarkup();
    		List<List<InlineKeyboardButton>> keyboard = new ArrayList<List<InlineKeyboardButton>>();
    		List<InlineKeyboardButton> buttons = new ArrayList<InlineKeyboardButton>();

    		buttons.add(new InlineKeyboardButton().setText("Like").setCallbackData("artist_"+artist.getIdArtist()+"_"+artist.getName()+"_like"));
    		buttons.add(new InlineKeyboardButton().setText("Remove discard").setCallbackData("artist_"+artist.getIdArtist()+"_"+artist.getName()+"_removediscard"));
    		buttons.add(new InlineKeyboardButton().setText("Cancel").setCallbackData("cancel"));
    		
    		keyboard.add(buttons);
    		
    		markupInline.setKeyboard(keyboard);
    		
    		message.setReplyMarkup(markupInline);
    		try {
    			execute(message);
    		}
    		catch (TelegramApiException e) {
	            e.printStackTrace();
	        }
		}
	}
	
	void checkSales(String user, long chatId) {
		List<Game> games = recombee.showBookmarks(user);
		if(games==null)
			return;
		for(Game game : games) {
			game = recombee.checkSale(game.getAppId(), game.getName());
    		SendMessage message = new SendMessage().setChatId(chatId).setText("Game: "+game.getName()+"\r\nFull price: "+game.getFullPrice()+"Euros\r\nSale price: "+game.getPrice()+"Euros");
    		
    		try {
    			execute(message);
    		}
    		catch (TelegramApiException e) {
	            e.printStackTrace();
	        }
		}
	}

	void searchGame(String user, long chatId, String name_game) {
		List<Game> games = new ArrayList<Game>();
		games = recombee.findGame(name_game);
		
		if(games==null)
			return;
		for(Game game : games) {
    		SendMessage message = new SendMessage().setChatId(chatId).setText("Game: "+game.getName());
    		InlineKeyboardMarkup markupInline = new InlineKeyboardMarkup();
    		List<List<InlineKeyboardButton>> keyboard = new ArrayList<List<InlineKeyboardButton>>();
    		List<InlineKeyboardButton> buttons = new ArrayList<InlineKeyboardButton>();

    		buttons.add(new InlineKeyboardButton().setText("Owned").setCallbackData("game_"+game.getAppId()+"_"+game.getName()+"_owned"));
    		buttons.add(new InlineKeyboardButton().setText("Like").setCallbackData("game_"+game.getAppId()+"_"+game.getName()+"_like"));
    		buttons.add(new InlineKeyboardButton().setText("Discard").setCallbackData("game_"+game.getAppId()+"_"+game.getName()+"_discard"));
    		
    		keyboard.add(buttons);
    		
    		markupInline.setKeyboard(keyboard);
    		
    		message.setReplyMarkup(markupInline);
    		try {
    			execute(message);
    		}
    		catch (TelegramApiException e) {
	            e.printStackTrace();
	        }
		}
	}
	
	void searchSong(String user, long chatId, String name_song) {
		Song song = musicservice.getSong(name_song);
		
		if(song==null)
			return;
		
		SendMessage message = new SendMessage().setChatId(chatId).setText("Song: "+song.getName());
		InlineKeyboardMarkup markupInline = new InlineKeyboardMarkup();
		List<List<InlineKeyboardButton>> keyboard = new ArrayList<List<InlineKeyboardButton>>();
		List<InlineKeyboardButton> buttons = new ArrayList<InlineKeyboardButton>();

		//buttons.add(new InlineKeyboardButton().setText("Owned").setCallbackData("song_"+song.getIdSong()+"_"+song.getName()+"_owned"));
		buttons.add(new InlineKeyboardButton().setText("Like").setCallbackData("song_"+song.getIdSong()+"_"+song.getName()+"_like"));
		buttons.add(new InlineKeyboardButton().setText("Discard").setCallbackData("song_"+song.getIdSong()+"_"+song.getName()+"_discard"));
		
		keyboard.add(buttons);
		
		markupInline.setKeyboard(keyboard);
		
		message.setReplyMarkup(markupInline);
		try {
			execute(message);
		}
		catch (TelegramApiException e) {
            e.printStackTrace();
        }
	}
	
	void searchArtist(String user, long chatId, String name_artist) {
		Artist artist = musicservice.getArtist(name_artist);
		
		if(artist==null)
			return;
		
		SendMessage message = new SendMessage().setChatId(chatId).setText("Artist: "+artist.getName());
		InlineKeyboardMarkup markupInline = new InlineKeyboardMarkup();
		List<List<InlineKeyboardButton>> keyboard = new ArrayList<List<InlineKeyboardButton>>();
		List<InlineKeyboardButton> buttons = new ArrayList<InlineKeyboardButton>();

		//buttons.add(new InlineKeyboardButton().setText("Owned").setCallbackData("artist_"+artist.getIdArtist()+"_"+artist.getName()+"_owned"));
		buttons.add(new InlineKeyboardButton().setText("Like").setCallbackData("artist_"+artist.getIdArtist()+"_"+artist.getName()+"_like"));
		buttons.add(new InlineKeyboardButton().setText("Discard").setCallbackData("artist_"+artist.getIdArtist()+"_"+artist.getName()+"_discard"));
		
		keyboard.add(buttons);
		
		markupInline.setKeyboard(keyboard);
		
		message.setReplyMarkup(markupInline);
		try {
			execute(message);
		}
		catch (TelegramApiException e) {
            e.printStackTrace();
        }
	}
	
	void deleteUser(String user, long chatId, String userId) {
		boolean r = recombee.deleteUser(userId);
		User u = new User();
		u.setId(userId);
		int s = musicservice.deleteUser(u);
		SendMessage message = new SendMessage().setChatId(chatId).setText("Deleted user from recombee: " +userId+" "+r+"\r\nDeleted user from db "+s);
		try {
			execute(message);
		}
		catch (TelegramApiException e) {
            e.printStackTrace();
        }
	}
	
	//@Override
	public void onUpdateReceived(Update update) {
		
		
		// We check if the update has a message and the message has text
	    if (update.hasMessage() && update.getMessage().hasText()) {
	    	String user = update.getMessage().getFrom().getId().toString();
	    	System.out.println("User: "+user);
	    	
	    	String recived = update.getMessage().getText();
	    	long chatId = update.getMessage().getChatId();
	    	List<MessageEntity> commands = update.getMessage().getEntities();
	    	//System.out.println(commands.get(0).getText());
	    	if(commands.get(0).getText().equals("/game")) {
	    		commandGame(user, chatId);
	    	}
	    	if(commands.get(0).getText().equals("/register")) {
	    		//TODO register
	    		commandRegister(user, chatId);
	    		System.out.println(chatId);
	    	}
	    	if(commands.get(0).getText().equals("/game_genre")) {
	    		String genre = update.getMessage().getText().split(" ")[1];
	    		commandGameGenre(user, chatId, genre);
	    	}
	    	if(commands.get(0).getText().equals("/show_games_genres")) {
	    		commandShowGamesGenres(user, chatId);
	    	}
	    	if(commands.get(0).getText().equals("/init")) {
	    		InitUser(user, chatId);
	    	}
	    	if(commands.get(0).getText().equals("/show_owned_games")) {
	    		ShowPurchases(user, chatId);
	    	}
	    	if(commands.get(0).getText().equals("/show_liked_games")) {
	    		ShowBookmarks(user, chatId);
	    	}
	    	if(commands.get(0).getText().equals("/show_discarded_games")) {
	    		showDiscards(user, chatId);
	    	}
	    	if(commands.get(0).getText().equals("/game_sales")) {
	    		checkSales(user, chatId);
	    	}
	    	if(commands.get(0).getText().equals("/search_game")) {
	    		//String name_game = update.getMessage().getText().split(" ")[1];
	    		String cmd = update.getMessage().getText().split(" ")[0];
	    		String name_game = update.getMessage().getText().substring(cmd.length()+1);
	    		searchGame(user, chatId,name_game);
	    	}
	    	if(commands.get(0).getText().equals("/song")) {
	    		commandSong(user,chatId);
	    	}
	    	if(commands.get(0).getText().equals("/songs_artist")) {
	    		String artist = update.getMessage().getText().split(" ")[1];
	    		commandSongsArtist(user,chatId,artist);
	    	}
	    	if(commands.get(0).getText().equals("/show_liked_songs")) {
	    		ShowLikedSongs(user,chatId);
	    	}
	    	if(commands.get(0).getText().equals("/show_discarded_songs")) {
	    		showDiscardedSongs(user,chatId);
	    	}
	    	if(commands.get(0).getText().equals("/show_liked_artists")) {
	    		ShowLikedArtists(user,chatId);
	    	}
	    	if(commands.get(0).getText().equals("/show_discarted_artists")) {
	    		showDiscardedArtists(user,chatId);
	    	}
	    	if(commands.get(0).getText().equals("/search_song")) {
	    		//String name_song = update.getMessage().getText().split(" ")[1];
	    		String cmd = update.getMessage().getText().split(" ")[0];
	    		String name_song = update.getMessage().getText().substring(cmd.length()+1);
	    		searchSong(user, chatId,name_song);
	    	}
	    	if(commands.get(0).getText().equals("/search_artist")) {
	    		//String name_artist = update.getMessage().getText().split(" ")[1];
	    		String cmd = update.getMessage().getText().split(" ")[0];
	    		String name_artist = update.getMessage().getText().substring(cmd.length()+1);
	    		searchArtist(user, chatId,name_artist);
	    	}
	    	if(commands.get(0).getText().equals("/delete")) {
	    		String userId = update.getMessage().getText().split(" ")[1];
	    		deleteUser(user, chatId,userId);
	    	}
	    }
	    else if (update.hasCallbackQuery()) {
	    	//TODO call recombee
	    	String user = update.getCallbackQuery().getFrom().getId().toString();

	    	System.out.println("User: "+user);
	    	
	    	String call_data = update.getCallbackQuery().getData();
            long messageId = (long)update.getCallbackQuery().getMessage().getMessageId();
            long chatId = update.getCallbackQuery().getMessage().getChatId();

            List<String> splitted = new ArrayList<String>();
            for(String s : call_data.split("_")) {
            	splitted.add(s);
            }
            
            if (splitted.contains("game")&&splitted.contains("owned")) {
            	long appId = Long.parseLong(splitted.get(1));
                String answer = "You own "+splitted.get(2)+", nice!";
                EditMessageText new_message = new EditMessageText()
                        .setChatId(chatId)
                        .setMessageId((int) messageId)
                        .setText(answer);
                recombee.addPurchase(user, appId);
                try {
                    execute(new_message); 
                } catch (TelegramApiException e) {
                    e.printStackTrace();
                }
            }
            
            if (splitted.contains("game")&&splitted.contains("like")) {

            	long appId = Long.parseLong(splitted.get(1));
                String answer = "You like "+splitted.get(2)+", ty!";
                EditMessageText new_message = new EditMessageText()
                        .setChatId(chatId)
                        .setMessageId((int) messageId)
                        .setText(answer);
                boolean r = recombee.addBookmark(user, appId);
                System.out.println(r);
                try {
                    execute(new_message); 
                } catch (TelegramApiException e) {
                    e.printStackTrace();
                }
            }
            
            if (splitted.contains("song")&&splitted.contains("like")) {
            	User u = musicservice.getUser(user);
            	Song song = musicservice.getSong(splitted.get(2));
                String answer = "You like "+splitted.get(2)+", ty!";
                EditMessageText new_message = new EditMessageText()
                        .setChatId(chatId)
                        .setMessageId((int) messageId)
                        .setText(answer);
                int r = musicservice.addRatingSong(u, song, true);
                System.out.println(r);
                try {
                    execute(new_message); 
                } catch (TelegramApiException e) {
                    e.printStackTrace();
                }
            }
            
            if (splitted.contains("artist")&&splitted.contains("like")) {
            	User u = musicservice.getUser(user);
            	Artist artist = musicservice.getArtist(splitted.get(2));
                String answer = "You like "+splitted.get(2)+", ty!";
                EditMessageText new_message = new EditMessageText()
                        .setChatId(chatId)
                        .setMessageId((int) messageId)
                        .setText(answer);
                int r = musicservice.addRatingArtist(u, artist, true);
                System.out.println(r);
                try {
                    execute(new_message); 
                } catch (TelegramApiException e) {
                    e.printStackTrace();
                }
            }
            
            if (splitted.contains("game")&&splitted.contains("discard")) {

            	long appId = Long.parseLong(splitted.get(1));
                String answer = "You don't like "+splitted.get(2)+", me too ;)";
                EditMessageText new_message = new EditMessageText()
                        .setChatId(chatId)
                        .setMessageId((int) messageId)
                        .setText(answer);
                recombee.addRating(user, appId, -0.5);
                try {
                    execute(new_message); 
                } catch (TelegramApiException e) {
                    e.printStackTrace();
                }
            }
            
            if (splitted.contains("song")&&splitted.contains("discard")) {
            	User u = musicservice.getUser(user);
            	Song song = musicservice.getSong(splitted.get(2));
                String answer = "You dont't like "+splitted.get(2)+", me too ;)";
                EditMessageText new_message = new EditMessageText()
                        .setChatId(chatId)
                        .setMessageId((int) messageId)
                        .setText(answer);
                int r = musicservice.addRatingSong(u, song, false);
                System.out.println(r);
                try {
                    execute(new_message); 
                } catch (TelegramApiException e) {
                    e.printStackTrace();
                }
            }
            
            if (splitted.contains("artist")&&splitted.contains("discard")) {
            	User u = musicservice.getUser(user);
            	Artist artist = musicservice.getArtist(splitted.get(2));
                String answer = "You don't like "+splitted.get(2)+", me too ;)";
                EditMessageText new_message = new EditMessageText()
                        .setChatId(chatId)
                        .setMessageId((int) messageId)
                        .setText(answer);
                int r = musicservice.addRatingArtist(u, artist, false);
                System.out.println(r);
                try {
                    execute(new_message); 
                } catch (TelegramApiException e) {
                    e.printStackTrace();
                }
            }
            
            if (splitted.contains("game")&&splitted.contains("removeowned")) {

            	long appId = Long.parseLong(splitted.get(1));
                String answer = "You don't own "+splitted.get(2)+" anymore!";
                EditMessageText new_message = new EditMessageText()
                        .setChatId(chatId)
                        .setMessageId((int) messageId)
                        .setText(answer);
                recombee.deletePurchase(user, appId);
                try {
                    execute(new_message); 
                } catch (TelegramApiException e) {
                    e.printStackTrace();
                }
            }
            if (splitted.contains("game")&&splitted.contains("removelike")) {

            	long appId = Long.parseLong(splitted.get(1));
                String answer = "You don't like "+splitted.get(2)+" anymore!";
                EditMessageText new_message = new EditMessageText()
                        .setChatId(chatId)
                        .setMessageId((int) messageId)
                        .setText(answer);
                recombee.deleteBookmark(user, appId);
                try {
                    execute(new_message); 
                } catch (TelegramApiException e) {
                    e.printStackTrace();
                }
            }

            if (splitted.contains("song")&&splitted.contains("removelike")) {
            	User u = musicservice.getUser(user);
            	Song song = musicservice.getSong(splitted.get(2));
                String answer = "You don't like "+splitted.get(2)+" anymore!";
                EditMessageText new_message = new EditMessageText()
                        .setChatId(chatId)
                        .setMessageId((int) messageId)
                        .setText(answer);
                musicservice.deleteUserLikeSong(u, song);
                try {
                    execute(new_message); 
                } catch (TelegramApiException e) {
                    e.printStackTrace();
                }
            }
            if (splitted.contains("artist")&&splitted.contains("removelike")) {
            	User u = musicservice.getUser(user);
            	Artist artist = musicservice.getArtist(splitted.get(2));
                String answer = "You don't like "+splitted.get(2)+" anymore!";
                EditMessageText new_message = new EditMessageText()
                        .setChatId(chatId)
                        .setMessageId((int) messageId)
                        .setText(answer);
                musicservice.deleteUserLikeArtist(u, artist);
                try {
                    execute(new_message); 
                } catch (TelegramApiException e) {
                    e.printStackTrace();
                }
            }
            
            if (splitted.contains("game")&&splitted.contains("removediscard")) {

            	long appId = Long.parseLong(splitted.get(1));
                String answer = "You have removed "+splitted.get(2)+" from discarded list!";
                EditMessageText new_message = new EditMessageText()
                        .setChatId(chatId)
                        .setMessageId((int) messageId)
                        .setText(answer);
                recombee.deleteRating(user, appId);
                try {
                    execute(new_message); 
                } catch (TelegramApiException e) {
                    e.printStackTrace();
                }
            }
            
            if (splitted.contains("song")&&splitted.contains("removediscard")) {
            	User u = musicservice.getUser(user);
            	Song song = musicservice.getSong(splitted.get(2));
                String answer = "You don't like "+splitted.get(2)+" anymore!";
                EditMessageText new_message = new EditMessageText()
                        .setChatId(chatId)
                        .setMessageId((int) messageId)
                        .setText(answer);
                musicservice.deleteUserLikeSong(u, song);
                try {
                    execute(new_message); 
                } catch (TelegramApiException e) {
                    e.printStackTrace();
                }
            }
            if (splitted.contains("artist")&&splitted.contains("removediscard")) {
            	User u = musicservice.getUser(user);
            	Artist artist = musicservice.getArtist(splitted.get(2));
                String answer = "You don't like "+splitted.get(2)+" anymore!";
                EditMessageText new_message = new EditMessageText()
                        .setChatId(chatId)
                        .setMessageId((int) messageId)
                        .setText(answer);
                musicservice.deleteUserLikeArtist(u, artist);
                try {
                    execute(new_message); 
                } catch (TelegramApiException e) {
                    e.printStackTrace();
                }
            }
            if(splitted.get(0).equals("cancel")) {
            	DeleteMessage delete = new DeleteMessage();
            	delete.setChatId(chatId+"");
            	System.out.println(messageId+"");
            	delete.setMessageId(Integer.parseInt(messageId+""));
            	try {
                    execute(delete); 
                } catch (TelegramApiException e) {
                    e.printStackTrace();
                }
            }
	    }
	}
	
	public void TimerTaskReccomandation() {
		List<User> users = musicservice.getAllUser();
		for(User user : users) {
			long chatId = Long.parseLong(user.getChatId());
			List<Game> games = recombee.showBookmarks(user.getId());
			int randomGame = (new Random()).nextInt(games.size());
			System.out.println("games: "+games.size());
			System.out.println("randomgames: "+randomGame);
			List<Object> o = recombee.randomUserByItem(games.get(randomGame).getAppId()+"");

			System.out.println("o: "+o.size());
			
			Song song;
			SendMessage message;
			if(o.size()!=0) {
				Game game = (Game)o.get(1);
	
				System.out.println("game: "+game.getName());
				
				User randomUser = new User();
				randomUser.setId((String)o.get(0));
				List<Song> songs = musicservice.getLikedSongs(randomUser);
				
				song = songs.get((new Random()).nextInt(songs.size()));
				
				message = new SendMessage().setChatId(chatId).setText("Another user who plays "+ game.getName()+" likes this song "+song.getName());
			}
			else {
				User u = users.get((new Random()).nextInt(users.size()));
				List<Song> songs = musicservice.getLikedSongs(u);
				if(songs.size()>0) {
					song = songs.get((new Random()).nextInt(songs.size()));
					message = new SendMessage().setChatId(chatId).setText("Another user likes this song "+song.getName() + " of "+song.getArtistName());
				}
				else {
					songs = musicservice.getAllSong();
					if(songs.size()<1)
						songs = musicservice.initSongs();
					System.out.println("songs: "+songs.size());
					song = songs.get((new Random()).nextInt(songs.size()));
					message = new SendMessage().setChatId(chatId).setText("Do you like this song? "+song.getName() + " of "+song.getArtistName());
				}
			}
			InlineKeyboardMarkup markupInline = new InlineKeyboardMarkup();
			List<List<InlineKeyboardButton>> keyboard = new ArrayList<List<InlineKeyboardButton>>();
			List<InlineKeyboardButton> buttons = new ArrayList<InlineKeyboardButton>();

			buttons.add(new InlineKeyboardButton().setText("Like").setCallbackData("song_"+song.getIdSong()+"_"+song.getName()+"_like"));
			buttons.add(new InlineKeyboardButton().setText("Discard").setCallbackData("song_"+song.getIdSong()+"_"+song.getName()+"_discard"));
			
			keyboard.add(buttons);
			
			markupInline.setKeyboard(keyboard);
			
			message.setReplyMarkup(markupInline);
			try {
				execute(message);
			}
			catch (TelegramApiException e) {
	            e.printStackTrace();
	        }
			
		}
	}

	//Deve ritornare solo il nome del bot
	//@Override
	public String getBotUsername() {
		// TODO Auto-generated method stub
		return "sderecombot2k18";
	}

	//token con nome sderecom2k18bot (richiedeva bot alla fine)
	@Override
	public String getBotToken() {
		// token generato da botfather
		return "508465496:AAFKY8p1lBKD-TgYhFWlqecQzsyfYZ3jWvE";
	}

}
