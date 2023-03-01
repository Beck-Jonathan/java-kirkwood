package chapter_5_6;


import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class feb_28 {
    public static void main(String[] args) {
        //differences between java arrayas and python lists
        //jave requires you to specify the data type
        // Java requires all of them to be the same data type

        String[] daysOfWeek = {"Sunday", "Monday", "Tuesday", "Wednesday", "Thursday", "Friday", "Saturday"};
        Object[] stuff = {"Hello", 100};
        System.out.println(stuff[1]);
        int lottonumbers[] = new int[6];
        for (int i = 0; i < 5; i++) {
            lottonumbers[i] = GenLotto(1, 73);
        }
        lottonumbers[5]=GenLotto(1,40);

        System.out.println(Arrays.toString(lottonumbers));
        //java arrays are fixed length
    }

    private static int GenLotto(int min, int max) {
        Random random = new Random();

        int randomNumber = random.nextInt(max + 1 - min) + min;
        return randomNumber;
    }


}


