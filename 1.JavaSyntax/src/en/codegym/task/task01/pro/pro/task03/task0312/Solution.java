package en.codegym.task.task01.pro.pro.task03.task0312;

import java.util.Scanner;

/* 
Let's compare strings
*/

public class Solution {
    public static void main(String[] args) {
        //write your code here
        Scanner scanner = new Scanner(System.in);
        String a = scanner.nextLine();
        String b = scanner.nextLine();
        if (a.equals(b)) {
            System.out.println("The strings are the same");
        } else {
            System.out.println("The strings are different");
        }
    }
}
