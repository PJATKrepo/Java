public class Problem3 {
    void main() {
        int even = 0;
        int[] a = {1, 4, 2, 5, 8, 6};
        int[] arr = a;

        for (int elem : arr) {
            if (elem % 2 == 0)
                even++;
        }

        int[] brr = new int[even];
        int brrIndex = even - 1;

        for (int element : arr) {
            if (element % 2 == 0) {
                brr[brrIndex] = element;
                brrIndex--;
            }
        }

        for (int i = 0; i < brr.length; i++)
            IO.print(brr[i] + "  ");
    }
}