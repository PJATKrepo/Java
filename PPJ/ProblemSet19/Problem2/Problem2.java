// RegParen
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Problem2 {
    public static void main (String[] args) {
        String str = "Lisboa (Lisbon, Portugal), " +
                "Warszawa (Warsaw,  Poland), and " +
                "Roma (Rome,Italy)";
        String pat = "\\((\\p{L}+),\\s*(\\p{L}+)\\)";

        Matcher m = Pattern.compile(pat).matcher(str);
        while (m.find()) {
            System.out.println(m.group(2) + " -> " + m.group(1));
        }
    }
}