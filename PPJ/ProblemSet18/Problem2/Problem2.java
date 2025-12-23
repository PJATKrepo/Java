import java.io.FileInputStream;
import java.io.FileWriter;
import java.io.BufferedWriter;
import java.io.IOException;

public class Problem2 {
    public static void main(String[] args) {
        if (args.length < 2) {
            return;
        }

        String inputFile = args[0];
        String outputFile = args[1];
        int minLength = 4;

        if (args.length > 2) {
            try {
                minLength = Integer.parseInt(args[2]);
            } catch (NumberFormatException e) {
                minLength = 4;
            }
        }

        try (FileInputStream in = new FileInputStream(inputFile);
             BufferedWriter out = new BufferedWriter(new FileWriter(outputFile))) {

            int b;
            StringBuilder sb = new StringBuilder();

            while ((b = in.read()) != -1) {
                boolean isAsciiLetter = (b >= 'A' && b <= 'Z') || (b >= 'a' && b <= 'z');

                if (isAsciiLetter) {
                    sb.append((char) b);
                } else {
                    if (sb.length() >= minLength) {
                        out.write(sb.toString());
                        out.newLine();
                    }
                    sb.setLength(0);
                }
            }

            if (sb.length() >= minLength) {
                out.write(sb.toString());
                out.newLine();
            }

        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}