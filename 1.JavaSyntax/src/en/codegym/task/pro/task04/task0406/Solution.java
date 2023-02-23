package en.codegym.task.pro.task04.task0406;

import java.util.Scanner;

/* 
We show what we get
*/

public class Solution {
    public static void main(String[] args) {
        Scanner getter = new Scanner(System.in);
        String text;
        while (true) {
            text = getter.nextLine();
            if (text.equals("enough")) {
                break;
            } else {
                System.out.println(text);
            }
        }

    }
}