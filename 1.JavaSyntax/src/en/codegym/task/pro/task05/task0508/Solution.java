package en.codegym.task.pro.task05.task0508;

import java.util.Scanner;

/* 
Remove duplicate strings
*/

public class Solution {
    public static String[] strings;

    public static void main(String[] args) {
        strings = new String[6];
        Scanner getter = new Scanner(System.in);
        for (int i = 0; i < 6; i++) {
            strings[i] = getter.nextLine();
        }
        for (int i = 0; i < 5; i++) {
            for (int j = i; j < 6; j++)
                if (strings[i] == strings[j]){
                strings[i] = null;
                strings[j] = null;
            }
        }
        for (int i = 0; i < strings.length; i++) {
            System.out.print(strings[i] + ", ");
        }
    }
}