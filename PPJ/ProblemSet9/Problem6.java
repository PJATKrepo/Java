public class Problem6 {

    private static int roll() {
        int count = 0;
        while (true) {
            count++;
            int d1 = (int)(Math.random() * 6) + 1;
            int d2 = (int)(Math.random() * 6) + 1;

            if (d1 == 6 && d2 == 6) {
                return count;
            }
        }
    }

    void main() {
        final int SIMULATIONS = 3_000_000;
        int firstRollCount = 0;
        int longRollCount = 0;

        for (int i = 0; i < SIMULATIONS; i++) {
            int throwsNeeded = roll();

            if (throwsNeeded == 1) {
                firstRollCount++;
            }
            if (throwsNeeded >= 128) {
                longRollCount++;
            }
        }

        double pctFirst = (firstRollCount * 100.0) / SIMULATIONS;
        double pctLong = (longRollCount * 100.0) / SIMULATIONS;

        System.out.println("In first roll: " + pctFirst + "%");
        System.out.println("128 or more rolls: " + pctLong + "%");
    }
}