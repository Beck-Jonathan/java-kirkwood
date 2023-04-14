package en.codegym.task.pro.task09.task0908;

/* 
Binary to hexadecimal converter
*/

public class Solution {
    public static void main(String[] args) {
        String binaryNumber = "100111010000";
        System.out.println("Binary number " + binaryNumber + " is equal to hexadecimal number " + toHex(binaryNumber));
        String hexNumber = "9d0";
        System.out.println("Hexadecimal number " + hexNumber + " is equal to binary number " + toBinary(hexNumber));
    }

    public static String toHex(String binaryNumber) {
        if (binaryNumber ==null||binaryNumber.isEmpty()){
            return "";
        }
        for (int i =0;i<binaryNumber.length();i++){
            if (binaryNumber.charAt(i)!='0'&&binaryNumber.charAt(i)!='1'){
                return "";
            }
        }
        char hexChar='a';
        String hexString="";
        int remainder= binaryNumber.length()%4;
        int toAdd=4-remainder;
        if (remainder!=0){
            for (int i=0;i<toAdd;i++){
                binaryNumber="0"+binaryNumber;
            }
        }
        for (int i=0;i<binaryNumber.length();i=i+4){
            String test=binaryNumber.substring(i,i+4);

            if (test.equals("0000")){
                hexChar='0';
            }
            if (test.equals("0001")){
                hexChar='1';
            }
            if (test.equals("0010")){
                hexChar='2';
            }
            if (test.equals("0011")){
                hexChar='3';
            }
            if (test.equals("0100")){
                hexChar='4';
            }
            if (test.equals("0101")){
                hexChar='5';
            }
            if (test.equals("0110")){
                hexChar='6';
            }
            if (test.equals("0111")){
                hexChar='7';
            }
            if (test.equals("1000")){
                hexChar='8';
            }
            if (test.equals("1001")){
                hexChar='9';
            }
            if (test.equals("1010")){
                hexChar='a';
            }
            if (test.equals("1011")){
                hexChar='b';
            }
            if (test.equals("1100")){
                hexChar='c';
            }
            if (test.equals("1101")){
                hexChar='d';
            }
            if (test.equals("1110")){
                hexChar='e';
            }
            if (test.equals("1111")){
                hexChar='f';
            }
            hexString=hexString+hexChar;

        }
        return hexString;
    }

    public static String toBinary(String hexNumber) {
        if (hexNumber ==null||hexNumber.isEmpty()){
            return "";
        }
        for (int i =0;i<hexNumber.length();i++){
            if (hexNumber.charAt(i)!='0'
                    &&hexNumber.charAt(i)!='1'
                    &&hexNumber.charAt(i)!='2'
                    &&hexNumber.charAt(i)!='3'
                    &&hexNumber.charAt(i)!='4'
                    &&hexNumber.charAt(i)!='5'
                    &&hexNumber.charAt(i)!='6'
                    &&hexNumber.charAt(i)!='7'
                    &&hexNumber.charAt(i)!='8'
                    &&hexNumber.charAt(i)!='9'
                    &&hexNumber.charAt(i)!='a'
                    &&hexNumber.charAt(i)!='b'
                    &&hexNumber.charAt(i)!='c'
                    &&hexNumber.charAt(i)!='d'
                    &&hexNumber.charAt(i)!='e'
                    &&hexNumber.charAt(i)!='f'
            ){
                return "";
            }
        }
        String binChar="";
        String binString="";

        for (int i=0;i<hexNumber.length();i++){
            String test= String.valueOf(hexNumber.charAt(i));

            if (test.equals("0")) {
            binChar="0000";
            }
            if (test.equals("1")) {
                binChar="0001";
            }
            if (test.equals("2")) {
                binChar="0010";
            }
            if (test.equals("3")) {
                binChar="0011";
            }
            if (test.equals("4")) {
                binChar="0100";
            }
            if (test.equals("5")) {
                binChar="0101";
            }
            if (test.equals("6")) {
                binChar="0110";
            }
            if (test.equals("7")) {
                binChar="0111";
            }
            if (test.equals("8")) {
                binChar="1000";
            }
            if (test.equals("9")) {
                binChar="1001";
            }
            if (test.equals("a")) {
                binChar="1010";
            }
            if (test.equals("b")) {
                binChar="1011";
            }
            if (test.equals("c")) {
                binChar="1100";
            }
            if (test.equals("d")) {
                binChar="1101";
            }
            if (test.equals("e")) {
                binChar="1110";
            }
            if (test.equals("f")) {
                binChar="1111";
            }
            binString=binString+binChar;

        }
        return binString;
    }
}
