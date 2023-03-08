package utilities;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class Helpers {
    public static String printDate(LocalDate date) {
        String date_string = "h";
        DateTimeFormatter format = DateTimeFormatter.ofPattern("EEEE, MMMM d, yyyy");
        date_string = date.format(format);

        return date_string;
    }
}
