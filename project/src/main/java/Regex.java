import java.util.*;
// Regex class
public class Regex {
    private StringBuilder pattern;

    // Constructor overloading !!
    // Each constructor must have a unique set of parameters (type and/or number).
    // This lets a class be flexible in how objects are created, handling different initialization needs.
    public Regex() {
        this(new ArrayList<String>());
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