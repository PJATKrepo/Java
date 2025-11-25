public class Problem2 {
    void main() {
        double[][] arr1 = {
                {1.0, 2.0, 3.0},
                {4.0, 5.0, 6.0},
                {7.0, 8.0, 9.0}
        };
        double[][] arr2 = {
                {1.0, 2.0, 3.0},
                {4.0, 5.0, 6.0},
                {7.0, 8.0, 9.0}
        };

        double[][] arr3 = {
                {1.0, 2.0, 3.0},
                {4.0, 5.0, 6.0},
                {7.0, 8.0, 9.0},
                {2., 6., 2.}
        };

        double[][] arr4 = {
                {2.0, 2.0, 2.0},
                {2.0, 2.0, 2.0},
                {2.0, 2.0, 2.0}
        };

        // isRectangular
        IO.println("Is rectangular:   " +isRectangular(arr3));

        // isSquare
        IO.println("Is square:        " + isSquare(arr1));

        // isSymmetric
        IO.println("Is symmetric:     " + isSymmetric(arr3));

        // isSameShape
        IO.println("Is same shape:    " + isSameShape(arr1, arr2));

        // isSame
        IO.println("Is same:          " + isSame(arr1, arr2));
    }

    public static boolean isRectangular(double[][] arr) {
        boolean rectangular = false;
        if (arr.length != arr[0].length) rectangular = true;
        return rectangular;
    }

    public static boolean isSquare(double[][] arr) {
        boolean square = false;
        if (arr.length == arr[0].length) square = true;
        return square;
    }

    public static boolean isSymmetric(double[][] arr) {
        boolean symmetric = true;
        if (!isSquare(arr)) return symmetric = false;
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[0].length; j++) {
                if (arr[i][j] != arr[j][i]) symmetric = false;
            }
        }
        return symmetric;
    }

    // ->
    public static boolean isSameShape(double[][] arr1, double[][] arr2) {
        boolean same = false;
        if (arr1.length == arr2.length && arr1[0].length == arr2[0].length) same = true;
        return same;
    }

    public static boolean isSame(double[][] arr1, double[][] arr2) {
        boolean same = false;
        if (arr1.length == arr2.length && arr1[0].length == arr2[0].length) {
            for (int i = 0; i < arr1.length; i++) {
                for (int j = 0; j < arr1[0].length; j++)
                    if (arr1[i][j] != arr2[i][j]) same = false;
                else same = true;
            }
        } else same = false;
        return same;
    }
}