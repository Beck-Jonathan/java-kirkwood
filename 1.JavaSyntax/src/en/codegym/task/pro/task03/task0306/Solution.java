package en.codegym.task.pro.task03.task0306;

import java.util.Scanner;

/* 
Triangle
*/

public class Solution {
    private static final String TRIANGLE_EXISTS = "It's a triangle";
    private static final String TRIANGLE_DOES_NOT_EXIST = "It's not a triangle";

    public static void main(String[] args) {
        Scanner getter = new Scanner(System.in);
        int a = getter.nextInt();
        int b = getter.nextInt();
        int c = getter.nextInt();
        if ((a < (b + c)) && (b < (a + c)) && (c < (a + b)))
            System.out.println(TRIANGLE_EXISTS);
        else {
            System.out.println(TRIANGLE_DOES_NOT_EXIST);
        }
        ;
        //write your code here
    }
}
