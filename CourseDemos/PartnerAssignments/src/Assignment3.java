import java.time.LocalDate;
import java.time.Month;

import java.time.format.DateTimeFormatter;
import java.util.Scanner;

public class Assignment3 {
    public static void main(String[] args) {
        System.out.println("Please enter your date of birth (M/D/YYYY): ");
        String zodiac_sign = "";
        String vowel_start = "";
        Scanner banana = new Scanner(System.in);
        String bday = banana.nextLine();
        DateTimeFormatter format = DateTimeFormatter.ofPattern("M/d/yyyy");
        LocalDate date = null;
        date = LocalDate.parse(bday, format);
        Month month = date.getMonth();
        int day = date.getDayOfMonth();
        if (month.toString().equalsIgnoreCase("January")) {
            if (day < 20) {
                zodiac_sign = "Capricorn";
            } else {
                zodiac_sign = "Aquarius";
            }
        }
        if (month.toString().equalsIgnoreCase("February")) {
            if (day < 19) {
                zodiac_sign = "Aquarius";
            } else {
                zodiac_sign = "Pisces";
            }
        }
        if (month.toString().equalsIgnoreCase("March")) {
            if (day < 20) {
                zodiac_sign = "Pisces";
            } else {
                zodiac_sign = "Aries";
            }
        }
        if (month.toString().equalsIgnoreCase("April")) {
            if (day < 19) {
                zodiac_sign = "Aries";
            } else {
                zodiac_sign = "Taurus";
            }
        }
        if (month.toString().equalsIgnoreCase("May")) {
            if (day < 21) {
                zodiac_sign = "Taurus";
            } else {
                zodiac_sign = "Gemini";
            }
        }
        if (month.toString().equalsIgnoreCase("June")) {
            if (day < 21) {
                zodiac_sign = "Gemini";
            } else {
                zodiac_sign = "Cancer";
            }
        }
        if (month.toString().equalsIgnoreCase("July")) {
            if (day < 21) {
                zodiac_sign = "Cancer";
            } else {
                zodiac_sign = "Leo";
            }
        }
        if (month.toString().equalsIgnoreCase("August")) {
            if (day < 23) {
                zodiac_sign = "Leo";
            } else {
                zodiac_sign = "Virgo";
            }
        }
        if (month.toString().equalsIgnoreCase("September")) {
            if (day < 23) {
                zodiac_sign = "Virgo";
            } else {
                zodiac_sign = "Libra";
            }
        }
        if (month.toString().equalsIgnoreCase("October")) {
            if (day < 23) {
                zodiac_sign = "Libra";
            } else {
                zodiac_sign = "Scorpio";
            }
        }
        if (month.toString().equalsIgnoreCase("November")) {
            if (day < 22) {
                zodiac_sign = "Scorpio";
            } else {
                zodiac_sign = "Sagittarius";
            }
        }
        if (month.toString().equalsIgnoreCase("December")) {
            if (day < 22) {
                zodiac_sign = "Sagittarius";
            } else {
                zodiac_sign = "Capricorn";
            }
        }



        char start = zodiac_sign.charAt(0);
        System.out.println(start);
        if (start == 'A' || start == 'E' || start == 'I' || start == 'O' || start == 'U') {
            vowel_start = "n";
        }


        System.out.println("You are a" + vowel_start + " " + zodiac_sign);


    }
}
