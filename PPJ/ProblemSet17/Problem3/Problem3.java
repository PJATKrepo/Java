import java.util.Arrays;

public class Problem3 {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5, 6};

        int half = arr.length / 2;
        for (int i = 0; i < half / 2; i++) {
            int temp = arr[i];
            arr[i] = arr[half - 1 - i];
            arr[half - 1 - i] = temp;
        }

        System.out.println(Arrays.toString(arr));
    }
}