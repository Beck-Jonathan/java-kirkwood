package en.codegym.task.task01.pro.pro.task05.task0519;

import java.util.Arrays;

/* 
Is anyone there?
*/

public class Solution {

    public static int[] array = {9, 8, 7, 6, 5, 4, 3, 2, 1};
    public static int element = 5;

    public static void main(String[] args) {
        int[] sorted = Arrays.copyOf(array, array.length);
        Arrays.sort(sorted);
        boolean x = Arrays.binarySearch(sorted, element) >= 0;
        System.out.println(x); //write your code here
    }
}
