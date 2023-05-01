package en.codegym.task.pro.task11.task1109;

/* 
Objects of inner and nested classes
*/

public class Solution {
    public static void main(String[] args) {
            Outer outer = new Outer();
            Outer.Inner inner = outer.new Inner();
        Outer.Nested nested = new Outer.Nested();
    }
}
