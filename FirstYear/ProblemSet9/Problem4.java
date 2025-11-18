import java.util.Arrays;

public class Problem4 {

    static int[] maxOfRows(int[][] arr) {
        int[] result = new int[arr.length];

        for (int i = 0; i < arr.length; i++) {
            int max = arr[i][0];
            for (int j = 1; j < arr[i].length; j++) {
                if (arr[i][j] > max) {
                    max = arr[i][j];
                }
            }
            result[i] = max;
        }
        return result;
    }

    void main() {
        int[][] arr = {
                {1, 3},
                {3, 4, 5, 8},
                {6, 8},
                {1, 9, 6}
        };

        int[] result = maxOfRows(arr);
        System.out.println(Arrays.toString(result));
    }
}