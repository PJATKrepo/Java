class Problem2 {
    void main() {
        int[] a = {1, 4, 5, 7, 9, 10};
        System.out.println("--- Array A: {1, 4, 5, 7, 9, 10} ---");
        for (int i = a[0]; i <= a[a.length-1]; ++i)
            System.out.printf("what=%2d ind=%2d%n",
                    i, binSearchRec(a, i, 0, a.length));
        System.out.println("**************");

        int[] b = {-1, 1, 3, 4, 6};
        System.out.println("--- Array B: {-1, 1, 3, 4, 6} ---");
        for (int i = b[0]; i <= b[b.length-1]; ++i)
            System.out.printf("what=%2d ind=%2d%n",
                    i, binSearchRec(b, i, 0, b.length));
    }

    public static int binSearchRec(int[] a, int what, int from, int to) {
        if (from >= to) {
            return -1;
        }

        int mid = from + (to - from) / 2;

        if (a[mid] == what) {
            return mid;
        }

        if (what < a[mid]) {
            return binSearchRec(a, what, from, mid);
        } else {
            return binSearchRec(a, what, mid + 1, to);
        }
    }
}