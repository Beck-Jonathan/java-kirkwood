package en.codegym.task.pro.task02.task0215;

import java.util.Scanner;

/* 
Reading numbers
*/

public class Solution {

    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);
        int a = console.nextInt();
        int b=console.nextInt();
        int c=console.nextInt();
        int average=(a + b + c) / 3;
        System.out.println(average);

    }
}
