package utilities;

import data.Zelda_Game;

import java.text.NumberFormat;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.Scanner;

public class Helpers {
    public static int name_length=55;
    public static int year_length = 8;
    public static int multi_length = 8;
    public static int system_length=10;
    public static int price_length = 6;
    public static int completed_length=15;



    public static String printDate(LocalDate date) {
        String date_string = "h";
        DateTimeFormatter format = DateTimeFormatter.ofPattern("MMMM d, yyyy");
        date_string = date.format(format);

        return date_string;
    }

    public static int getChoice(Scanner scanner, String[] options) {
        //print all values from array with a number in front
        // prompt for number, use getint method
        //partner assignment 5 code
        int choice = 0;
        for (int i = 0; i < options.length; i++) {
            System.out.println((i + 1) + ") " + options[i]);
        }
        System.out.println((options.length + 1) + " )Exit");


        System.out.println("What is your choice? 1 through " + (options.length + 1));

        choice = UserInput.getInt(scanner, "", 1, options.length + 1);


        return choice;


    }

    public static void PressEnterToContinue(Scanner scanner) {

        UserInput.getString(scanner, "Press enter to continue");

    }

    public static void PrintTableHeaderRow() {
        System.out.printf("%"+name_length+"s\t%"+year_length+"s\t%"+multi_length+"s\t%"+system_length+
                        "s\t%"+price_length+"s\t%"+completed_length+"s",
                "Name", "Year", "Multi", "System", "Price", "Completed");
        System.out.println("");
    }

    public static void PrintObjectAsTableRow(Zelda_Game game) {
        System.out.printf("%"+name_length+"s\t%"+year_length+"s\t%"+multi_length+"s\t%"+system_length+
                        "s\t%-"+price_length+"s\t%"+completed_length+"s",
                game.getName(),
                game.getRelease_year(),
                game.isMultiplayer() ? "yes" : "no",
                game.getPlatform(),
                printCurrency(game.getSecondhand_price()),
                printDate(game.getDateCompleted()));
        System.out.println("");
    }

    public static String printCurrency(Double price){
        // from stack overflow
        String result="";
        NumberFormat formatter = NumberFormat.getCurrencyInstance();

        return formatter.format(price);
    }


    public static ArrayList<Zelda_Game> cloneList(ArrayList<Zelda_Game> list) {
        ArrayList<Zelda_Game> clone = new ArrayList<Zelda_Game>(list.size());
        for (Zelda_Game item : list) {
            try {
                clone.add((Zelda_Game) item.clone());
            } catch (CloneNotSupportedException e) {
                throw new RuntimeException(e);
            }
        }
        return clone;
    }

}

