import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

// hide sensitive data in a configuration file using Regex.
// The method should replace sensitive values with asterisks.
// The configuration file will be provided as a String, and the keys for the sensitive data will be given in a List.
// Input: String configFile1 = "username=admin\npassword=secret\nhost=localhost\n";
//        List<String> sensitiveKeys1 = Arrays.asList("password");
// Output: username=admin
//         password=******
//         host=localhost
public class ConfigProtector {
    public String hideSensitiveData(String configFile, List<String> sensitiveKeys) {
        String protectedConfig = configFile;

        for (String key : sensitiveKeys) {
            Pattern pattern = Pattern.compile("(?<=" + Pattern.quote(key) + "=).*");
            Matcher matcher = pattern.matcher(protectedConfig);

            StringBuffer sb = new StringBuffer();
            while (matcher.find()) {
                String value = matcher.group();                   // Get the sensitive value
                String masked = "*".repeat(value.length());       // Create a string of asterisks ("******")
                matcher.appendReplacement(sb, masked);            // Replace found value in sb
            }
            matcher.appendTail(sb);                               // Copy rest of original String after last match
            protectedConfig = sb.toString();                      // Produce the fully masked config string
        }
        return protectedConfig;
    }
}

/*
Part	            Meaning
Pattern.quote(key)	Escapes key to match it literally
=	                Matches the literal = sign
(?<=...)	        Lookbehind—asserts the match is after key= but does not include it
.*	                Matches any character (zero or more) after the position
 */