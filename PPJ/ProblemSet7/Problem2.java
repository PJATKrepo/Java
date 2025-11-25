import java.util.Arrays;

public class Problem2 {
    void main() {
        int[] arr = {1, 2, 3, 4, 5};

        System.out.println(Arrays.toString(arr));
        if (arr.length > 0) {
            int temp = arr[0];

            for (int i = 0; i < arr.length - 1; i++)
                arr[i] = arr[i + 1];

            arr[arr.length - 1] = temp;
        }

        System.out.println(Arrays.toString(arr));
    }
}