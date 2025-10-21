import java.util.Scanner;

public class Problem6 {
    void main() {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter font code (integer): ");
        int code = sc.nextInt();

        // Extract bits using bit masking and shifting
        int family = code & 0b11;              // last 2 bits
        int style = (code >> 2) & 0b11;        // next 2 bits
        int weight = (code >> 4) & 0b1;        // next 1 bit
        int size = (code >> 5) & 0b111;        // next 3 bits

        String familyName, styleName, weightName, sizeName;

        // --- Family ---
        switch (family) {
            case 0 -> familyName = "Courier";
            case 1 -> familyName = "Times";
            case 2 -> familyName = "Arial";
            case 3 -> familyName = "Helvetica";
            default -> {
                System.out.println("Illegal font family value!");
                return;
            }
        }

        // --- Style ---
        switch (style) {
            case 0 -> styleName = "plain";
            case 1 -> styleName = "italic";
            case 2 -> styleName = "slanted";
            default -> {
                System.out.println("Illegal font style value!");
                return;
            }
        }

        // --- Weight ---
        switch (weight) {
            case 0 -> weightName = "normal";
            case 1 -> weightName = "bold";
            default -> {
                System.out.println("Illegal font weight value!");
                return;
            }
        }

        // --- Size ---
        switch (size) {
            case 0 -> sizeName = "x-small";
            case 1 -> sizeName = "small";
            case 2 -> sizeName = "medium";
            case 3 -> sizeName = "large";
            case 4 -> sizeName = "x-large";
            default -> {
                System.out.println("Illegal font size value!");
                return;
            }
        }

        // --- Result message ---
        String result = "Font: " + familyName + ", " + styleName + ", "
                + weightName + ", " + sizeName;

        System.out.println(result);
    }
}
