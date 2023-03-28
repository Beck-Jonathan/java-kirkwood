package en.codegym.task.task01.pro.pro.task04.task0415;

import java.util.Scanner;

/* 
Area of a circle
*/

public class Solution {
    public static void main(String[] args) {
        Scanner getter = new Scanner(System.in);
        int radius = getter.nextInt();
        if (radius >= 0) {    //updated to print nothing if a negatve value is entered
            int area = (int) (3.14 * radius * radius);
            System.out.println(area);
        }
    }
}