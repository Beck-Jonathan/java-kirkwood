package en.codegym.task.task01.pro.pro.task04.task0410;

import java.util.Scanner;

/* 
Second smallest number entered
*/

public class Solution {
    public static void main(String[] args) {
        Scanner banana = new Scanner(System.in);
        int min = Integer.MAX_VALUE;
        int second_place = min - 1;
        while (banana.hasNextInt()) {
            int x = banana.nextInt();
            if ((x < min)) {
                second_place = min;
                min = x;
            }
            if (x > min) {
                if (x < second_place) {
                    second_place = x;
                }
            }  // added nested loop to differentate from codegym

        }
        System.out.println(second_place);
    }
}