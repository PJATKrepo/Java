public class Problem2 {
    public static void main(String[] args) {
        SortedSLL list = new SortedSLL();
        list.addSorted(4);
        list.addSorted(1);
        list.addSorted(6);
        list.addSorted(3);
        list.show(); // Expected: [ 1 3 4 6 ]
    }
}