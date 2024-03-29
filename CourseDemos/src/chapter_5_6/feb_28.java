package chapter_5_6;


import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class feb_28 {
    private static int getRandomNum(int min, int max) {
        Random random = new Random();
        int randomNumber = random.nextInt(max + 1 - min) + min;
        return randomNumber;
    }

    public static void main(String[] args) {
        // Differences between Java arrays and Python lists
        // Java requires you to specify the data type, Java only allows data of the same type
        // The square brackets can be placed after the data type or after the variable name
        // Java arrays are fixed length
        Object[] stuff = {"Hello", 100};
        String daysOfWeek[] = {"Sunday", "Monday", "Tuesday", "Wednesday", "Thursday", "Friday", "Saturday"};
        System.out.println(daysOfWeek[3]); // Wednesday
        int lottoNumbers[] = new int[6];
        lottoNumbers[0] = getRandomNum(1,75);
        lottoNumbers[1] = getRandomNum(1,75);
        lottoNumbers[2] = getRandomNum(1,75);
        lottoNumbers[3] = getRandomNum(1,75);
        lottoNumbers[4] = getRandomNum(1,75);
        lottoNumbers[5] = getRandomNum(1,40);
        // Printing arrays is much more complicated
        int [] first_five=Arrays.copyOfRange(lottoNumbers,0,5);
        Arrays.sort(first_five);
        System.out.println(lottoNumbers);
        System.out.println(Arrays.toString(first_five));
        // There are two ways to loop through arrays
        // count-controlled loop
        for(int i = 0; i < lottoNumbers.length - 1; i++) {
            System.out.println(lottoNumbers[i]);
        }
        System.out.println("The power ball is: " + lottoNumbers[lottoNumbers.length - 1]);
        // for-each loop
        // (DataType variableName: arrayName)
        int count = 0;
        for(int num: lottoNumbers) {
            System.out.println(num);
        }

        String[][] stateCapitals = {
                {"Iowa", "Des Moines"},
                {"Nebraska", "Lincoln"},
                {"Wisconsin", "Madison"}
        };
        for(String[] row: stateCapitals) {
            for(String cell: row) {
                System.out.print(cell + " ");
            }
            System.out.println();
        }
        for(int i = 0; i < stateCapitals.length; i++) {
            String state = stateCapitals[i][0];
            String capital = stateCapitals[i][1];
            System.out.printf("The capital of %s is %s\n", state, capital);
        }
    }
}
