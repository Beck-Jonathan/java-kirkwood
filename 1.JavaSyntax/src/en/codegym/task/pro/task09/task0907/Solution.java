package en.codegym.task.pro.task09.task0907;

/* 
Hexadecimal converter
*/

public class Solution {
    private static final String HEX = "0123456789abcdef";

    public static void main(String[] args) {
        int decimalNumber = 1256;
        System.out.println("Decimal number " + decimalNumber + " is equal to hexadecimal number " + toHex(decimalNumber));
        String hexNumber = "4e8";
        System.out.println("Hexadecimal number " + hexNumber + " is equal to decimal number " + toDecimal(hexNumber));
    }

    public static String toHex(int decimalNumber) {
        if (decimalNumber<=0){return "";}
        String Hex="";

        while (decimalNumber!=0){
            String addon= String.valueOf((decimalNumber%16));
            if (decimalNumber%16==10){
                addon="a";
            }
            if (decimalNumber%16==11){
                addon="b";
            }
            if (decimalNumber%16==12){
                addon="c";
            }
            if (decimalNumber%16==13){
                addon="d";
            }
            if (decimalNumber%16==14){
                addon="e";
            }
            if (decimalNumber%16==15){
                addon="F";
            }
            Hex = addon+Hex;
            decimalNumber=decimalNumber/16;

        }
        return Hex;
    }

    public static int toDecimal(String hexNumber) {
        if (hexNumber ==null||hexNumber.isEmpty()){
            return 0;
        }
        int decimal = 0;
        int DecimalForm=0;
        for (int i=0; i<hexNumber.length();i++){
            char TestValue = hexNumber.charAt(i);
            if (TestValue=='0'){DecimalForm=0;}
            if (TestValue=='1'){DecimalForm=1;}
            if (TestValue=='2'){DecimalForm=2;}
            if (TestValue=='3'){DecimalForm=3;}
            if (TestValue=='4'){DecimalForm=4;}
            if (TestValue=='5'){DecimalForm=5;}
            if (TestValue=='6'){DecimalForm=6;}
            if (TestValue=='7'){DecimalForm=7;}
            if (TestValue=='8'){DecimalForm=8;}
            if (TestValue=='9'){DecimalForm=9;}
            if (TestValue=='a'){DecimalForm=10;}
            if (TestValue=='b'){DecimalForm=11;}
            if (TestValue=='c'){DecimalForm=12;}
            if (TestValue=='d'){DecimalForm=13;}
            if (TestValue=='e'){DecimalForm=14;}
            if (TestValue=='f'){DecimalForm=15;}
            decimal = 16*decimal + DecimalForm;


        }
        return decimal;
    }
}
