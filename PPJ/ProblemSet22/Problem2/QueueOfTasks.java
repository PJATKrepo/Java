public class QueueOfTasks {

    private static class Node {
        Task task;
        Node next;

        Node(Task task) {
            this.task = task;
            this.next = null;
        }
    }

    private Node head;
    private Node tail;

    public void enqueue(Task t) {
        Node newNode = new Node(t);
        if (tail == null) {
            head = tail = newNode;
        } else {
            tail.next = newNode;
            tail = newNode;
        }
    }

    public Task dequeue() {
        if (head == null) return null;
        Task t = head.task;
        head = head.next;
        if (head == null) {
            tail = null;
        }
        return t;
    }

    public boolean empty() {
        return head == null;
    }
}