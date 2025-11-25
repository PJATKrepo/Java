class Problem1 {
    void main() {
        int[] a = {2, 3, 2, 4, 3, 1, 6, 3, 2, 3};
        System.out.println("2 -> " + count(a, 0, 2));
        System.out.println("3 -> " + count(a, 0, 3));
        System.out.println("4 -> " + count(a, 0, 4));
        System.out.println("9 -> " + count(a, 0, 9));

        System.out.println("3 (from index 3) -> " + count(a, 3, 3));
    }

    static int count(int[] arr, int from, int what) {
        if (from >= arr.length) {
            return 0;
        }

        int currentElementCount = 0;
        if (arr[from] == what) {
            currentElementCount = 1;
        }

        return currentElementCount + count(arr, from + 1, what);
    }
}