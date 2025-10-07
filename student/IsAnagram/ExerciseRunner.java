public class ExerciseRunner {
    public static void main(String[] args) {
        AnagramChecker checker = new AnagramChecker();

        // Test cases
        System.out.println(checker.isAnagram("listen", "silent"));
        System.out.println(checker.isAnagram("triangle", "integral"));
        System.out.println(checker.isAnagram("apple", "pale"));
        System.out.println(checker.isAnagram("Astronomer", "Moon starer"));
    }
}