import java.util.Scanner;
import java.util.InputMismatchException;

public class Problem2 {
    void main() {
        Scanner sc = new Scanner(System.in);

        try {
            System.out.print("Enter the first number: ");
            double num1 = sc.nextDouble();

            System.out.print("Enter the second number: ");
            double num2 = sc.nextDouble();

            System.out.print("Enter operation (+, -, *, /): ");
            String operation = sc.next();

            double result;

            switch (operation) {
                case "+":
                    result = num1 + num2;
                    System.out.println("Result: " + result);
                    break;

                case "-":
                    result = num1 - num2;
                    System.out.println("Result: " + result);
                    break;

                case "*":
                    result = num1 * num2;
                    System.out.println("Result: " + result);
                    break;

                case "/":
                    if (num2 != 0) {
                        result = num1 / num2;
                        System.out.println("Result: " + result);
                    } else {
                        System.out.println("Error: Division by zero!");
                    }
                    break;

                default:
                    System.out.println("Invalid operation!");
                    break;
            }
        } catch (InputMismatchException e) {
            System.out.println("Invalid input! Please enter correct values for numbers.");
        } catch (Exception e) {
            System.out.println("An unexpected error");
        }
    }
}