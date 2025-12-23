// ZerosMatrix
public class Problem7 {
    public static void main(String[] args) {
        int[][] a = {
                {4, 9, 10, 0, 1, 2},
                {7, 8, 20, 1, 5, 8},
                {1, 8, 3, 2, 1, -3},
                {1, 8, -3, 2, 11, -3},
                {17, 0, 5, 9, 21, 10}
        };

        printArr(a, "Original matrix");
        setZeros(a);
        printArr(a, "Zeroing rows and columns containing zero");
    }

    public static void setZeros(int[][] arr) {
        if (arr == null || arr.length == 0) return;

        int rows = arr.length;
        int cols = arr[0].length;

        boolean[] rowHasZero = new boolean[rows];
        boolean[] colHasZero = new boolean[cols];

        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                if (arr[i][j] == 0) {
                    rowHasZero[i] = true;
                    colHasZero[j] = true;
                }
            }
        }

        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                if (rowHasZero[i] || colHasZero[j]) {
                    arr[i][j] = 0;
                }
            }
        }
    }

    public static void printArr(int[][] arr, String message) {
        System.out.println(message);
        for (int[] row : arr) {
            for (int val : row) {
                System.out.print(val + "  ");
            }
            System.out.println();
        }
    }
}