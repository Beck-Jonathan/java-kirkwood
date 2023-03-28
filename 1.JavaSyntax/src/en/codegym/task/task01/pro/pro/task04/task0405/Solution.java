package en.codegym.task.task01.pro.pro.task04.task0405;

public class Solution {
    public static void main(String[] args) {


/*
Unfilled rectangle
*/

//        BBBBBBBBBBBBBBBBBBBB
//        B                  B
//        B                  B
//        B                  B
//        B                  B
//        B                  B
//        B                  B
//        B                  B
//        B                  B
//        BBBBBBBBBBBBBBBBBBBB


        int height = 10;
        int width = 20;


        int i = 0; // row count
        while (i < height) {
            int j = 0; // column count
            if (i == 0 || i == height - 1) {
                // Print the first and last row
                while (j < width) {
                    System.out.print("B");
                    j++;
                }
            } else {
                // print the first and last column
                while (j < width) {
                    if (j == 0 || j == width - 1) {
                        System.out.print("B");
                    } else {
                        System.out.print(" ");
                    }
                    j++;
                }
            }
            i++;
            System.out.println();
        }

    }
}