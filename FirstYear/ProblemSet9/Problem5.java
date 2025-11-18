import java.util.Arrays;

public class Problem5 {

    static int[][] inner(int[][] arr) {
        int rows = arr.length;
        int cols = arr[0].length;

        int[][] result = new int[rows - 2][cols - 2];

        for (int i = 0; i < rows - 2; i++) {
            for (int j = 0; j < cols - 2; j++) {
                result[i][j] = arr[i + 1][j + 1];
            }
        }
        return result;
    }

    public static void main(String[] args) {
        int[][] a = {
                {1, 2, 3, 4, 5, 6},
                {2, 3, 4, 5, 6, 7},
                {3, 4, 5, 6, 7, 8},
                {4, 5, 6, 7, 8, 9}
        };

        for (int[] r : a) System.out.println(Arrays.toString(r));
        System.out.println();
        for (int[] r : inner(a)) System.out.println(Arrays.toString(r));
    }
}