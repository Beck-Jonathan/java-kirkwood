package en.codegym.task.pro.task04.task0409;

import java.util.Scanner;

/* 
Minimum of entered numbers
*/

public class Solution {
    public static void main(String[] args) {
        Scanner banana = new Scanner(System.in); //renamed scanner object
        int min = Integer.MAX_VALUE;
        while (banana.hasNextInt()) {
            int x = banana.nextInt();  // per codegym intructions
            if (x % 2 == 0) {
                int test = x;
                if (test < min) {
                    min = test;  // updated to differentiate from codegym
                }

            }
            System.out.println(min);
        }
    }
}