import java.util.List;
import java.util.Arrays;

public class ExerciseRunner {
    public static void main(String[] args) {
        ConfigProtector protector = new ConfigProtector();

        String configFile1 = "username=admin\npassword=secret\nhost=localhost\n";
        List<String> sensitiveKeys1 = Arrays.asList("password");
        // expected =
        // "username=admin\n
        // password=******\n
        // host=localhost\n";
        System.out.println("Protected Config 1:\n" + protector.hideSensitiveData(configFile1, sensitiveKeys1));

        String configFile2 = "apiKey=12345\napiSecret=abcdef\nendpoint=https://api.example.com\n";
        List<String> sensitiveKeys2 = Arrays.asList("apiKey", "apiSecret");
        // expected =
        // "apiKey=*****\n
        // api-Secret=******\n
        // endpoint=https://api.example.com\n";
        System.out.println("Protected Config 2:\n" + protector.hideSensitiveData(configFile2, sensitiveKeys2));

        String configFile3 = "username=user\npassword=pass\n";
        List<String> sensitiveKeys3 = Arrays.asList("username", "password");
        // expected =
        // "username=****\n
        // password=****\n";
        System.out.println("Protected Config 3:\n" + protector.hideSensitiveData(configFile3, sensitiveKeys3));

        String configFile4 = "username=admin\npassword=secret\nhost=localhost\n";
        List<String> sensitiveKeys4 = Arrays.asList();
        // expected =
        // "username=admin\n
        // password=secret\n
        // host=localhost\n";
        System.out.println("Protected Config 4:\n" + protector.hideSensitiveData(configFile4, sensitiveKeys4));

        String configFile5 = "username=admin\npassword=secret\nhost=localhost\n";
        List<String> sensitiveKeys5 = Arrays.asList("apiKey");
        // expected =
        // "username=admin\n
        // password=secret\n
        // host=localhost\n";
        System.out.println("Protected Config 5:\n" + protector.hideSensitiveData(configFile5, sensitiveKeys5));

        String configFile6 = "username=user name\npassword=this is password\nhost name=localhost\n";
        List<String> sensitiveKeys6 = Arrays.asList("host name", "username");
        //  expected =
        //  "username=*********\n
        //  password=this is password\n
        //  host name=*********\n"
        System.out.println("Protected Config 6:\n" + protector.hideSensitiveData(configFile6, sensitiveKeys6));

        String configFile7 =  "username=firstName\nusername=secondName\npassword=pass\n";
        List<String> sensitiveKeys7 = Arrays.asList("username");
        //  expected =
        //  "username=*********\n
        //  username=**********\n
        //  password=pass\n"
        System.out.println("Protected Config 7:\n" + protector.hideSensitiveData(configFile7, sensitiveKeys7));

        String configFile8 = "userName=admin\nusername=Admin\nhost=localhost\n";
        List<String> sensitiveKeys8 =  Arrays.asList("username");
        //  expected =
        //  "userName=admin\n
        //  username=*****\n
        //  host=localhost\n"
        System.out.println("Protected Config 8:\n" + protector.hideSensitiveData(configFile8, sensitiveKeys8));

        String configFile9 = "";
        List<String> sensitiveKeys9 =  Arrays.asList("password");
        //  expected = ""
        System.out.println("Protected Config 9:\n" + protector.hideSensitiveData(configFile9, sensitiveKeys9));


    }
}