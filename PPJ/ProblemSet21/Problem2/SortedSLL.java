public class SortedSLL {
    private Node head;

    public void addSorted(int data) {
        if (head == null || data < head.data) {
            head = new Node(data, head);
        } else {
            Node current = head;
            while (current.next != null && current.next.data < data) {
                current = current.next;
            }
            current.next = new Node(data, current.next);
        }
    }

    public void show() {
        System.out.print("[ ");
        Node current = head;
        while (current != null) {
            System.out.print(current.data + " ");
            current = current.next;
        }
        System.out.println("]");
    }
}