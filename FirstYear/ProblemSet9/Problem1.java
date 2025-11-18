public class Problem1 {
    void main() {
        int x = 2, y = 3, z = 1;
        System.out.println("Max of " + x + ", " + y + ", " +
                z + " is " + maxOfThree(x, y, z));

        for (int a = 12; a < 16; ++a) {
            System.out.println("Greatest divisor of " +
                    a + " is " + greatestDivisor(a));
        }

        for (int m = 11, n = 5; m >= 3; m -= 2, n += 2) {
            if (areRelativelyPrime(m, n)) {
                System.out.println(m + " and " + n +
                        " are relatively prime");
            }
        }

        for (int m = 2; m <= 100; ++m) {
            if (isPerfect(m)) {
                System.out.println(m + " is perfect");
            }
        }
    }

    static int maxOfThree(int a, int b, int c) {
        if (a >= b && a >= c) return a;
        if (b >= a && b >= c) return b;
        else return c;
    }

    static int greatestDivisor(int n) {
        for (int i = n / 2; i >= 1; i--) {
            if (n % i == 0) {
                return i;
            }
        }
        return 1;
    }

    static boolean areRelativelyPrime(int a, int b) {
        int gcd = 1;
        int smaller = (a < b) ? a : b;
        for (int i = smaller; i >= 1; i--) {
            if (a % i == 0 && b % i == 0) {
                gcd = i;
                break;
            }
        }
        return gcd == 1;
    }

    static boolean isPerfect(int n) {
        int sum = 0;
        for (int i = 1; i <= n / 2; i++) {
            if (n % i == 0) {
                sum += i;
            }
        }
        return sum == n;
    }
}