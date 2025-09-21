import java.util.*;
// Regex class, is the product we'll return
// Key: Only Regex knows how to assemble and serve up the complete regex string.
public class Regex {
    private StringBuilder pattern;

    // Constructor overloading !!
    // Each constructor must have a unique set of parameters (type and/or number).
    // This lets a class be flexible in how objects are created, handling different initialization needs.
    public Regex() {
        this(new ArrayList<String>());
        // If someone asks for a Regex with no data,
        // just call the "Regex with a List" constructor, using an empty List!
    }

    public Regex (List<String> component) {
       pattern = new StringBuilder();
       for (String part : component) {
           pattern.append(part);
       }
    }

    public String getPattern() {
        return pattern.toString();
    }

    @Override
    public String toString() {
        return getPattern();
    }
}