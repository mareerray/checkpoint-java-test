public class ExerciseRunner {
    public static void main(String[] args) {

        ProjectTime shortProject = new ProjectTime("2023-05-14 09:00", "2023-05-14 09:30");
        System.out.println("Short Project Total Logged Time: " + shortProject.getHoursLogged()); // 30 m

        ProjectTime overnightProject = new ProjectTime("2023-05-14 20:00", "2023-05-15 08:00");
        System.out.println("Overnight Project Total Logged Time: " + overnightProject.getHoursLogged()); // 12 h

        ProjectTime fullDayProject = new ProjectTime("2023-05-14 00:00", "2023-05-15 00:00");
        System.out.println("Full Day Project Total Logged Time: " + fullDayProject.getHoursLogged()); // 24 h

        ProjectTime errorProject = new ProjectTime("2023-05-14", "2023-05-15 08:00");
        System.out.println("Error Project Total Logged Time: " + errorProject.getHoursLogged()); // -1

        ProjectTime project1 = new ProjectTime("2023-05-15 08:00", "2023-05-14 09:00");
        System.out.println("Project1 Total Logged Time: " + project1.getHoursLogged()); // -1

        ProjectTime project2 = new ProjectTime("2023-05-14 09:00", "2023-05-14 11:00");
        System.out.println("Project2 Total Logged Time: " + project2.getHoursLogged()); // 2 h

        ProjectTime project3 = new ProjectTime("2023-05-14 00:00", "2023-05-19 00:00");
        System.out.println("Project3 Total Logged Time: " + project3.getHoursLogged()); // 5 d

        ProjectTime project4 = new ProjectTime("2023-01-01 00:00", "2023-05-01 00:00");
        System.out.println("Project4 Total Logged Time: " + project4.getHoursLogged()); // 4 mo
    }
}