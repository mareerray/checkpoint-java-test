public class ExerciseRunner {
    public static void main(String[] args) {
        DayOfWeekFinder finder = new DayOfWeekFinder();

        // Test case 1
        String startDate1 = "2023-06-22";
        String dayOfWeek1 = "Monday";    // 2023-06-26
        System.out.println("Next " + dayOfWeek1 + " after " + startDate1 + ": " + finder.findNextDayOfWeek(startDate1, dayOfWeek1));

        // Test case 2
        String startDate2 = "2023-06-22";
        String dayOfWeek2 = "Friday";   // 2023-06-23
        System.out.println("Next " + dayOfWeek2 + " after " + startDate2 + ": " + finder.findNextDayOfWeek(startDate2, dayOfWeek2));

        // Test case 3
        String startDate3 = "2023-06-22";
        String dayOfWeek3 = "Sunday";   // 2023-06-25
        System.out.println("Next " + dayOfWeek3 + " after " + startDate3 + ": " + finder.findNextDayOfWeek(startDate3, dayOfWeek3));

        // Error case: invalid date format
        String startDate4 = "invalid-date";
        String dayOfWeek4 = "Monday";    // Error
        System.out.println("Next " + dayOfWeek4 + " after " + startDate4 + ": " + finder.findNextDayOfWeek(startDate4, dayOfWeek4));

        // Error case: invalid day of the week
        String startDate5 = "2023-06-22";
        String dayOfWeek5 = "Funday";   // Error
        System.out.println("Next " + dayOfWeek5 + " after " + startDate5 + ": " + finder.findNextDayOfWeek(startDate5, dayOfWeek5));
    }
}