import java.util.regex.Matcher;
import java.util.regex.Pattern;

// Reg Test
public class Problem2 {
    public static void main(String[] args) {
        String text = "one-half, -10.0 - mother-in-low dry-cleaning";
        String reg = "(?U)\\p{L}+-(\\p{L}+)";
        Pattern p = Pattern.compile(reg);
        Matcher m = p.matcher(text);
        while (m.find()) System.out.println(m.group(1));
    }
}
