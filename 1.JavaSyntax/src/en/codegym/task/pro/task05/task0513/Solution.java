package en.codegym.task.pro.task05.task0513;

import java.util.Arrays;

/* 
Displaying arrays
*/

public class Solution {

    public static String[] strings = new String[]{"I", "love", "Java"};
    public static int[] ints = new int[]{1, 2, 3, 4, 5, 6, 7, 8};

    public static void main(String[] args) {
        String str = Arrays.toString(strings);
        String variables = Arrays.toString(ints);
        System.out.println(str);
        System.out.println(variables);
    }
}
