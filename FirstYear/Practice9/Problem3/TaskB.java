import java.util.Scanner;

public class TaskB {
    void main() {
        Scanner scanner =  new Scanner(System.in);

        System.out.print("Enter the first number - ");
        int a = scanner.nextInt();
        System.out.print("Enter the second number - ");
        int b = scanner.nextInt();

        if (a <= 0 || b <= 0 || a == b){
            System.out.println("Invalid input");
            return;
        }
        while (a != b) {
            if (a > b) {
                a = a - b;
            } else {
                b = b - a;
            }
        }

        System.out.println("Greates common divisor for those numbers " + a);
    }
}