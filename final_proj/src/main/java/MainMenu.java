import data.ZeldaDAO;
import data.Zelda_Game;
import utilities.FileRead;
import utilities.UserInput;
import utilities.Helpers;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;


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


        int choice;
        //List<List<String>> games = new ArrayList<List<String>>();
        //games= FileRead.file();
        System.out.println("Choose your option, 1 through 7");


        //view all books, create a book, read info about a book, update book, delete book
        outer: while (true) {

            choice = getInt(banana, "pick menu option");

            switch(choice) {
                case 1:
                    System.out.println("List all books");
                    break;
                case 2:
                    System.out.println("Sort the books");
                    break;
                case 3:
                    System.out.println("Find a book");
                    break;
                case 4:
                    System.out.println("Add a book");
                    break;
                case 5:
                    System.out.println("Update a book");
                    break;
                case 6:
                    System.out.println("Remove a book");
                    break;
                default:
                    break outer;
            }

        }
        System.out.println("Thank you for , wait, errr, boop, goodbye");
        banana.close();
    }
}