package en.codegym.task.task01.pro.pro.task05.task0510;

/* 
Triangular array
*/

public class Solution {

    public static int[][] result = new int[10][];

    public static void main(String[] args) {
        for (int i = 0; i < 10; i++) {
            result[i] = new int[i + 1];
        }
        for (int i = 0; i < 10; i++) {
            for (int j = 0; j < i + 1; j++) {
                result[i][j] = i + j;
                System.out.print(result[i][j] + " ");
            }
            System.out.println();


        }
    }
}
