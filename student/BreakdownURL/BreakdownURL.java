import java.util.*;
import java.util.regex.*;
// parse and validate URLs using regex.The method should extract and return the following URL components:
// protocol, domain, port, path and query Assume the URL is always correct.
// The method should extract and return URL components the parameters. The URL is always correct.
public class BreakdownURL {
    public Map<String, String> parseURL(String url) {
        // Use linkedHashMap to preserve the insertion order of key-value pair in a map
        // Parsing/printing objects in a specific order
        Map <String, String> result = new LinkedHashMap<>();

        Pattern pattern = Pattern.compile("^(?:(https?|ftp)://)?([^:/?#]+)(?::(\\d+))?(/[^?]*)?(?:\\?([^#]*))?");
        Matcher matcher = pattern.matcher(url);

        if (matcher.find()) {
            if (matcher.group(1) != null) result.put("protocol", matcher.group(1));
            if (matcher.group(2) != null) result.put("domain", matcher.group(2));
            if (matcher.group(3) != null) result.put("port", matcher.group(3));
            if (matcher.group(4) != null) result.put("path", matcher.group(4));
            if (matcher.group(5) != null) result.put("query", matcher.group(5));
        }
        return result;
    }
}
/*
regex pattern in 5 groups
Group 1 (?:(https?|ftp)://)?
group 2 ([^:/?#]+)
Group 3 (?::(\\d+))?
Group 4 (/[^?]*)?
group 5 (?:\\?([^#]*))?
 */
