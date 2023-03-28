package en.codegym.task.task01.pro.pro.task05.task0511;

import java.util.Scanner;

/* 
Creating a two-dimensional array
*/

public class Solution {
    public static int[][] multiArray;

    public static void main(String[] args) {
        Scanner banana = new Scanner(System.in);
        int r = banana.nextInt();
        multiArray = new int[r][];
        for (int i = 0; i < r; i++) {
            {
                int j = banana.nextInt();
                multiArray[i] = new int[j];
            }

        }
    }
}
