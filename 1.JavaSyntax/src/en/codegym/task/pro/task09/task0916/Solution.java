package en.codegym.task.pro.task09.task0916;

/* 
String.format()
*/

public class Solution {
    public static void main(String[] args) {
        System.out.println(format("Amigo", 5000));
    }

    public static String format(String name, int salary) {
        String phrase = String.format("My name is %s. I will earn $%d a month.",name,salary);
        //write your code here
        return phrase;
    }
}
