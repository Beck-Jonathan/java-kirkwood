import java.util.Scanner;

public class Assignment1_part1 {
public static void main(String[]args){
    Scanner getter = new Scanner(System.in);
    System.out.println("Please enter a number:");
    double a = getter.nextDouble();
    System.out.println("Please enter a number:");
    double b = getter.nextDouble();
    System.out.print("The Larger number is: ");
    if (a>=b) {
        System.out.println(a);
    } else System.out.println(b);
}

        }

