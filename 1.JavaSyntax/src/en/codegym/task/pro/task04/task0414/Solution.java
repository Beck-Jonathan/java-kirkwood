package en.codegym.task.pro.task04.task0414;

import java.util.Scanner;

/* 
There's never too much of a good thing
*/

public class Solution {
    public static void main(String[] args) {
        Scanner getter = new Scanner(System.in); 
        String text = getter.nextLine();
        int count = getter.nextInt();
        
        if (count>=5) 
            {System.out.println(text);}
        else if (count<=0) {System.out.println(text);}
        else {
        do {
        System.out.println(text);
        count--;
        }
        while (count>0);}

    }
}