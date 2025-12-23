// ArrAddRemove
import java.util.Arrays;

public class Problem5 {
    public static void main(String[] args) {
        int[] a = {};
        info(a);

        a = add(a, 4);
        a = add(a, 1);
        a = add(a, 3);
        a = add(a, 7);
        a = add(a, 4);
        a = add(a, 2);
        a = add(a, 7);
        a = add(a, 4);
        a = add(a, 8);
        a = add(a, 7);
        a = add(a, 4);
        a = add(a, 5);
        info(a);

        a = delIndex(a, 2);
        a = delLast(a, 7);
        a = delFirst(a, 7);
        info(a);

        a = delAll(a, 4);
        info(a);
    }

    static int[] add(int[] a, int elem) {
        int[] res = new int[a.length + 1];
        int insertIdx = a.length;

        for (int i = 0; i < a.length; i++) {
            if (a[i] >= elem) {
                insertIdx = i;
                break;
            }
        }

        if (insertIdx > 0) {
            System.arraycopy(a, 0, res, 0, insertIdx);
        }
        res[insertIdx] = elem;
        if (insertIdx < a.length) {
            System.arraycopy(a, insertIdx, res, insertIdx + 1, a.length - insertIdx);
        }

        return res;
    }

    static int[] delIndex(int[] a, int ind) {
        int[] res = new int[a.length - 1];
        if (ind > 0) {
            System.arraycopy(a, 0, res, 0, ind);
        }
        if (ind < a.length - 1) {
            System.arraycopy(a, ind + 1, res, ind, a.length - ind - 1);
        }
        return res;
    }

    static int[] delFirst(int[] a, int e) {
        int ind = -1;
        for (int i = 0; i < a.length; i++) {
            if (a[i] == e) {
                ind = i;
                break;
            }
        }
        if (ind == -1) return a;
        return delIndex(a, ind);
    }

    static int[] delLast(int[] a, int e) {
        int ind = -1;
        for (int i = a.length - 1; i >= 0; i--) {
            if (a[i] == e) {
                ind = i;
                break;
            }
        }
        if (ind == -1) return a;
        return delIndex(a, ind);
    }

    static int[] delAll(int[] a, int e) {
        int count = 0;
        for (int val : a) {
            if (val == e) count++;
        }
        if (count == 0) return a;

        int[] res = new int[a.length - count];
        int idx = 0;
        for (int val : a) {
            if (val != e) {
                res[idx++] = val;
            }
        }
        return res;
    }

    static void info(int[] a) {
        System.out.print("Length " + a.length + ": [ ");
        for (int val : a) {
            System.out.print(val + " ");
        }
        System.out.println("]");
    }
}