package en.codegym.task.pro.task05.task0504;

/* 
Combining arrays
*/

public class Solution {
    public static int[] firstArray = new int[]{0, 1, 2, 3, 4, 5, 6, 7, 8, 9};
    public static int[] secondArray = new int[]{10, 11, 12, 13, 14, 15, 16, 17, 18, 19};
    public static int[] resultArray;

    public static void main(String[] args) {
        int first_length=firstArray.length;
        int total_length = firstArray.length+secondArray.length;
        resultArray = new int[total_length];
        for (int i =0;i<total_length;i++){
            for (int j =0;j<first_length;j++){
                resultArray[j]=firstArray[j];
            }
            for (int j=first_length;j<total_length;j++){
                resultArray[j]=secondArray[j-first_length];
            }
        }
        for (int i = 0; i < resultArray.length; i++) {
            System.out.print(resultArray[i] + ", ");
        }
    }
}


