import java.time.DayOfWeek;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.time.format.DateTimeParseException;

// find the date of the next specified day of the week from a given date
// String startDate1 = "2023-06-22";
// String dayOfWeek1 = "Monday";
// System.out.println("Next " + dayOfWeek1 + " after " + startDate1 + ": "
// + finder.findNextDayOfWeek(startDate1, dayOfWeek1));
// Output: Next Monday after 2023-06-22: 2023-06-26
public class DayOfWeekFinder {
    public String findNextDayOfWeek (String startDate, String dayOfWeek) {
        try {
            // Convert string to LocalDate: If startDate is "2023-06-22",
            // this line creates a LocalDate representing June 22, 2023.
            LocalDate inputDate = LocalDate.parse(startDate);

            // Parse the dayOfWeek string returns ex. DayOfWeek.MONDAY
            DayOfWeek targetDow = DayOfWeek.valueOf(dayOfWeek.toUpperCase());

            // Get current day: Finds which day of the week your input date is,
            // as a DayOfWeek enum (for instance, THURSDAY).
            DayOfWeek inputDow = inputDate.getDayOfWeek();

            // Calculating days to add
            // Adding 7 and then taking % 7 ensures the answer is between 0 and 6,
            // avoiding negative days and handling wrap-around (e.g., from Thursday to Monday).
            int daysToAdd = (targetDow.getValue() - inputDow.getValue() + 7) % 7;

            // If the result is 0, the same day has occurred,
            // meaning "today"—so you actually want the next one, not today.
            if(daysToAdd == 0) {
                daysToAdd = 7;
            }

            // Add daysToAdd to input date and store in targetdate
            LocalDate targetDate = inputDate.plusDays(daysToAdd);

            // Convert the nextDate in LocalDate format to String format
            return targetDate.toString(); // "yyyy-MM-dd"

        // Error handling: return "Error" on any parsing problem
        } catch (Exception e) {
            return "Error";
        }

    }
}