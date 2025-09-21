import java.time.LocalDate;
import java.time.Period;
import java.time.format.DateTimeFormatter;

public class MonthlyPeriod {
    // calculate the period between two dates in months and years
    // String startDate1 = "2020-01-01";
    // String endDate1 = "2023-06-15";
    // System.out.println("Period: " + MonthlyPeriod.calculatePeriod(startDate1, endDate1));
    // Output: Period: 3 years and 5 months
    public String calculatePeriod(String startDate, String endDate) {
        try {
            LocalDate date1 = LocalDate.parse(startDate);
            LocalDate date2 = LocalDate.parse(endDate);
            Period p = Period.between(date1, date2);
            if (p.isNegative()) {
                p = Period.between(date2, date1);
            }
            int years = p.getYears();
            int months = p.getMonths();

            if (years == 1 && months == 1){
                return "1 year and 1 month";
            } else if (years > 1 && months > 1) {
                return years + " years and " + months + " months";
            } else if (years > 0) {
                return years + " years";
            } else if (months > 0) {
                return months + " months";
            } else {
                return "";
            }
        } catch (Exception e) {
            return "Error";
        }
    }
}