package utilities;

import java.time.LocalDate;
import java.util.Scanner;

public class UserInput {
    // string
    public static String getString(Scanner banana, String prompt) {
        String result = "";
        System.out.print(prompt+ ": ");
        result = banana.nextLine();

        return result;
    }

    // int
    public static int getInt(Scanner banana, String prompt) {
        int result = 0;
        System.out.print(prompt+ ": ");
        result = banana.nextInt();


        return result;

    }

    // double
    public static double getDouble(Scanner banana, String prompt) {
        double result = 0;
        System.out.print(prompt+ ": ");
        result = banana.nextDouble();


        return result;
    }

    // dates
    public static LocalDate getDate(Scanner banana, String prompt) {
        LocalDate localDate = LocalDate.now();
        System.out.print(prompt+ ": ");
        return localDate;

    }

    // boolean
    public static boolean getBool(Scanner banana, String prompt) {
        boolean result ;
        System.out.print(prompt+ ": ");
        result = banana.nextBoolean();


        return result;
    }
}
