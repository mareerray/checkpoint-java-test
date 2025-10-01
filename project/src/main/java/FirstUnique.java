import java.util.*;

public class FirstUnique {
    public char findFirstUnique(String s) {
        Map<Character, Integer> count = new HashMap<>();
        if (s == null) return '_';
        char[] charArray = s.toCharArray();
        for (char c : charArray)
            count.put(c, count.getOrDefault(c, 0) + 1);
        for (char c : charArray)
            if (count.get(c) == 1)
                return c;
        return '_';
    }
}


/*
Example:
String s = "hello";
char[] chars = s.toCharArray();  // chars: ['h','e','l','l','o']

Example:
Map<Character, Integer> map = new HashMap<>();
// getOrDefault gives map.get('x') if 'x' is present, otherwise returns 0
int val = map.getOrDefault('x', 0);
// Very useful for counting,
as you can read or increment counts without checking if the key is present.
 */