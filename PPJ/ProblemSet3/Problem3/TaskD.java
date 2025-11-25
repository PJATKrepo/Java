import java.util.Scanner;

public class TaskD {
    void main() {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the first number - ");
        int a  = scanner.nextInt();
        System.out.print("Enter the second number - ");
        int b = scanner.nextInt();

        if (b < a) {
            int buff = a;
            a = b;
            b = buff;
        }

        for (int i = a; i <= b; i++) {
            if ((i % 3 == 0 || i % 5 == 0) && !(i % 3 == 0 && i % 5 == 0)) {
                System.out.print(i + ";  ");
            }
        }

        /*
        for (int i = a; i <= b; i++) {
            boolean division3 = (i % 3 == 0);
            boolean division5 = (i % 5 == 0);

            if (division3 ^ diviion5) {
                System.out.print(i + ";  ");
            }
        }
        */
    }
}