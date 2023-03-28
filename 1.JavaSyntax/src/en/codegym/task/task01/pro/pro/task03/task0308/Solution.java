package en.codegym.task.task01.pro.pro.task03.task0308;

import java.util.Scanner;

/* 
Quadrants
*/

public class Solution {
    public static void main(String[] args) {
        Scanner getter = new Scanner(System.in);
        int x = getter.nextInt();
        int y = getter.nextInt();
        if ((x > 0) && (y > 0)) {
            System.out.println("1");
        }
        if ((x < 0) && (y > 0)) {
            System.out.println("2");
        }
        if ((x < 0) && (y < 0)) {
            System.out.println("3");
        }
        if ((x > 0) && (y < 0)) {
            System.out.println("4");
        }
        //write your code here
    }
}
