import java.util.Scanner;
//Keaton driver for this one, while Jonathan Beck Navigated
public class Assignment1_part2 {
    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);
        System.out.println("What is the radius: ");
        double radius = keyboard.nextDouble();
        double circumference = radius * 2 * Math.PI;
        double area = Math.PI * radius * radius;
        System.out.printf("Your circumference is %.2f \n", circumference);
        System.out.printf("Your area is %.2f \n", area);
    }
}