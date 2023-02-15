package en.codegym.task.pro.task05.task0508;

import java.util.Scanner;

/* 
Remove duplicate strings
*/

public class Solution {
    public static String[] strings;

    public static void main(String[] args) {
        Scanner banana = new Scanner(System.in);
        strings = new String[6];
        int length=strings.length;
        for (int i =0;i<6;i++) {
            String text = banana.nextLine();
            strings[i]=text;
        }
        for (int i=0;i<length-1;i++){
            for (int j=i+1;j<length;j++){
                if (strings[1]==null) {break;}
                if (strings[j]==null){break;}
                if (strings[i].equalsIgnoreCase((strings[j]))){
                    strings[i]=null;
                    strings[j]=null;
                }
            }
        }

        for (int i = 0; i < strings.length; i++) {
            System.out.print(strings[i] + ", ");
        }
    }
}
