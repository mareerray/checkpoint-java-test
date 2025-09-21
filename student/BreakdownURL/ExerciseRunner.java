import java.util.Map;

public class ExerciseRunner {
    public static void main(String[] args) {
        BreakdownURL parser = new BreakdownURL();

        // Test case 1
        String URL1 = "https://www.example.com:8080/path?name=value";
        Map<String, String> components1 = parser.parseURL(URL1);
        System.out.println("Components of URL 1: " + components1);

        // Test case 2
        String URL2 = "http://example.com/";
        Map<String, String> components2 = parser.parseURL(URL2);
        System.out.println("Components of URL 2: " + components2);

        // Test case 3
        String URL3 = "http://example.com";
        Map<String, String> components3 = parser.parseURL(URL3);
        System.out.println("Components of URL 3: " + components3);

        // Test case 4
        String URL4 = "http://example.com/path";
        Map<String, String> components4 = parser.parseURL(URL4);
        System.out.println("Components of URL 4: " + components4);

        // Test case 5
        String URL5 = "https://www.example.com:9090/path/to/resource?param1=value1&param2=value2";
        Map<String, String> components5 = parser.parseURL(URL5);
        System.out.println("Components of URL 5: " + components5);
    }
}

// output
// Components of URL 1: {protocol=https, domain=www.example.com, port=8080, path=/path, query=name=value}
// Components of URL 2: {protocol=http, domain=example.com, path=/}
// Components of URL 3: {protocol=http, domain=example.com}
// Components of URL 4: {protocol=http, domain=example.com, path=/path}
// Components of URL 5: {protocol=https, domain=www.example.com, port=9090, path=/path/to/resource, query=param1=value1&param2=value2}