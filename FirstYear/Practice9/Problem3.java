import java.util.InputMismatchException;
import java.util.Scanner;

public class Problem3 {
    void main() {
        Scanner sc = new Scanner(System.in);

        try {
            System.out.print("Enter the first number (a): ");
            int a = sc.nextInt();

            System.out.print("Enter the second number (b): ");
            int b = sc.nextInt();

            System.out.print("Enter the third number (c): ");
            int c = sc.nextInt();

            if ((a == b && a != c) || (a == c && a != b) || (b == c && b != a)) {
                System.out.println("OK");
            } else {
                System.out.println("NOT OK");
            }

        } catch (InputMismatchException e) {
            System.out.println("Invalid input! Please enter natural numbers only.");
        }
    }
}