import java.util.Arrays;

public class Problem3 {
    void main() {
        Way ways = new Way();
        int[] arr1 = {1, 2, 3, 4, 5};

        // 1 -->
        int[] newArr1 = ways.firstWay(arr1);
        System.out.println(Arrays.toString(newArr1));


        // 2 -->
        int[] arr2 = {1, 2, 3, 4, 5};
        int[] newArr2 = ways.secondWay(arr2);
        System.out.println(Arrays.toString(newArr2));

        // 3 -->
        int[] arr3 = {1, 2, 3, 4, 5};
        int[]  newArr3 = ways.thirdWay(arr3);
        System.out.println(Arrays.toString(newArr3));

    }
}