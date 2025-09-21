public class ExerciseRunner {
    public static void main(String[] args) {
        System.out.println(AlmostPalindrome.isAlmostPalindrome("Racedcar")); // true
        System.out.println(AlmostPalindrome.isAlmostPalindrome("level")); // false
        System.out.println(AlmostPalindrome.isAlmostPalindrome("radarx")); // true
        System.out.println(AlmostPalindrome.isAlmostPalindrome("ddeified")); // true
        System.out.println(AlmostPalindrome.isAlmostPalindrome("rotaitor")); // true
        System.out.println(AlmostPalindrome.isAlmostPalindrome("example")); // false

        System.out.println(AlmostPalindrome.isAlmostPalindrome("w,ow")); // true
        System.out.println(AlmostPalindrome.isAlmostPalindrome("wo,ow")); // false
        System.out.println(AlmostPalindrome.isAlmostPalindrome("aaa")); // false
        System.out.println(AlmostPalindrome.isAlmostPalindrome("abb")); // true
        System.out.println(AlmostPalindrome.isAlmostPalindrome("abc")); // false
    }
}