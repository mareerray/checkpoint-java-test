public class AlmostPalindrome {
    public static boolean isAlmostPalindrome(String s) {
        if (s.length() < 3) return false;
        if (isPalindrome(s)) return false;

        for (int i = 0; i < s.length(); i++) {
            String modified = s.substring(0,i) + s.substring(i+1);
            if (isPalindrome(modified)) return true;
        }
        return false;
    }
    public static boolean isPalindrome(String str) {
        int left = 0;
        int right = str.length() -1;
        str = str.toLowerCase();
        while (left < right) {
            if (str.charAt(left) != str.charAt(right)) {
                return false;
            }
            left++;
            right--;
        }
        return true;
    }
}

/*
Use != with char values, because they are primitive data, not objects.

Use .equals() with full strings for value comparison, but not with single characters.
 */