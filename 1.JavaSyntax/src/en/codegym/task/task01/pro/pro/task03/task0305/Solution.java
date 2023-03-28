package en.codegym.task.task01.pro.pro.task03.task0305;

import java.util.Scanner;

/* 
Three numbers
*/

public class Solution {
    public static void main(String[] args) {
        Scanner getter = new Scanner(System.in);
        int a = getter.nextInt();
        int b = getter.nextInt();
        int c = getter.nextInt();
        if (a == b && a == c) {
            System.out.print(a);
            System.out.print(" ");
            System.out.print(b);
            System.out.print(" ");
            System.out.print(c);
        } else if (a == b) {
            System.out.print(a);
            System.out.print(" ");
            System.out.print(b);
        } else if (a == c) {
            System.out.print(a);
            System.out.print(" ");
            System.out.print(c);
        } else if (b == c) {
            System.out.print(b);
            System.out.print(" ");
            System.out.print(c);
        }


    }
}
