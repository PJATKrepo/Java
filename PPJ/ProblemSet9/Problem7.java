public class Problem7 {
    void main() {
        testForN(5);
        testForN(30);
        testForN(90);
    }

    static void testForN(int N) {
        final int NUM_OF_SIMULATIONS = 100_000;
        long totalBoxes = 0;

        for (int i = 0; i < NUM_OF_SIMULATIONS; ++i) {
            totalBoxes += boxesBought(N);
        }

        double aver = totalBoxes / (double) NUM_OF_SIMULATIONS;

        System.out.println("***** N=" + N);
        System.out.println("Average: " + aver);
        System.out.println("Expected: " + N * harmo(N));
    }

    static int boxesBought(int coupons) {
        boolean[] collected = new boolean[coupons];
        int countDistinct = 0;
        int boxes = 0;

        while (countDistinct < coupons) {
            boxes++;
            int randomCoupon = (int)(Math.random() * coupons);

            if (!collected[randomCoupon]) {
                collected[randomCoupon] = true;
                countDistinct++;
            }
        }
        return boxes;
    }

    static double harmo(int n) {
        double sum = 0.0;
        for (int i = 1; i <= n; i++) {
            sum += 1.0 / i;
        }
        return sum;
    }
}