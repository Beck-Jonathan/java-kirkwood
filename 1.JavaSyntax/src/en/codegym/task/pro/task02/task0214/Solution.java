package en.codegym.task.pro.task02.task0214;

import java.util.Scanner;

/* 
Reading and converting strings
*/

public class Solution {

    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);
        String first = console.nextLine();
        first= first.toLowerCase();
        String second = console.nextLine();
        second = second.toUpperCase();
        String third = console.nextLine();
        System.out.println(third);
        System.out.println(second);
        System.out.println(first);

    }
}
