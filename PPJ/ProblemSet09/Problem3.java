import java.util.Arrays;

public class Problem3 {
    void main() {
        int[] arr = {4, 1, 9, 2, 6, 8, 1, 9};
        System.out.println(Arrays.toString(arr));
        swapMaxMin(arr);
        System.out.println(Arrays.toString(arr));
    }

    static void swapMaxMin(int[] arr) {
        int maxId = arr[0];
        int minId = arr[0];
        for (int i = 1; i < arr.length; i++) {
            if (arr[maxId] < arr[i]) maxId = i;
            if (arr[minId] > arr[i]) minId = i;
        }

        int temp = arr[minId];
        arr[minId] = arr[maxId];
        arr[maxId] = temp;
    }
}