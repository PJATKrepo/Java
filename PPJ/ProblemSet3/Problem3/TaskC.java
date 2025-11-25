import java.util.Scanner;

public class TaskC {
    void main() {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter first number: ");
        int a = scanner.nextInt();
        System.out.print("Enter second number: ");
        int b = scanner.nextInt();

        if (b < a) {
            int buff = a;
            a = b;
            b = buff;
        }

        long sum = 0;
        for(int i  = a; i <= b; i++) {
            sum += i;
        }

        System.out.println("The sum from " + a + " to " + b + " is " + sum);
    }
}