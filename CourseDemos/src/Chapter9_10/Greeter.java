package Chapter9_10;

import java.time.*;
public class Greeter {
    public static void main(String[] args) {
        String num1 ="1";
        int num2=0;
        try {num2 = Integer.parseInt(num1);

        } catch (NumberFormatException e) {

            System.out.println(num1+" Is not a valid integer");
        }
        double num3 = (double)num2;
    }
}