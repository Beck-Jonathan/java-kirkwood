package en.codegym.task.task01.pro.pro.task03.task0309;

import org.w3c.dom.ls.LSOutput;

import java.util.Scanner;

/* 
Looking for the maximum
*/

public class Solution {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int numberA = scanner.nextInt();
        int numberB = scanner.nextInt();
        System.out.println(numberA > numberB ? numberA : numberB);


    }
}
