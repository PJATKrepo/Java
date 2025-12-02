import java.util.Scanner;

public class Problem3 {
    void main() {
        Scanner scanner = new Scanner(System.in);
        int evenCount = 0;
        int oddCount = 0;
        int x;

        System.out.println("Enter integers (0 to stop):");
        while ((x = scanner.nextInt()) != 0 ) {
            if (x % 2 == 0) evenCount++;
            else oddCount++;
        }

        boolean asMany = (evenCount == oddCount);
        System.out.println("As many odd as even: " + asMany);
    }
}