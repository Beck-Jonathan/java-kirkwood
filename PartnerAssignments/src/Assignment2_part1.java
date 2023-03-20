import java.util.Scanner;

public class Assignment2_part1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a number: ");
        double user_input=scanner.nextDouble();
        if (user_input%2==0) {
            int answer = (int) user_input;
            System.out.printf("%s is even",answer);
        }else if(user_input%2==1){
            int answer = (int) user_input;
            System.out.printf("%s is odd",answer);
        }else {
            System.out.println(user_input+" is neither odd nor even");

        }
    }
}
