import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Problem1 {
    public static void main(String[] args) {
        String text = "'Angola', Germany, 'togo', 'Poland'";

        String reg = "(?U)'(\\p{Lu}\\p{L}*)'";

        Pattern p = Pattern.compile(reg);
        Matcher m = p.matcher(text);

        while (m.find()) {
            System.out.println(m.group(1));
        }
    }
}