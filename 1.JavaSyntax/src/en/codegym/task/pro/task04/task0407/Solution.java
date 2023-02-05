package en.codegym.task.pro.task04.task0407;

/* 
Sum of numbers not divisible by 3
*/

public class Solution {
    public static void main(String[] args) {
        int i=0;
        int total=0;
        while (i<100)
        {
            i++;
            if(( i%3)==0)
            continue;
            total=total+i;
        }
        System. out. println(total);

    }
}