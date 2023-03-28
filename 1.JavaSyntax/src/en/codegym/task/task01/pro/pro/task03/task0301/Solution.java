package en.codegym.task.task01.pro.pro.task03.task0301;

import java.util.Scanner;

/* 
Warm or cold
*/

public class Solution {
    public static void main(String[] args) {
        String cold = "It's cold outside";
        String warm = "It's warm outside";
        Scanner scanner = new Scanner(System.in);
        int temp = scanner.nextInt();
        if (temp < 0) {
            System.out.println("It's cold outside");
        } else {
            System.out.println("It's warm outside");
        }
    }
}
