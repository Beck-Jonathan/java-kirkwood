package en.codegym.task.pro.task09.task0906;

/* 
Binary converter
*/

public class Solution {
    public static void main(String[] args) {
        int decimalNumber = Integer.MAX_VALUE;
        System.out.println("Decimal number " + decimalNumber + " is equal to binary number " + toBinary(decimalNumber));
        String binaryNumber = "1111111111111111111111111111111";
        System.out.println("Binary number " + binaryNumber + " is equal to decimal number " + toDecimal(binaryNumber));
    }

    public static String toBinary(int decimalNumber) {
        if (decimalNumber<=0){return "";}
        String binary = "";
        while (decimalNumber !=0){
            binary=(decimalNumber%2)+binary;
            decimalNumber=decimalNumber/2;
        }
        return binary;
    }

    public static int toDecimal(String binaryNumber) {
        if (binaryNumber == null || binaryNumber.isEmpty()) {
        return 0;}

        int decimal = 0 ;
        for (int i=0; i < binaryNumber.length();i++){

            decimal = (int) (decimal + (Integer.parseInt(String.valueOf(binaryNumber.charAt(binaryNumber.length()-i-1))))*Math.pow(2,i));

        }
        return decimal;
    }
}
