import java.util.Arrays;

public class Problem1 {
    public void main() {
        int[][] a = {
                {1, 2, 3, 4, 5, 6},
                {2, 3, 4, 5, 6, 7},
                {3, 4, 5, 6, 7, 8},
                {4, 5, 6, 7, 8, 9}
        };

        for (int[] r : a)
            System.out.println(Arrays.toString(r));

        System.out.println();

        for (int[] r : trans(a))
            System.out.println(Arrays.toString(r));
    }

    public static int[][] trans(int[][] A) {
        int originalRows = A.length;
        int originalCols = A[0].length;

        int newRows = originalCols;
        int newCols = originalRows;

        int[][] B = new int[newRows][newCols];

        for (int i = 0; i < originalRows; i++) {
            for (int j = 0; j < originalCols; j++)
                B[j][i] = A[i][j];
        }
        return B;
    }
}