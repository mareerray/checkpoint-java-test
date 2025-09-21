public class ExerciseRunner {
    public static void main(String[] args) {
        AgeFinder AgeFinder = new AgeFinder();

        // Test case 1
        String date1 = "2000-01-01";
        System.out.println("Age: " + AgeFinder.calculateAge(date1));

        // Test case 2
        String date2 = "1990-06-15";
        System.out.println("Age: " + AgeFinder.calculateAge(date2));

        // Test case 3
        String date3 = "2010-12-25";
        System.out.println("Age: " + AgeFinder.calculateAge(date3));

        // Test case 4 with invalid date format
        String date4 = "invalid-date";
        System.out.println("Age: " + AgeFinder.calculateAge(date4)); // -1

        // Test case 5 with future date
        String date5 = "3000-01-01";
        System.out.println("Age: " + AgeFinder.calculateAge(date5));  // -1

        // Test case 6 with leap year
        String date6 = "2000-02-29";
        System.out.println("Age: " + AgeFinder.calculateAge(date6));

        // Test case 7 with minimun valid date
        String date7 = "0001-01-01";
        System.out.println("Age: " + AgeFinder.calculateAge(date7)); // current year - 1
    }
}