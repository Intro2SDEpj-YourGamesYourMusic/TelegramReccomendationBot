package bot.main;
import java.io.File;
import java.util.Timer;
import java.util.TimerTask;

import org.telegram.telegrambots.ApiContextInitializer;
import org.telegram.telegrambots.TelegramBotsApi;
import org.telegram.telegrambots.exceptions.TelegramApiException;

public class Main {
	
	static TelegramBotsApi telegramBotsApi = new TelegramBotsApi();
	static MyBot myBot;

	static int minutes=10;
	
	static Timer timer;
	static TimerTask t = new TimerTask() {
		@Override
		public void run() {
			myBot.TimerTaskReccomandation();
		}
	};
	
	public static void main(String[] args) {	
        ApiContextInitializer.init();
        
        try {
        	myBot = new MyBot();
            telegramBotsApi.registerBot(myBot);
            System.out.println("Started");
            timer = new Timer(true);
            timer.scheduleAtFixedRate(t, 0, minutes*60*1000);
        } catch (TelegramApiException e) {
            e.printStackTrace();
        }
    }
}
