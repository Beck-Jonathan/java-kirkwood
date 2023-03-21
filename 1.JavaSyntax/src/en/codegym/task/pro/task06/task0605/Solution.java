package en.codegym.task.pro.task06.task0605;

/* 
Correct order
*/

import java.util.Arrays;
import java.util.Collections;

public class Solution {

    public static void main(String[] args) {
        Integer[] array = {1, 2, 3, 4, 5, 6, 7, 8, 9, 0};
        printArray(array);
        reverseArray(array);
        printArray(array);
    }

    public static void reverseArray(Integer[] array) {
        for (int i = 0; i < array.length / 2; i++) {
           // int holder = array[i];
            //array[i] = array[array.length - i - 1];
            //array[array.length - i - 1] = holder;
            Collections.reverse(Arrays.asList(array));  // from class teachings
        }
    }

    public static void printArray(Integer[] array) {
        for (int i : array) {
            System.out.print(i + ", ");
        }
        System.out.println();
    }
}
