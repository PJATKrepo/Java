import java.util.Scanner;

public class Problem2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter an odd number greater than 1: ");

        if (scanner.hasNextInt()) {
            int n = scanner.nextInt();

            if (n > 1 && n % 2 != 0) {
                for (int i = 0; i < n; i++) {
                    for (int j = 0; j < n; j++) {
                        if (j == i || j == n - 1 - i) {
                            System.out.print("*");
                        } else {
                            System.out.print(" ");
                        }
                    }
                    System.out.println();
                }
            } else {
                System.out.println("Error: You must enter an ODD number greater than 1 (e.g., 3, 5, 7).");
            }
        } else {
            System.out.println("Error: Invalid input. Please enter a number.");
        }
    }
}