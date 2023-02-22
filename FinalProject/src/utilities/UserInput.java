package utilities;

import java.time.LocalDate;
import java.util.InputMismatchException;
import java.util.Scanner;

public class UserInput {
    // single string
    public static String getString(Scanner banana, String prompt) {
        String value = "";
        do {
            System.out.print(prompt + ": ");
            value = banana.nextLine();

        }
        while (value.equals(""));

        return value;
    }
    //string from a list

    // int
    public static int getInt(Scanner banana, String prompt) {
        int value = 0;
        while (true) {
            try {
                System.out.print(prompt + ": ");
                value = banana.nextInt();
                banana.nextLine();
                break;
            } catch (InputMismatchException e) {
                banana.nextLine();
                continue;
            }
        }
        return value;
    }



    // double
    public static double getDouble(Scanner banana, String prompt) {
        double result = 0;
        System.out.print(prompt + ": ");
        result = banana.nextDouble();
        banana.nextLine();


        return result;
    }

    // dates
    public static LocalDate getDate(Scanner banana, String prompt) {
        LocalDate localDate = LocalDate.now();
        System.out.print(prompt + ": ");
        return localDate;

    }

    // boolean
    public static boolean getBoolean(Scanner banana, String prompt) {
        boolean result = false;
        String value = "";
        do {
            System.out.print(prompt + "[Yes or No]: ");
            value = banana.nextLine();


        } while (!value.equalsIgnoreCase("Yes") &&
                !value.equalsIgnoreCase("No") &&
                !value.equalsIgnoreCase("Y") &&
                !value.equalsIgnoreCase("N"));
        return value.equalsIgnoreCase("Yes") || value.equalsIgnoreCase("Y");
    }
}
