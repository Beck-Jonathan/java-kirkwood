package en.codegym.task.task01.pro.pro.task05.task0520;

/* 
Changing shoes on the move
*/

public class Solution {

    public static int result= 105; //from second debug step

    public static void main(String[] args) {
        byte correction = Byte.MAX_VALUE;
        for (double fahrenheit = -459.67; fahrenheit < 451; fahrenheit += 40) {
            correction *= fahrenheit;
            System.out.println(correction);
            //first correction -47
            //second correction 105
        }
    }
}
