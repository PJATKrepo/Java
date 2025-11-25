import java.util.Scanner;

public class Problem1 {
    void main() {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Please enter a first natural number - ");
        int x = scanner.nextInt();
        System.out.print("Please enter a second natural number - ");
        int y = scanner.nextInt();

        boolean hasCommon = ((x % 2 == 0) && (y % 2 == 0)) || ((x % 3 == 0) && (y % 3 == 0)) || ((x % 5 == 0) && (y % 5 == 0));

        System.out.println(hasCommon);
    }
}