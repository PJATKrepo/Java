public class Problem6 {
    void main() {
        double a, b, c;
        int trials = 10_000_000;
        int success = 0;

        for (int i = 0; i < trials; i++) {
            a = Math.random();
            b = Math.random();
            c = Math.random();

            double D = b * b - 4 * a * c;
            if (D >= 0) success++;
        }

        double percent = (double) success / trials;

        System.out.println("Percentage of success = " + percent);
        if (percent > 0.25441342) System.out.println("Percent is greater than 0.25441342");
        else if (percent == 0.25441342) System.out.println("Percent is equal than 0.25441342");
        else System.out.println("Percent is less than 0.25441342");
    }
}