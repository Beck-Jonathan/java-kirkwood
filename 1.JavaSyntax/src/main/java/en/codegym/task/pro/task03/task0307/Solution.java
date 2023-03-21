package en.codegym.task.pro.task03.task0307;

import java.util.Scanner;

/* 
To work or not to work? That is the question
*/

public class Solution {
    public static void main(String[] args) {
       Scanner getter = new Scanner(System.in);
        int a = getter.nextInt();
        if (a < 20 || a > 60) {
           System.out.println("You don't have to work");
        }
    }
}
