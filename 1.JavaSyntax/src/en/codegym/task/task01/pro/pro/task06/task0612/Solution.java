package en.codegym.task.task01.pro.pro.task06.task0612;

/* 
Everything has a root
/not much to do here, just fixing a variable name
*/

public class Solution {
    public static void main(String[] args) {
        int[] array = {15, 64, 9, 51, 42};
        printSqrt(array);
    }

    public static void printSqrt(int[] array) {
        String elementSqrt = "The square root of ";
        for (int i = 0; i < array.length; i++) {
            int element = array[i];
            double elementSqrtNum = Math.sqrt(element);
            System.out.println(elementSqrt + element + " is " + elementSqrtNum);
        }
    }
}
