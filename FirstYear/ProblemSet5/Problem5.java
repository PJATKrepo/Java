import java.util.Scanner;

public class Problem5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter integers (0 to stop):");

        Integer prev = null;
        int curCount = 0;

        int bestCount = 0;
        int bestValue = 0;

        while (true) {
            int x = sc.nextInt();
            if (x == 0) break;

            if (prev == null || x != prev) {
                curCount = 1;
                prev = x;
            } else {
                curCount++;
            }

            if (curCount > bestCount) {
                bestCount = curCount;
                bestValue = x;
            }
        }

        if (bestCount == 0) {
            System.out.println("No numbers entered.");
        } else {
            System.out.println("Longest sequence: " + bestCount + " times, value = " + bestValue);
        }
    }
}
