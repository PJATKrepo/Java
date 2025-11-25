public class Problem5 {
    void main() {
        int[] arr = {1, 5, 8, 2, 6};
        int max = 0;

        for (int num : arr) {
            if (num > max) {
                max = num;
            }
        }

        for (int i = max; i > 0; i--) {
            for (int j = 0; j < arr.length; j++) {
                if (arr[j] >= i) {
                    System.out.print("*");
                } else {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }
}