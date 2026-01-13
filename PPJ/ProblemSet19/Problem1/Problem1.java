import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Problem1 {
    public static void main(String[] args) {
        String[] regexes = {
                "\\p{L}+\\p{P}",
                "\\D+"
        };

        int[] counters = new int[regexes.length];

        try {
            Scanner scanner = new Scanner(new File("data.txt"));

            while (scanner.hasNextLine()) {
                String line = scanner.nextLine();
                if (line.startsWith("q")) {
                    break;
                }

                System.out.println(line);

                for (int i = 0; i < regexes.length; i++) {
                    boolean match = line.matches(regexes[i]);
                    System.out.println("\"" + regexes[i] + "\" -> " + match);

                    if (match) {
                        counters[i]++;
                    }
                }
            }
            scanner.close();
        } catch (FileNotFoundException e) {
            System.out.println("File data.txt not found");
        }

        System.out.println("\nCounters:");
        for (int i = 0; i < regexes.length; i++) {
            System.out.println(i + "->" + counters[i]);
        }
    }
}