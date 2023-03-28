package en.codegym.task.task01.pro.pro.task07.task0706;

/* 
Strange division
*/

public class Solution {
    public static void main(String[] args) {
        double a = 100d/0.0d;
        double b = 100d/0.0d;
        div(a,b);
    }

    public static void div(double a, double b){
        System.out.println(b/a);
    }
}
