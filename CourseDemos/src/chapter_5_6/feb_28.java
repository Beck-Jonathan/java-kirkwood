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


        int [ ] a = {1, 2, 3, 4, 5, 6, 7, 8, 9};
        a[5] = a[3] + a[0];
        System.out.println("a 5 is "+a[5]);

        //java arrays are fixed length
        for (int i=0;i<lottonumbers.length-1;i++){
            System.out.println(lottonumbers[i]);
        }
        System.out.println("The PowerBall is " + lottonumbers[lottonumbers.length-1]);
        // there are two ways to loop. Above is a count controller loop
        //below a for each loop
        // data type, followed by variable name, colon, array name
        for(int lottonumber : lottonumbers){
            System.out.println(lottonumber);
        }

    }

    private static int GenLotto(int min, int max) {
        Random random = new Random();

        int randomNumber = random.nextInt(max + 1 - min) + min;
        return randomNumber;
    }


}


