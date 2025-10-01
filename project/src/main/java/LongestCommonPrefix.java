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