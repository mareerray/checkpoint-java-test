public class AlmostPalindrome {
    public static boolean isAlmostPalindrome(String s) {
        // If a string has less than 3 characters, return false
        if (s.length() < 3) return false;

        // If the original string is already a palindrome, return false
        // Make sure the helper is defined in the same class or is properly imported if it’s elsewhere.
        if (isPalindrome(s)) return false;

        // Use a loop to remove each character from the string one by one,
        // and check if the result is a palindrome using your helper function.
        for (int i = 0; i < s.length(); i ++) {
            // Remove the character at i
            // (0, i) is all the characters before i, (i+1) is all the characters after i
            // Create a new string without that character.
            String modified = s.substring(0, i) + s.substring(i+1);
            if (isPalindrome(modified)) {
                return true;
                // when you use return inside a loop, the function stops executing and exits right away
            }
        }
        return false;
    }

    public static boolean isPalindrome(String str) {
        int left = 0; // This points to the start of the str
        int right = str.length()-1; // This point to the end of the str

        str = str.toLowerCase(); // Always use case-insensitive comparison
        while (left < right) {
            if (str.charAt(left) != str.charAt(right)) { // Use .charAt(index) to access a character
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