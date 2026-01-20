public class Problem1 {
    public static void main(String[] args) {
        int[] tab = { 2, 1, 4, 3, 6, 5, 7, 8 };
        Node head = arrayToList(tab);

        showList(head);

        Node[] nodes = extract(head);

        showList(nodes[0]);
        showList(nodes[1]);
    }

    public static Node arrayToList(int[] arr) {
        if (arr == null || arr.length == 0) return null;

        Node head = new Node(arr[0]);
        Node current = head;

        for (int i = 1; i < arr.length; i++) {
            current.next = new Node(arr[i]);
            current = current.next;
        }
        return head;
    }

    public static Node[] extract(Node head) {
        Node evenHead = null, evenTail = null;
        Node oddHead = null, oddTail = null;
        Node current = head;

        while (current != null) {
            Node nextNode = current.next;
            current.next = null;

            if (current.data % 2 == 0) {
                if (evenHead == null) {
                    evenHead = current;
                    evenTail = current;
                } else {
                    evenTail.next = current;
                    evenTail = current;
                }
            } else {
                if (oddHead == null) {
                    oddHead = current;
                    oddTail = current;
                } else {
                    oddTail.next = current;
                    oddTail = current;
                }
            }
            current = nextNode;
        }

        return new Node[]{evenHead, oddHead};
    }

    public static void showList(Node head) {
        Node current = head;
        while (current != null) {
            System.out.print(current.data + " ");
            current = current.next;
        }
        System.out.println();
    }
}