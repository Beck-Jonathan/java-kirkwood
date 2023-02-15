package en.codegym.task.pro.task04.task0410;

import java.util.Scanner;

/* 
Second smallest number entered
*/

public class Solution {
    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);
        int min = Integer.MAX_VALUE;
        int second_place = 0;
        while (console.hasNextInt()) {
            int x = console.nextInt();
            if ((x < min)) {
                second_place = min;
                min = x;
            }
            if (x > min && x < second_place) {
                second_place = x;
            }

        }
        System.out.println(second_place);
    }
}