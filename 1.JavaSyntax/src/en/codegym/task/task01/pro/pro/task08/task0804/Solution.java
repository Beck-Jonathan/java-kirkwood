package en.codegym.task.task01.pro.pro.task08.task0804;

/* 
Randomizer
*/

public class Solution {

    public static void main(String[] args) {
        System.out.println(generateNumber());
    }

    public static int generateNumber() {
        int rand= (int) (Math.random()*100);
        
        return  rand;
    }
}
