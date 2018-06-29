## Mattia Buffa (190936) | mattia.buffa-1@studenti.unitn.it 
I worked with Denis Gallo.  

## TelegramReccomendationBot

This project implements a Telegram bot which is used as interface for the system.

### Description of the project

It contains a Main class which instantiates a class called MyBot which extends Telegram bot api class.
It filters commands given by user to call the other services and using a TimerTask suggests songs based on user games liked and the other users.

A user has to register and an init phase starts which suggests games and songs to "understand" user preferences.
Then a list of commands is available:
- register - Register user
- show_games_genres - Show genres available for games
- game - Recommends games
- game_genre - Recommends games of required genre
- show_owned_games - Show a list of owned games
- show_liked_games - Show a list of liked games
- show_discarded_games - Show a list of discarded games
- game_sales - Show liked games prices
- search_game - Search a game
- song - Recommends songs
- songs_artist - Recommends songs of required artist
- show_liked_songs - Show a list of liked songs
- show_discarded_songs - Show a list of discarded songs
- show_liked_artists - Show a list of liked artists
- show_discarted_artists - Show a list of discarded artists
- search_song - Search a song
- search_artist - Search a artist

## Execution
It is deployed on heroku like a jar file.
The bot can be find searching for sderecombot2k18