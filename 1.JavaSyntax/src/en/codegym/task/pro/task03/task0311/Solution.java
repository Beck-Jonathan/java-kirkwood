package en.codegym.task.pro.task03.task0311;

import java.util.Scanner;

/* 
High accuracy
*/

public class Solution {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double  a = scanner.nextDouble();
        double  b = scanner.nextDouble();
        //Math Math;
        if (Math.abs(a-b) < 0.000001) {
            System.out.println("The numbers are equal");
        } else {
            System.out.println("The numbers are not equal");
        }
    }
}
