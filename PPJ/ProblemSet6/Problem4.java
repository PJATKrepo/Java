public class Problem4 {
    void main() {
        int[] a = {1, 4, 5, 3, 2, 0, 0, 1, 5};
        int[] arr = a;

        findRow(arr);
    }

    void findRow(int[] arr) {
        for (int i = 0; i < arr.length - 2; i++) {
            int first = arr[i];
            if (first > arr[i+1]) {
                if (arr[i+1] > arr[i+2]) {
                    System.out.println(first + " -> " + arr[i+1] + " -> " + arr[i+2]);
                }
            }
            if (first < arr[i+1]) {
                if (arr[i+1] < arr[i+2]) {
                    System.out.println(first + " -> " + arr[i+1] + " -> " + arr[i+2]);
                }
            }
        }
    }
}