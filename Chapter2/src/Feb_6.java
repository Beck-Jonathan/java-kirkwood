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
        if (num2 !=0) {
            System.out.println(num1 / num2);
            System.out.println(num1 % num2);
        }
        if (num2 !=0 && num1 % num2 ==0){
            System.out.println(num2 +" is a factor of " +num1);
        }



    }
}

