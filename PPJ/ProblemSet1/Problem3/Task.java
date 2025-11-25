import java.util.InputMismatchException;
import java.util.Scanner;

public class Task {
    void main() {
        Scanner sc = new Scanner(System.in);
        try {
            System.out.print("Enter the first number: ");
            int a = sc.nextInt();
            System.out.print("Enter the second number: ");
            int b = sc.nextInt();
            System.out.print("Enter the third number: ");
            int c = sc.nextInt();

            if ((a > b && a < c) || (a < b && a > c)) { System.out.println("The middle value number is - " + a); }
            else if ((b > a && b < c) || (b > c && b < a)) { System.out.println("The middle value number is - " + b); }
            else { System.out.println("The middle value number is - " + c); }
        } catch (InputMismatchException e) { System.out.print("Input valid number!"); }
    }
}