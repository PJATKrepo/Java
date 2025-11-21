public class FuncStat {
    public static int fiboR(int n) {
        if (n < 2) {
            return n;
        }
        return fiboR(n - 1) + fiboR(n - 2);
    }

    public static int fiboI(int n) {
        if (n < 2) {
            return n;
        }
        int a = 0;
        int b = 1;
        int result = 0;
        for (int i = 2; i <= n; i++) {
            result = a + b;
            a = b;
            b = result;
        }
        return result;
    }

    public static int factR(int n) {
        if (n <= 1) {
            return 1;
        }
        return n * factR(n - 1);
    }

    public static int factI(int n) {
        int result = 1;
        for (int i = 2; i <= n; i++) {
            result *= i;
        }
        return result;
    }

    public static int gcdR(int a, int b) {
        if (a == 0) return b;
        if (b == 0) return a;
        if (a == b) return a;
        if (a > b) return gcdR(a - b, b);
        return gcdR(a, b - a);
    }

    public static int gcdI(int a, int b) {
        while (b != 0) {
            int temp = b;
            b = a % b;
            a = temp;
        }
        return a;
    }

    public static int maxElem(int[] arr, int from) {
        if (from == arr.length - 1) {
            return arr[from];
        }
        int maxRest = maxElem(arr, from + 1);
        return Math.max(arr[from], maxRest);
    }

    public static int numEven(int[] arr, int from) {
        if (from >= arr.length) {
            return 0;
        }
        int currentCount = (arr[from] % 2 == 0) ? 1 : 0;
        return currentCount + numEven(arr, from + 1);
    }

    public static void reverse(int[] arr, int from) {
        int to = arr.length - 1 - from;

        if (from >= to) {
            return;
        }

        int temp = arr[from];
        arr[from] = arr[to];
        arr[to] = temp;

        reverse(arr, from + 1);
    }

    public static boolean isPalindrom(String s) {
        if (s.length() <= 1) {
            return true;
        }
        if (s.charAt(0) != s.charAt(s.length() - 1)) {
            return false;
        }
        return isPalindrom(s.substring(1, s.length() - 1));
    }
}