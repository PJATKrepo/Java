public class StackNode {
    public char data;
    public int lineNum;
    public StackNode next;

    public StackNode(char data, int lineNum) {
        this.data = data;
        this.lineNum = lineNum;
        this.next = null;
    }
}