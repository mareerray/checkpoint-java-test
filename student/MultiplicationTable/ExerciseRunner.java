public class ExerciseRunner {
    public static void main(String[] args) {
        MultiplicationTable.generate(2);
        MultiplicationTable.generate(5);
    }
}
/*
expectedOutput = "2 x 1 = 2\n" +
                "2 x 2 = 4\n" +
                "2 x 3 = 6\n" +
                "2 x 4 = 8\n" +
                "2 x 5 = 10\n" +
                "2 x 6 = 12\n" +
                "2 x 7 = 14\n" +
                "2 x 8 = 16\n" +
                "2 x 9 = 18\n" +
                "2 x 10 = 20\n";

String expectedOutput = "5 x 1 = 5\n" +
                        "5 x 2 = 10\n" +
                        "5 x 3 = 15\n" +
                        "5 x 4 = 20\n" +
                        "5 x 5 = 25\n" +
                        "5 x 6 = 30\n" +
                        "5 x 7 = 35\n" +
                        "5 x 8 = 40\n" +
                        "5 x 9 = 45\n" +
                        "5 x 10 = 50\n";
 */