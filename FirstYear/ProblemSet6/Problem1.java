public class Problem1 {
    void main() {
        int[] a = {1, 2, 3, 4, 5};
        displayArray(a);
    }

    public static void displayArray(int[] arr) {
        for (int i = 0; i < arr.length; i++)
            IO.print(arr[i] + "  ");
    }
}