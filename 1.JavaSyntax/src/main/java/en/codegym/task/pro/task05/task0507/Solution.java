package en.codegym.task.pro.task05.task0507;

import java.util.Scanner;

/* 
Maximum of N numbers
*/

public class Solution {
    public static int[] array;

    public static void main(String[] args) {
        Scanner getter = new Scanner(System.in);
        int n = getter.nextInt();
        array = new int[n];
        int max = Integer.MIN_VALUE;
        for (int i = 0; i < n; i++) {
            array[i] = getter.nextInt();
        }
        for (int y = 0; y < n; y++) {
            if (array[y] > max) {
                max = array[y];
            }
        }
        System.out.println(max);
    }
}

