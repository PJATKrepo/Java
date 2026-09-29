package task07;

import java.util.*;

public class Main {

    private static final int DATA_SIZE   = 100_000;
    private static final int TEST_TRIALS = 20_000;

    public static void main(String[] args) {
        BenchmarkRunner runner = new BenchmarkRunner();

        runner.runTest(new Problem7Test(new ArrayList<>(),   DATA_SIZE, TEST_TRIALS));
        runner.runTest(new Problem7Test(new LinkedList<>(),   DATA_SIZE, TEST_TRIALS));

    }

    private static void printHeader(int num, String title, String operation, String hint) {
        System.out.println("\n" + "=".repeat(70));
        System.out.printf("  Problem %d: %s%n", num, title);
        System.out.println("  Operacja : " + operation);
        System.out.println("  Wskazówka: " + hint);
        System.out.println("=".repeat(70));
    }
}