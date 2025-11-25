import java.util.Arrays;

public class Problem4 {
    void main() {
        int[][] arr = { {1, 2, 3}, {4, 5, 6}, {7, 8, 9}, {10, 11, 12}, {13, 14, 15} };
        int index1 = 2;
        int index2 = 4;

        System.out.println("Array before swap:");
        printArray(arr);

        int[] tempRow = arr[index1];
        arr[index1] = arr[index2];
        arr[index2] = tempRow;

        System.out.println("\nArray after swap:");
        printArray(arr);
    }

    public static void printArray(int[][] arr) {
        for (int[] row : arr) {
            System.out.println(Arrays.toString(row));
        }
    }
}