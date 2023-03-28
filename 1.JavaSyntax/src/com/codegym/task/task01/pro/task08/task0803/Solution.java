package en.codegym.task.pro.task08.task0803;

import java.util.Scanner;

/* 
Smallest element of an array
*/

public class Solution {

    public static void main(String[] args) {
        int[] intArray = getArrayOfTenElements();
        System.out.println(min(intArray));
    }

    public static int min(int[] ints) {
        int min = 999999;
        int i =0;
        while (i<10){
            min = Math.min(min,ints[i]);
            i++;
        }
        return min;
    }

    public static int[] getArrayOfTenElements() {
        Scanner scanner = new Scanner(System.in);
        int i=0;
        int[] array = new int[10];
        while ( i<10){
            
            array[i]=scanner.nextInt();
            i++;
        }
        return array;
    }
}
