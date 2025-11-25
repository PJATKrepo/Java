import java.util.InputMismatchException;
import java.util.Scanner;

public class Task {
    void main() {
        Scanner scanner = new Scanner(System.in);

        try {
            System.out.print("Please enter the number: ");
            int min = scanner.nextInt();
            int max = min;

            for(int i = 0; i!=3; i++) {
                System.out.print("Please enter the number: ");
                int buff =  scanner.nextInt();

                if (buff > max) { max = buff; }
                else if (buff < min) { min = buff; }
            }
            System.out.println("the min number is " + min);
            System.out.println("the max number is " + max);
            System.out.println("The difference between the two numbers is " + Math.abs(min - max));

        } catch (InputMismatchException e) {
            System.out.print("Input valid number!");
        }
    }
}