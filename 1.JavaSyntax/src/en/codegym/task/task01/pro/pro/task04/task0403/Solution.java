package en.codegym.task.task01.pro.pro.task04.task0403;

import java.util.Scanner;

/* 
Summation
*/

public class Solution {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String a = scanner.nextLine();
        int total = 0;
        while (!a.equalsIgnoreCase("enter")) {
            int b = Integer.parseInt(a);
            total += b;
            a = scanner.nextLine();
        }
        System.out.println(total);
    }

}
