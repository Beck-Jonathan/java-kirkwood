package en.codegym.task.pro.task11.task1104;

/* 
String converter
*/

public class Solution {
    public static void main(String[] args) {
        String string = "12.84";
        Double d = Double.parseDouble(string);
        long l = Math.round(d);
        System.out.println(l);
    }
}
