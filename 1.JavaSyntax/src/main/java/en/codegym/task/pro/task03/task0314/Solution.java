package en.codegym.task.pro.task03.task0314;

import java.util.Scanner;

/* 
Broken keyboard
*/

public class Solution {
    public static String secret = "AmIGo";

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String a = scanner.nextLine();
        if (a.equalsIgnoreCase(secret)) {
            System.out.println("Access granted");
        } else {
            //write your code here
            System.out.println("Access denied");
        }
    }
}
