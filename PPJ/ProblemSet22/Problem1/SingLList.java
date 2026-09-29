public class SingLList {
    private static class Node {
        int data;
        Node next;

        Node(int data, Node next) {
            this.data = data;
            this.next = next;
        }
    }

    private Node head;

    public SingLList() {
        this.head = null;
    }

    public boolean empty() {
        return head == null;
    }

    public void addFront(int d) {
        head = new Node(d, head);
    }

    public void addBack(int d) {
        if (head == null) {
            addFront(d);
            return;
        }
        Node curr = head;
        while (curr.next != null) {
            curr = curr.next;
        }
        curr.next = new Node(d, null);
    }

    public static SingLList arrayToList(int[] arr) {
        SingLList list = new SingLList();
        for (int i : arr) {
            list.addBack(i);
        }
        return list;
    }

    public void removeOdd() {
        while (head != null && head.data % 2 != 0) {
            head = head.next;
        }
        if (head == null) return;

        Node curr = head;
        while (curr.next != null) {
            if (curr.next.data % 2 != 0) {
                curr.next = curr.next.next;
            } else {
                curr = curr.next;
            }
        }
    }

    public boolean contains(int d) {
        Node curr = head;
        while (curr != null) {
            if (curr.data == d) return true;
            curr = curr.next;
        }
        return false;
    }

    public void showList() {
        Node curr = head;
        if (head == null) {
            System.out.println("The list is Empty");
        }
        StringBuilder sb = new StringBuilder();
        while (curr != null) {
            sb.append(curr.data).append(" ");
            curr = curr.next;
        }
        System.out.println(sb.toString().trim());
    }

    public void clear() {
        head = null;
    }

    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5, 6, 7};
        SingLList list = SingLList.arrayToList(arr);
        list.showList();
        list.removeOdd();
        list.showList();
        list.addFront(1);
        list.addBack(8);
        list.showList();
        System.out.println("contains 3? " + list.contains(3));
        System.out.println("contains 8? " + list.contains(8));
        System.out.println(list.empty());
        list.clear();
        list.showList();
        System.out.println(list.empty());
    }
}