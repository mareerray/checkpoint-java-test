import java.util.*;
import java.util.regex.*;

public class HTMLValidator {
    private static final Set<String> ALLOWED_TAGS = Set.of(
            "html", "body", "div", "p", "b", "i", "h1", "h2", "br"
    );
    public boolean validateHTML(String html) {
        Pattern tagPattern = Pattern.compile("<(/?)([a-z0-9]+)(/?)>");
        Matcher matcher = tagPattern.matcher(html);
        Stack<String> stack = new Stack<>();

        while (matcher.find()) {
            String slash = matcher.group(1); // "/" if closing, "" if opening
            String tag = matcher.group(2);   // tag name
            String selfClosing = matcher.group(3); // "/" if self-closing, "" otherwise

            if (!ALLOWED_TAGS.contains(tag)) return false;

            if (!slash.isEmpty()) {
                // closing tag
                if (stack.isEmpty() || !stack.pop().equals(tag)) return false;
            } else if (!selfClosing.isEmpty()) {
                // self-closing tag, do nothing
                continue;
            } else {
                // opening tag
                stack.push(tag);
            }
        }
        return stack.isEmpty();
    }
}

