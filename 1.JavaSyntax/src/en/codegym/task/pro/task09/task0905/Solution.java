package en.codegym.task.pro.task09.task0905;

/* 
Octal converter
*/

public class Solution {
    public static void main(String[] args) {
        int decimalNumber = 21;
        System.out.println("Decimal number " + decimalNumber + " is equal to octal number " + toOctal(decimalNumber));
        int octalNumber = 25;
        System.out.println("Octal number " + octalNumber + " is equal to decimal number " + toDecimal(octalNumber));
    }

    public static int toOctal(int decimalNumber) {
        if (decimalNumber<=0){return 0;}
        int octal = 0;
        int i = 0;
        while (decimalNumber != 0) {
            octal = (int) ((int) octal + (decimalNumber % 8) * Math.pow(10, i));
            decimalNumber = decimalNumber / 8;
            i++;

        }
        return octal;
    }

    public static int toDecimal(int octalNumber) {
        if (octalNumber<=0){return 0;}
        int i = 0;
        int decimalNumber = 0;
        while (octalNumber != 0) {
            decimalNumber = (int) (decimalNumber + octalNumber % 10 * Math.pow(8, i));
            octalNumber = octalNumber / 10;
            i++;


        }


        return decimalNumber;
    }
}
