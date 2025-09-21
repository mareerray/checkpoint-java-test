import java.time.LocalDate;
import java.time.Period;
import java.time.format.DateTimeFormatter;

public class AgeFinder {
    public int calculateAge(String date) {
        try {
            LocalDate startDate = LocalDate.parse(date);
            LocalDate now =  LocalDate.now();

            Period p = Period.between(startDate, now);
            // System.out.println(p);
            if (startDate.isAfter(now)) return -1;

            int years = p.getYears();
            return years;

        } catch (Exception e) {
            return -1;
        }
    }
}