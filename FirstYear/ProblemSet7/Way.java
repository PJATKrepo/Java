public class Way {

    public int[] firstWay(int[] arr) {
        int a = 0;
        while (a < 3) {
            if (arr.length > 0) {
                int temp = arr[0];

                for (int i = 0; i < arr.length - 1; i++)
                    arr[i] = arr[i + 1];

                arr[arr.length - 1] = temp;
            }

            a++;
        }
        return arr;
    }

    public int[] secondWay(int[] arr) {
        int[] result = new int[arr.length];
        int n = 3;
        int length = arr.length;

        for (int i = n; i < length; i++) {
            result[i - n] = arr[i];
        }

        for (int i = 0; i < n; i++) {
            result[length - n + i] = arr[i];
        }
        return result;
    }

    public int[] thirdWay(int[] arr) {
        int[] result = new int[arr.length];
        int n = 3;
        int length = arr.length;

        System.arraycopy(arr, n, result, 0, length - n);
        System.arraycopy(arr, 0, result, length - n, n);

        return result;
    }
}