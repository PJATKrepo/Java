import java.util.Arrays;

public class Problem7 {
    void main() {
        int[] arra = {3, 5, 8, 9, 11, 13, 14, 14, 19};
        int[] arrb = {15, 11, 2, 2, 0, -1};

        int[] arrc = new int[arra.length + arrb.length];

        int i = 0;
        int j = arrb.length - 1;
        int k = 0;

        while (i < arra.length && j >= 0) {
            if (arra[i] <= arrb[j]) {
                arrc[k] = arra[i];
                i++;
            } else {
                arrc[k] = arrb[j];
                j--;
            }
            k++;
        }

        while (i < arra.length) {
            arrc[k] = arra[i];
            i++;
            k++;
        }

        while (j >= 0) {
            arrc[k] = arrb[j];
            j--;
            k++;
        }

        System.out.println(Arrays.toString(arrc));
    }
}