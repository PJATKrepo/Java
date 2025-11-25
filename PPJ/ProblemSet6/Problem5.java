import java.util.Arrays;

public class Problem5 {
    void main() {
        int[] a = {4, 3, 1, -2, 4, -2, 2, 4, 3};

        int[] minMaxResult = findMinMax(a);
        int minId = minMaxResult[0];
        int maxId = minMaxResult[1];

        displayArray(a);

        if (minId != maxId)
            swapPlaces(a, minId, maxId);

        displayArray(a);
        printReverse(a);
    }

    // -->
    public static void displayArray(int[] arr) {
        for  (int i = 0; i < arr.length; i++) {
            if (i == arr.length - 1)
                System.out.print(arr[i]);
            else
                System.out.print(arr[i] + ", ");
        }
        System.out.println();
    }

    public static int[] findMinMax(int[] arr) {
        int min = arr[0];
        int max = arr[0];

        int maxId = 0;
        int minId = 0;

        for (int i = 1; i < arr.length; i++) {
            if (min > arr[i]) {
                minId = i;
                min = arr[i];
            } else if (max <= arr[i]) {
                maxId = i;
                max = arr[i];
            }
        }
        return new int[]{minId, maxId};
    }

    public static void swapPlaces(int[] arr, int maxId, int minId) {
        int buff = arr[minId];
        arr[minId] = arr[maxId];
        arr[maxId] = buff;
    }

    public static void printReverse(int[] arr) {
        for (int i = arr.length - 1; i >= 0; i--) {
            System.out.print(arr[i]);
            if (i > 0) {
                System.out.print(", ");
            }
        }
        System.out.println();
    }
}