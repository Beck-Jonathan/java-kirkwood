package en.codegym.task.pro.task05.task0505;

import java.util.Scanner;

/* 
Reverse
*/

public class Solution {
    public static void main(String[] args) {
        Scanner getter = new Scanner(System.in);
        int n = getter.nextInt();
        if (n > 0) {
            int[] array = new int[n];

            for (int i = 0; i < n; i++) {
                array[i] = getter.nextInt();
            }
            if (n % 2 == 1) {
                for (int x = 0; x < n; x++) {
                    System.out.println(array[x]);
                }
            }
            if (n % 2 == 0) {
                for (int y = n; y > 0; y--) {
                    System.out.println(array[y - 1]);
                }
            }

        }
    }
}
