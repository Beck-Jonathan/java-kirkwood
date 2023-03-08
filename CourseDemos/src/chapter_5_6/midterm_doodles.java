package chapter_5_6;

import java.util.Scanner;

public class midterm_doodles {
    public static void main(String[] args) {

        System.out.println("hello");
        String school = "Iowa State";
        if (school.equals("Iowa State")) {
            System.out.println("go state");
        } else if (school.equals("iowa")) {
            System.out.println("go hawks");
        } else if (school.equals("coe")) {
            System.out.println("go eagles");
        } else {
            System.out.println(" go team");
        }
    }
}