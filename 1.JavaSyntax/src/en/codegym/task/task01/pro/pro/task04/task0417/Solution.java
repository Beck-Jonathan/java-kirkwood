package en.codegym.task.task01.pro.pro.task04.task0417;

import java.util.Scanner;

/* 
Wind speed
*/

public class Solution {
    public static void main(String[] args) {
        Scanner getter = new Scanner(System.in);
        int speed = getter.nextInt();
        int ms = (int) Math.round(1.0 * speed * 3.6);
        System.out.println(ms);


    }
}