package en.codegym.task.pro.task11.task1122;

/* 
Instance field shadowing
*/

public class Solution {
    public static int salary;

    public static void add(int increase) {
        int salary = Solution.salary;
        salary += increase;
        Solution.salary=salary;
    }

    public static void main(String[] args) {
        add(100500);
        System.out.println(salary);
    }
}