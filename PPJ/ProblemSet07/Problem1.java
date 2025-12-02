import java.util.Arrays;

public class Problem1 {
    void main() {
        int[] arr = {2, 5, 3, 2, 1, 3, 6, 5, 3};

        for (int i = 0; i < arr.length; i++) {
            boolean isFound = false;

            for (int j = 0; j < i; j++) {
                if (arr[i] == arr[j]) {
                    isFound = true;
                    break;
                }
            }
            if (!isFound) {
                System.out.print(arr[i] + " ");
            }
        }
        System.out.println();
    }
}