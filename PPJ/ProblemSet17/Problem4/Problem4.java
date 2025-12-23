public class Problem4 {
    public static void main(String[] args) {
        int[] arr = {1, 2, 7, 7, 3, 9, 9, 5};

        boolean foundPair1 = false;
        int pair1Value = 0;
        boolean conditionMet = false;

        for (int i = 0; i < arr.length - 1; i++) {
            if (arr[i] == arr[i + 1]) {
                if (!foundPair1) {
                    foundPair1 = true;
                    pair1Value = arr[i];
                } else {
                    if (arr[i] != pair1Value) {
                        conditionMet = true;
                        break;
                    }
                }
                i++;
            }
        }

        System.out.println(conditionMet);
    }
}