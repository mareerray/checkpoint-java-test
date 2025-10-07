import java.util.Arrays;

public class AnagramChecker {
    public boolean isAnagram(String str1, String str2) {

        // Check for empty input string
        if (str1.length() == 0 && str2.length() == 0) return true;

        // Convert to lowercase
        String cleanStr1 = str1.toLowerCase();
        String cleanStr2 = str2.toLowerCase();
//        String cleanStr1 = str1.replaceAll(" ", "").toLowerCase();
//        String cleanStr2 = str2.replaceAll(" ", "").toLowerCase();

        // Check length, if different return false
        if (cleanStr1.length() != cleanStr2.length()) return false;

        // Convert strings to character arrays, and sort them
        char[] arr1 = cleanStr1.toCharArray();
        Arrays.sort(arr1);
        char[] arr2 = cleanStr2.toCharArray();
        Arrays.sort(arr2);

        // Compare sorted arrays (or strings). If equal, return true.
        return Arrays.equals(arr1, arr2);
    }
}