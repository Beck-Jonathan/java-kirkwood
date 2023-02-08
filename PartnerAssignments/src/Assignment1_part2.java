import java.util.Scanner;

public class Assignment1_part2 {
    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);
        System.out.println("What is the radius: ");
        double radius = keyboard.nextDouble();
        double circumferemce = radius * 2 * Math.PI;
        double area = Math.PI * radius * radius;
        System.out.printf("Your circumference is %.1f \n", circumferemce);
        System.out.printf("Your area is %.1f \n", area);
    }
}