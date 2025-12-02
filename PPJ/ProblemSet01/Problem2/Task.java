import java.util.InputMismatchException;
import java.util.Scanner;

public class Task {
    void main() {
        Scanner sc = new Scanner(System.in);
        try {
            System.out.print("Enter a number a: ");
            int a = sc.nextInt();

            System.out.print("Enter a number b: ");
            int b =  sc.nextInt();

            System.out.print("Enter a number c: ");
            int c = sc.nextInt();

            System.out.println(a + " " + b + " " + c);

            int buff;
            while ((a > b) || (b > c)) {
                if (a > b) {
                    buff = a;
                    a = b;
                    b = buff;
                } else if  (b > c) {
                    buff = b;
                    b = c;
                    c = buff;
                }
            }

            System.out.println(a + " " + b + " " + c);
        } catch (InputMismatchException e) {
            System.out.println("Input valid number!");
        }
    }
}