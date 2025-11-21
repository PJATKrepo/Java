public class Problem5 {
    void main() {
        printEgyptian(4, 8);
        printEgyptian(8, 4);
        printEgyptian(3, 4);
        printEgyptian(7, 9);
        printEgyptian(0, 8);
        printEgyptian(7, 0);
        printEgyptian(21, 31);
        printEgyptian(123, 43);
    }

    public static void egyptian(int n, int d) {
        if (d == 0) {
            System.out.print("Denominator is 0!!!");
            return;
        }

        if (n == 0) {
            System.out.print("0");
            return;
        }

        if (n >= d) {
            int whole = n / d;
            System.out.print(whole);

            n = n % d;
            if (n == 0)
                return;

            System.out.print(" + ");
        }

        int x = (int)Math.ceil((double)d / n);
        System.out.print("1/" + x);

        int nNew = n * x - d;
        int dNew = d * x;

        if (nNew == 0)
            return;

        System.out.print(" + ");
        egyptian(nNew, dNew);
    }

    public static void printEgyptian(int n, int d) {
        System.out.print(n + "/" + d + " -> ");
        egyptian(n, d);
        System.out.println();
    }
}