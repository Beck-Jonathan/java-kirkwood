package en.codegym.task.pro.task04.task0415;

import java.util.Scanner;

/* 
Area of a circle
*/

public class Solution {
    public static void main(String[] args) {
        Scanner getter = new Scanner(System.in);
        int  radius = getter.nextInt();
        int area= (int)( 3.14*radius*radius);
        System.out.println(area);

    }
}