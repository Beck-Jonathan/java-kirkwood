package en.codegym.task.pro.task05.task0506;

import java.util.Scanner;

/* 
Minimum of N numbers
*/

public class Solution {
    public static int[] array;

    public static void main(String[] args) {
        Scanner getter = new Scanner(System.in);
        int n=getter.nextInt();
        array = new int [n];
        for (int i=0;i<n;i++){
            array[i]=getter.nextInt();
        }
        int x =array.length;
        int min =Integer.MAX_VALUE;
        for (int y=0;y<x;y++){
            if (array[y]<min){
                min = array[y];
            }
        }
        System.out.println(min);
    }
}
