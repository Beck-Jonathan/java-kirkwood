import Tasks.*;
import data.ZeldaDAO;
import data.Zelda_Game;
import utilities.UserInput;
import utilities.Helpers;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;



import static utilities.Helpers.getChoice;
import static utilities.UserInput.getInt;


public class MainMenu {
    public static void main(String[] args) {
        //final project is a representation of a real life thing
        //task is to come up with somethat is not a book
        //read from a csv file
        //create objects from each line in the file
        //sort the files, all crud tasks (create, read, update, delete)

        //you are only allowed 2 scnaner object, one for user input, 1 for file input
        //you will pass the scanner

        // use chapter 16 to make visual gui for extra credit
        // use javafx to make visual gui for other extra credit
        //make sure to close the scanner when you have multiple users
        Scanner banana = new Scanner(System.in);
        ZeldaDAO.readData();


        int choice=0;

        System.out.println("Choose your option, 1 through 7");
        String[] options = {"List All Games", "Sort the games","Find a game",
                "Add a game","Update a game","Remove a game" };




        //view all games, create a game, read info about a game, update game, delete game
        outer: while (true) {
            System.out.println("** Main Menu **");


            choice= getChoice ( banana, options);
            switch(choice) {
                case 1:
                    Helpers.PrintTableHeaderRow();
                    for (Zelda_Game game: ZeldaDAO.getAllGames()){
                    Helpers.PrintObjectAsTableRow(game);
                }


                    break;
                case 2:
                    new Sort().handleTask(banana);

                    break;
                case 3:
                    new Find().handleTask(banana);

                    break;
                case 4:
                    new Add().handleTask(banana);

                    break;
                case 5:
                    new Update().handleTask(banana);

                    break;
                case 6:
                    new Remove().handleTask(banana);

                    break;
                default:
                    break outer;
            } // end of switch statement
            Helpers.PressEnterToContinue(banana);
        } // end of while loop
        System.out.println("Thank you for , wait, errr, boop, goodbye");
        banana.close();
    } // end of main method

}