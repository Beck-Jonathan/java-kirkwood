package chapter_5_6;

import java.util.Scanner;

public class feb_28 {
    public static void main(String[] args) {
        int a = 21;
        int sub = 1;
        while (a >= 0) {
            System.out.println(a);
            a = a - sub;
            sub ++;
            Scanner getter = new Scanner(System.in);
            int x = getter.nextInt();

        }
    }
}
