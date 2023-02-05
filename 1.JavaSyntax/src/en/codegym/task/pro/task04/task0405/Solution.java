package en.codegym.task.pro.task04.task0405;

/* 
Unfilled rectangle
*/

public class Solution {
    public static void main(String[] args) {
        int height = 1;
        while (height <= 10) {
            int width = 1;
            while (width <= 20) {
                if (height == 1 || height == 10) {
                    System.out.print('B');
                } else if (width == 1 || width == 20) {
                    System.out.print('B');
                } else {
                    System.out.print(' ');
                }
                width++;
            }
            System.out.println();
            height++;
        }
    }
}

