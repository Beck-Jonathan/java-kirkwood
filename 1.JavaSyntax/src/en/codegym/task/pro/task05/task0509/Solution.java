package en.codegym.task.pro.task05.task0509;

/* 
Multiplication table
*/

public class Solution {

    public static int[][] MULTIPLICATION_TABLE;

    public static void main(String[] args) {
        MULTIPLICATION_TABLE = new int[10][10];
        for (int x = 1; x < 11; x++) {
            for (int y = 1; y < 11; y++) {
                MULTIPLICATION_TABLE[x][y] = (x * y);
                System.out.print(MULTIPLICATION_TABLE[x][y]);
                System.out.println(", ");
            }
            System.out.println();
        }
    }

}
