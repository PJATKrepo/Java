// Arr2DRight
import java.util.Arrays;

public class Problem6 {
    public static void main(String[] args) {
        int[][] a = {
                {1, 2, 3, 4, 5, 6},
                {2, 3, 4, 5, 6, 7},
                {3, 4, 5, 6, 7, 8},
                {4, 5, 6, 7, 8, 9}
        };

        for (int[] r : a)
            System.out.println(Arrays.toString(r));
        System.out.println();

        for (int[] r : right(a))
            System.out.println(Arrays.toString(r));
    }

    public static int[][] right(int[][] arr) {
        int rows = arr.length;
        int cols = arr[0].length;
        int halfCols = cols / 2;

        int[][] res = new int[rows][halfCols];

        for (int i = 0; i < rows; i++) {
            System.arraycopy(arr[i], halfCols, res[i], 0, halfCols);
        }

        return res;
    }
}