import java.util.Scanner;

public class Assignment2_part2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Entre a number for seconds: ");
        long seconds = scanner.nextLong();
        long days = seconds / (60 * 60 * 24);
        long leftOvers = seconds % (60 * 60 * 24);
        long hours = leftOvers / (60 * 60);
        leftOvers = leftOvers % (60 * 60);
        long minutes = leftOvers / 60;
        seconds = leftOvers % 60;

        String daysPlural = (days == 1)? "":"s";
        String hoursPlural = (hours == 1)? "":"s";
        String secondsPlural = (seconds == 1)? "":"s";
        String minutesPlural = (minutes == 1)? "":"s";

        System.out.println("Day"+ daysPlural + " " + days);
        System.out.println("Hour"+ hoursPlural + " " + hours);
        System.out.println("Minute"+ minutesPlural + " " + minutes);
        System.out.println("Second"+ secondsPlural + " " + seconds);
    }
}