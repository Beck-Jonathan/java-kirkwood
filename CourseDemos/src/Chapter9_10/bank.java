package Chapter9_10;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

import static java.lang.String.format;

public class bank {
    public static void main(String[] args) {
        double x= 23.33;
        LocalDate now = LocalDate.now();
        System.out.printf( "Your balance on %tbD,Y  is %2s",now,x);
    }

    @Override
    public String toString() {
        double bal = 0;
        LocalDate now = LocalDate.now();
        String date_string = "h";
        DateTimeFormatter format = DateTimeFormatter.ofPattern("MMMM d, yyyy");
        date_string = now.format(format);
        String output = format("Your balance on %s is %s",date_string,bal);
        return output;
    }
}
