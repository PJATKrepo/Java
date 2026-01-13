import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import static java.nio.charset.StandardCharsets.UTF_8;

public class Problem3 {
    public static void main (String[] args) {
        String text = null;
        try {
            byte[] bytes =
                    Files.readAllBytes(Paths.get("FirstLast.txt"));
            text = new String(bytes, UTF_8);
        } catch(IOException e) {
            System.out.println("Problems...");
            System.exit(1);
        }
        String reg = "(?U)(?i)\\b(\\p{L})\\p{L}*\\1\\b";
        Matcher m = Pattern.compile(reg).matcher(text);
        while (m.find())
            System.out.println(m.group());
    }
}