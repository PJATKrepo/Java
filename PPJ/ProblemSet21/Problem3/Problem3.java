public class Problem3 {

    private static StackNode stackTop = null;

    public static void push(char c, int lineNum) {
        StackNode newNode = new StackNode(c, lineNum);
        newNode.next = stackTop;
        stackTop = newNode;
    }

    public static StackNode pop() {
        if (stackTop == null) return null;
        StackNode temp = stackTop;
        stackTop = stackTop.next;
        return temp;
    }

    public static boolean isEmpty() {
        return stackTop == null;
    }

    public static void main(String[] args) {
        String input = "Warsaw(){\n" +
                "London [xxxx} (\n" +
                "Madrid Paris)}\n" +
                "Berlin";

        String input2 = "Warsaw(){\n" +
                "London [xxxx]} (\n" +
                "Madrid Paris)}\n" +
                "Berlin";

        checkBrackets(input);
        checkBrackets(input2);
    }

    public static void checkBrackets(String text) {
        String[] lines = text.split("\n");

        for (int i = 0; i < lines.length; i++) {
            String line = lines[i];
            int lineNum = i + 1;

            for (int j = 0; j < line.length(); j++) {
                char ch = line.charAt(j);

                if (ch == '(' || ch == '{' || ch == '[') {
                    push(ch, lineNum);
                }
                else if (ch == ')' || ch == '}' || ch == ']') {
                    if (isEmpty()) {
                        printError(lineNum, line, j, "Unexpected closing bracket '" + ch + "'");
                        return;
                    }

                    StackNode lastOpen = pop();
                    if (!isMatchingPair(lastOpen.data, ch)) {
                        printError(lineNum, line, j, "'" + ch + "' found, but '" + getExpectedClose(lastOpen.data) + "' expected.");
                        return;
                    }
                }
            }
        }

        if (!isEmpty()) {
            System.out.println("ERROR: Unclosed brackets remaining.");
            while (!isEmpty()) {
                StackNode node = pop();
                System.out.println("Unclosed '" + node.data + "' from line " + node.lineNum);
            }
        } else {
            System.out.println("OK");
        }
    }

    private static boolean isMatchingPair(char open, char close) {
        return (open == '(' && close == ')') ||
                (open == '{' && close == '}') ||
                (open == '[' && close == ']');
    }

    private static char getExpectedClose(char open) {
        if (open == '(') return ')';
        if (open == '{') return '}';
        if (open == '[') return ']';
        return '?';
    }

    private static void printError(int lineNum, String line, int errorIndex, String message) {
        System.out.println(line);
        for (int k = 0; k < errorIndex; k++) System.out.print(" ");
        System.out.println("^");
        System.out.println("ERROR in line " + lineNum + ". " + message);
    }
}