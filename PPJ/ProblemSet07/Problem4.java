import java.util.Arrays;

public class Problem4 {
    void main() {
        int[] arr = {2, 3, 4, 3, 6, 7, 6, 8, 2, 9};
        int evenCount = 0;

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] % 2 == 0) {

                int temp = arr[evenCount];
                arr[evenCount] = arr[i];
                arr[i] = temp;

                evenCount++;
            }
        }
        System.out.println(Arrays.toString(arr));
    }
}