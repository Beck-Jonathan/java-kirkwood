package en.codegym.task.pro.task04.task0418;

import java.util.Scanner;

/* 
Is the glass half empty or half full?
*/

public class Solution {
    public static void main(String[] args) {
        double glass = 0.5;
        int decision = 0;
        Scanner getter = new Scanner(System.in);
        boolean mood = getter.nextBoolean();
        if (mood) {
            decision = (int) Math.ceil(glass);
        } else {
            decision = (int) Math.floor(glass);
        }
        System.out.println(decision);
    }
}