package Tasks;

import data.ZeldaDAO;
import data.Zelda_Game;
import utilities.Helpers;

import java.util.ArrayList;
import java.util.Scanner;

import static data.ZeldaDAO.readData;
import static java.lang.Double.valueOf;
import static utilities.Helpers.getChoice;

public class Sort implements TaskHandler {
    public void handleTask(Scanner banana){
    ArrayList<Zelda_Game> games = ZeldaDAO.getAllGames();
    int choice=0;
    //List<List<String>> games = new ArrayList<List<String>>();
    //games= FileRead.file();

    String[] options = {"title A to Z", "title Z to A","Completion date, recent to oldest",
            "Completion date, oldest to recent","Second hand price, low to high","second hand price high to low",
    "release year recent to oldest","release year oldest to recent"};
    System.out.println("Choose your option, 1 through "+(options.length+1) + ":");




    //view all games, create a game, read info about a game, update game, delete game
    outer: while (true) {
        System.out.println("** SORT MENU**");


        choice= getChoice ( banana, options);
        switch(choice) {
            case 1:

                // sort by title a to z
            games.sort((g1,g2)->g1.getName().compareTo(g2.getName()));
                break;




            case 2:
                // sort by title z  to a
                games.sort((g1,g2)->g1.getName().compareTo(g2.getName())*-1);
                break;
            case 3:
                games.sort((g1,g2)->g1.getDateCompleted().compareTo(g2.getDateCompleted()));
                break;


            case 4: games.sort((g1,g2)->g1.getDateCompleted().compareTo(g2.getDateCompleted())*-1);

                break;
            case 5:// "Second hand price, low to high"
                games.sort((g1,g2)->valueOf(g1.getSecondhand_price()).compareTo(valueOf(g2.getSecondhand_price())));

                break;
            case 6: // "second hand price high to low",
                games.sort((g1,g2)->valueOf(g1.getSecondhand_price()).compareTo(valueOf(g2.getSecondhand_price()))*-1);
                break;

            case 7 : //   "release year recent to oldest"
                games.sort((g1,g2)->valueOf(g1.getRelease_year()).compareTo(valueOf(g2.getRelease_year())));
                break;

            case 8 : //  "release year oldest to recent"
                games.sort((g1,g2)->valueOf(g1.getRelease_year()).compareTo(valueOf(g2.getRelease_year()))*-1);

                break;


            default:
                break outer;
        } // end of switch statement
        for (Zelda_Game game:games){System.out.println("title: " + game.getName());
        System.out.println("release year: " + game.getRelease_year());
        System.out.println("is multiplayer? " + game.isMultiplayer());
        System.out.println("platform: " + game.getPlatform());
        System.out.println("secondhand price: $" + game.getSecondhand_price());
        System.out.println("date completed: " + game.getDateCompleted());
        System.out.println("");
        System.out.println("");}
        Helpers.PressEnterToContinue(banana);
    } // end of while loop
}
}
