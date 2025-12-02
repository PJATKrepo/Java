public class Problem1 {
    void main() {
        int[][] arr = {
                {1, 2, 10},
                {4, 5, 6},
                {7, 8, 9}
        };

        int sum = calcLastColumnSum(arr);

        System.out.println("Sum of the last column: " + sum);
    }

    int calcLastColumnSum(int[][] arr) {
        int sum = 0;
        int lastColumnIndex = arr[0].length - 1;

        for (int i = 0; i < arr.length; i++) {
            sum += arr[i][lastColumnIndex];
        }
        return sum;
    }
}