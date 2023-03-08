package en.codegym.task.pro.task05.task0504;

/* 
Combining arrays
*/

public class Solution {
    public static int[] firstArray = new int[]{0, 1, 2, 3, 4, 5, 6, 7, 8, 9};
    public static int[] secondArray = new int[]{10, 11, 12, 13, 14, 15, 16, 17, 18, 19};
    public static int[] resultArray;

    public static void main(String[] args) {

        resultArray = new int[firstArray.length + secondArray.length];
        int i = 0;
        while (i < firstArray.length) {
            resultArray[i] = firstArray[i];
            i++;
        }
        i = firstArray.length ;
        while (i < firstArray.length + secondArray.length ) {
            resultArray[i] = secondArray[i - firstArray.length];
            i++;
        }
        for (i = 0; i < resultArray.length; i++) {
            System.out.print(resultArray[i] + ", ");
        }
    }
}

