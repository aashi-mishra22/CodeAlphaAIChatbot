import java.time.LocalDate;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;

public class Utils {

    // Current Date
    public static String getCurrentDate() {

        LocalDate date = LocalDate.now();

        DateTimeFormatter formatter =
                DateTimeFormatter.ofPattern("dd MMMM yyyy");

        return "Today's Date : " + date.format(formatter);
    }

    // Current Time
    public static String getCurrentTime() {

        LocalTime time = LocalTime.now();

        DateTimeFormatter formatter =
                DateTimeFormatter.ofPattern("hh:mm:ss a");

        return "Current Time : " + time.format(formatter);
    }

}