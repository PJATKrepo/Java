public class Problem2 {
    void main() {
        int[][] arr = {
                {1, 3, 2},
                {3, 4, 8},
                {2, 6, 8},
                {1, 8, 5}
        };

        int maxRowSum = Integer.MIN_VALUE;
        int rowIndex = 0;

        for (int i = 0; i < arr.length; i++) {
            int currentRowSum = 0;
            for (int j = 0; j < arr[i].length; j++) {
                currentRowSum += arr[i][j];
            }

            if (currentRowSum > maxRowSum) {
                maxRowSum = currentRowSum;
                rowIndex = i;
            }
        }

        int maxColumnSum = Integer.MIN_VALUE;
        int columnIndex = 0;
        int columnCount = arr[0].length;

        for (int j = 0; j < columnCount; j++) {
            int currentColumnSum = 0;
            for (int i = 0; i < arr.length; i++) {
                currentColumnSum += arr[i][j];
            }

            if (currentColumnSum > maxColumnSum) {
                maxColumnSum = currentColumnSum;
                columnIndex = j;
            }
        }

        System.out.println("Row index with max sum: " + rowIndex);
        System.out.println("Column index with max sum: " + columnIndex);
    }
}