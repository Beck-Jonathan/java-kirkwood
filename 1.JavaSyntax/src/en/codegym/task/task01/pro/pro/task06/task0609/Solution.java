package en.codegym.task.task01.pro.pro.task06.task0609;

/* 
A cubed cube calculator
*/

public class Solution {
    public static void main(String[] args) {
    //testing, code gym probably won't like this
        // System.out.println(ninthDegree(2));

    }

    public static long cube(long a) {
        return a * a * a;
    }

    public static long ninthDegree(long b) {
        long c = cube(b);
        long d = cube(c);
        return d;
        // return cube(cube(b) to match professor method
    }
}
