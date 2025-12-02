import java.util.InputMismatchException;
import java.util.Scanner;

public class Task {
    void main() {
        Scanner sc = new Scanner(System.in);
        try {
            System.out.print("Enter a number 1: ");
            sc.nextLine();
            System.out.print("Enter a number 2: ");
            sc.nextLine();

            System.out.print("Enter a number 3: ");
            int a = sc.nextInt();

            System.out.print("Enter a number 4: ");
            int b = sc.nextInt();

            System.out.print("Enter a number 5: ");
            int c = sc.nextInt();

            System.out.println(a + " + " + b + " + " + c + " = " + (a  + b + c));
        } catch (InputMismatchException e) {
            System.out.println("Input valid number!");
        }
    }
}