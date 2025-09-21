public class ExerciseRunner {
    public static void main(String[] args) {
        MonthlyPeriod MonthlyPeriod = new MonthlyPeriod();

        String startDate1 = "2020-01-01";
        String endDate1 = "2023-06-15";  // 3 years and 5 months
        System.out.println("Period: " + MonthlyPeriod.calculatePeriod(startDate1, endDate1));

        String startDate2 = "2015-05-20";
        String endDate2 = "2015-10-19"; // 4 months
        System.out.println("Period: " + MonthlyPeriod.calculatePeriod(startDate2, endDate2));

        String startDate3 = "2015-05-20";
        String endDate3 = "2015-10-20";  // 5 months
        System.out.println("Period: " + MonthlyPeriod.calculatePeriod(startDate3, endDate3));

        String startDate4 = "2018-12-25";
        String endDate4 = "2021-12-25"; // 3 years
        System.out.println("Period: " + MonthlyPeriod.calculatePeriod(startDate4, endDate4));

        String startDate5 = "2018-10-25";
        String endDate5 = "2019-11-30"; // 1 year and 1 month
        System.out.println("Period: " + MonthlyPeriod.calculatePeriod(startDate5, endDate5));

        String startDate6 = "2023-06-15";
        String endDate6 = "2020-01-01";  // 3 years and 5 months
        System.out.println("Period: " + MonthlyPeriod.calculatePeriod(startDate6, endDate6));

        String date7 = "2023-01-01";   // ""
        System.out.println("Period: " + MonthlyPeriod.calculatePeriod(date7, date7));

        String startDate8 = "invalid-date";
        String endDate8 = "2023-01-01";  // Error
        System.out.println("Period: " + MonthlyPeriod.calculatePeriod(startDate8, endDate8));

    }
}