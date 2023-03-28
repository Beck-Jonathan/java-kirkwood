package en.codegym.task.task01.pro.pro.task04.task0408;

import java.util.Scanner;

/* 
Maximum of entered numbers
*/

public class Solution {
    public static void main(String[] args) {
        Scanner banana = new Scanner(System.in); //renamed scanner object
        int max = Integer.MIN_VALUE;
        while (banana.hasNextInt()) {
            int x = banana.nextInt();  // per codegym intructions
            if (x%2 ==0) {
                int test =x;
                if (test>max){
                    max=test;  // this section rewritten to differentiate from code gym a bit
                }
            }

        }
        System.out.println(max);
    }
}