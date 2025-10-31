public class Problem2 {
    void main() {
        int[] a = {-1, -2, -3, -4, -5};
        int min = a[0];
        int max = a[0];
        for (int i = 1; i < a.length; i++) {
            if (min > a[i]) min = a[i];
            if (max < a[i]) max = a[i];
        }
        int diff = max - min;
        IO.println(diff);
    }
}