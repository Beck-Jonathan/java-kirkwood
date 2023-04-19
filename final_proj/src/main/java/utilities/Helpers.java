package utilities;

import data.Zelda_Game;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;

public class Helpers {
    public static String printDate(LocalDate date) {
        String date_string = "h";
        DateTimeFormatter format = DateTimeFormatter.ofPattern("EEEE, MMMM d, yyyy");
        date_string = date.format(format);

        return date_string;
    }
    public static int getChoice (Scanner scanner, String[] options){
        //print all values from array with a number in front
        // prompt for number, use getint method
        //partner assignment 5 code
        int choice=0;
        for (int i=0;i<options.length;i++) {
            System.out.println((i+1) + ") " + options[i]);
        }
        System.out.println((options.length+1)+" )Exit");


        System.out.println("What is your choice? 1 through " +(options.length+1) );

        choice = UserInput.getInt(scanner, "",1,options.length+1);


        return choice;


    }
    public static void PressEnterToContinue(Scanner scanner){

        UserInput.getString(scanner,"Press enter to continue");

    }
    public static void PrintTableHeaderRow(){
        System.out.printf("%55s\t%8s\t%7s\t%15s\t%8s\t%15s",
        "Name", "Year", "Multi", "System", "Price", "Completed");
        System.out.println("");
    }
    public static void PrintObjectAsTableRow(Zelda_Game game){
        System.out.printf("%55s\t%8s\t%7s\t%15s\t$%8s\t%15s",
                game.getName(),
                game.getRelease_year(),
                game.isMultiplayer(),
                game.getPlatform(),
                game.getSecondhand_price(),
                game.getDateCompleted());
        System.out.println("");



    }
}
