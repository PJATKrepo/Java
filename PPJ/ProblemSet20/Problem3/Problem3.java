import java.util.regex.Matcher;
import java.util.regex.Pattern;

// Reg Test
public class Problem3 {
    public static void main(String[] args) {
        String text = "to be, or not to be, that is the question";
        String reg = "\\b(\\p{L})\\p{L}+(\\p{L})\\b";
        Pattern p = Pattern.compile(reg);
        Matcher m = p.matcher(text);
        while (m.find()) System.out.println(m.group(1) + "-" + m.group(2));
    }
}