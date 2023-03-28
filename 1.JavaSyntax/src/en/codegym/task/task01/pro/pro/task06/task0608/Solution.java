package en.codegym.task.task01.pro.pro.task06.task0608;

/* 
A cube calculator
*/

public class Solution {
    public static void main(String[] args) {
        System.out.printf("%,.0f", (double)cube(200L));
    }

    public static long cube(long x) {
        long cube = x * x * x;
        return cube;
        // (long) Math.pow(x,3);

    }
}
