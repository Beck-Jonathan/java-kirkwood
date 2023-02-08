import java.util.Random;
import java.util.Scanner;

public class Feb_6 {
    public static void main(String[] args) {
        for (int i = 0; i <= 10; i++) {
            System.out.print(i);
            if (i % 2 == 0) {
                System.out.print(" is even");
            } else {
                System.out.print(" is odd");
            }
            System.out.println();
        }
        // talked about truth tables
        // && and || are short circuits, they evaluate the first one, then make appropriate decisions,
        //sometimes skipping the second evaluation
        Scanner keyboard = new Scanner(System.in);
        System.out.println("enter a number:");
        double num1 = keyboard.nextDouble();
        System.out.println("enter another number");
        double num2 = keyboard.nextDouble();

        System.out.println(num1 + num2);
        System.out.println(num1 - num2);
        System.out.println(num1 * num2);
        if (num2 != 0) {
            System.out.println(num1 / num2);
            System.out.println(num1 % num2);
        }
        if (num2 != 0 && num1 % num2 == 0) {
            System.out.println(num2 + " is a factor of " + num1);
        }
//castiang pages 55 to 57
        int n = 4;
        double m = n;
        System.out.println(m);
        double k = 6.3;
        int j = (int) k; //"casts" double to int, which loses data, but is the only way to get this double here
        System.out.println(j); //prints 6
        //print 10 random numbers between 1 and 6
        for (int x = 0; x < 10; x++) {
            int dice = (int) (Math.random() * 6) + 1;
            System.out.print(dice + " ");
        }
        System.out.println();
        //generate 10 random numbers between -10 and 10
        for (int x = 0; x < 10; x++) {
            int dice = (int) (Math.random() * 20) - 10;
            System.out.print(dice + " ");
        }
        System.out.println();
        //generate 30 random numbers between -10 and 10
        Random random = new Random();
        int min = -10;
        int max = 10;
        for (int i = 0; i < 30; i++) {
            int randomNumber = random.nextInt(max + 1 - min) + min;
            System.out.print(randomNumber + " ");
        }
        System.out.println();
        for (int i = 65; i <= 90; i++) {
            System.out.println((char) i);
        }
        for (int i =1;i<=10; i++){
            System.out.printf("%d /3 = %.3f\n",i,(double) i / 3);
        }
    }
}





