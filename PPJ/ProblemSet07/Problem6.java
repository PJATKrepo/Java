public class Problem6 {
    void main() {
        int[] arr = {2, 3, 4, 3, 6, 7, 6, 8, 2, 9};
        int[] brr = {2, 3, 6, 8, 5, 1};

        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < brr.length; j++) {
                if (arr[i] == brr[j]) {
                    boolean isFirstOccurrence = true;
                    for (int k = 0; k < i; k++) {
                        if (arr[k] == arr[i]) {
                            isFirstOccurrence = false;
                            break;
                        }
                    }

                    if (isFirstOccurrence)
                        System.out.print(arr[i] + " ");
                    break;
                }
            }
        }
        System.out.println();
    }
}