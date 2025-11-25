import java.util.Arrays;

public class Problem4 {
    public void main() {
        int[][] a = {
                {3, 2, 6, 1, 3, 5, 6, 1, 3},
                {3, 1, 2, 1, 5, 7, 2},
                {8, 9, 2, 1}
        };

        System.out.println("Before:");
        printArr2D(a);

        sortRows(a);

        System.out.println("\nAfter:");
        printArr2D(a);

        int[][] b = {
                {3, 2, 6, 1, 6},
                {7, 1, 2, 1, 5},
                {5, 3, 1, 8, 7},
                {8, 9, 2, 7, 1}
        };

        System.out.println("\nNow columns - Before:");
        printArr2D(b);

        sortCols(b);

        System.out.println("\nAfter:");
        printArr2D(b);
    }

    public static void selSort(int[] arr) {
        if (arr == null || arr.length < 2)
            return;

        int n = arr.length;

        for (int i = 0; i < n - 1; i++) {
            int minIndex = i;

            for (int j = i + 1; j < n; j++)
                if (arr[j] < arr[minIndex])
                    minIndex = j;

            if (minIndex != i) {
                int temp = arr[i];
                arr[i] = arr[minIndex];
                arr[minIndex] = temp;
            }
        }
    }

    public static void sortRows(int[][] arr) {
        for (int[] row : arr)
            selSort(row);
    }

    public static void sortCols(int[][] arr) {
        if (arr == null || arr.length < 2 || arr[0].length == 0)
            return;

        int rows = arr.length;
        int cols = arr[0].length;

        for (int j = 0; j < cols; j++) {
            for (int i = 0; i < rows - 1; i++) {
                int minRowIndex = i;

                for (int k = i + 1; k < rows; k++)
                    if (arr[k][j] < arr[minRowIndex][j])
                        minRowIndex = k;

                if (minRowIndex != i) {
                    int temp = arr[i][j];
                    arr[i][j] = arr[minRowIndex][j];
                    arr[minRowIndex][j] = temp;
                }
            }
        }
    }

    public static void printArr2D(int[][] arr) {
        for (int[] row : arr)
            System.out.println(Arrays.toString(row));
    }
}