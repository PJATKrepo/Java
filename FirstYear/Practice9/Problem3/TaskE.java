import java.util.Scanner;

public class TaskE {
    void main() {
        Scanner scanner=new Scanner(System.in);
        IO.print("Enter a natural number - ");
        int a = scanner.nextInt();

        int count = Integer.bitCount(a);
        System.out.println(count);
    }
}