package Chapter3_4;

import java.util.Random;
import java.util.Scanner;

public class GuessTheLetter {
    public static void main(String[] args) {
        String guess, answer;
        Random random = new Random();
        Scanner getter = new Scanner(System.in);
        int min = 65;
        int max = 90;
        int randomNumber = random.nextInt(max + 1 - min) + min;
        answer = (char) randomNumber + ""; //cast int as char, then convert to string
        System.out.println((answer));
        System.out.println("Guess the letter?");
        int count = 5;
        while (true) {
            guess = getter.nextLine();
            if (guess.equalsIgnoreCase(answer)) {
                System.out.println("You guessed correctly!");
                break;
            } else {
                if (count > 0) {
                    count--;

                        if (guess.compareToIgnoreCase( answer)>0) {
                            System.out.printf("guess lower, you have %s lives remaining",count);
                        } else {
                            System.out.printf("guess higher you have %s lives remaining",count);
                        }
                    } else {
                        System.out.println("out of guesses");
                    }
                }
            }
        }


    }

