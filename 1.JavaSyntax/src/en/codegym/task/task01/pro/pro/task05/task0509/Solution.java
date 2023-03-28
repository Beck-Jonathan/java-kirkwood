package en.codegym.task.task01.pro.pro.task05.task0509;

/* 
Multiplication table
*/

public class Solution {

    public static int[][] MULTIPLICATION_TABLE;

    public static void main(String[] args) {
        MULTIPLICATION_TABLE = new int[10][10];
        for (int x = 1; x < 11; x++) {
            for (int y = 1; y < 11; y++) {
                MULTIPLICATION_TABLE[x-1][y-1] = (x * y);
                System.out.print(MULTIPLICATION_TABLE[x-1][y-1]);
                System.out.print(", ");
            }
            System.out.println();
        }
    }

}
