import java.util.*;

public class LongestCommonPrefix {
    public String findLongestCommonPrefix(String[] strs) {
        // Edge cases
        if (strs == null || strs.length == 0) return "";
        if (strs.length == 1) return strs[0];

        // Start with the first string as the prefix
        String prefix = strs[0];

        // For every other string, shrink the prefix as needed
        for (int i = 1; i < strs.length; i++) {
            while (!strs[i].startsWith(prefix)) {
                // Remove the last character from prefix
                prefix = prefix.substring(0, prefix.length() - 1);
                // If prefix is empty, no common prefix exists
                if (prefix.isEmpty()) return "";
            }
        }
        // When done, prefix is the answer
        return prefix;
    }
}

/*
String s = "letterhead";
s.startsWith("letters");  // false, because "letterhead" starts with "letter", not "letters"
s.startsWith("letter");   // true, "letterhead" starts with "letter"

s.startsWith("letters") checks whether the string s begins with the exact sequence "letters"—
it doesn't search the whole string, but only compares the substring at the beginning of s to "letters"
 */