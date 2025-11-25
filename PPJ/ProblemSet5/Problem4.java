import java.util.Scanner;

public class Problem4 {
    void main() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter three non-negative integers: ");
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();

        int max = Math.max(a, Math.max(b, c));
        for (int i = max; i >= 1; i--) {
            System.out.print(a >= i ? "*" : " ");
            System.out.print(" ");

            System.out.print(b >= i ? "*" : " ");
            System.out.print(" ");

            System.out.print(c >= i ? "*" : " ");
            System.out.println();
        }
    }
}