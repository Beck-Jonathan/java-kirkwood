package en.codegym.task.task01.pro.pro.task07.task0708;

/* 
Correct types
*/

public class Solution {
    public static byte a;
    public static short b;
    public static int c;
    public static long d;

    public static void main(String[] args) {
        setValues(100);
    }

    public static void setValues(long value){
       a=(byte)value;
       b=(short)value;
       c =(int)value;
       d = value;
    }
}
