import java.util.Scanner;

public class Problem1 {
    void main() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("3 children will be created");
        Child[] children = new Child[3];

        for (int i = 0; i < children.length; i++) {
            System.out.print("Name of the child no " + i + ": ");
            String name = scanner.next();
            children[i] = new Child(name);
        }

        Child.printChildren(children);
        System.out.println("Entering the name of the 'giver' starting with 'q' terminates the program");

        while (true) {
            System.out.print("Enter names of 'giver' and 'receiver': ");
            String giverName = scanner.next();
            if (giverName.startsWith("q")) {
                break;
            }
            String receiverName = scanner.next();

            Child giver = Child.getChildByName(children, giverName);
            Child receiver = Child.getChildByName(children, receiverName);

            if (giver == null) {
                System.out.println("No child with name " + giverName);
            }
            if (receiver == null) {
                System.out.println("No child with name " + receiverName);
            }

            if (giver != null && receiver != null) {
                giver.givesCandyTo(receiver);
                Child.printChildren(children);
            }
        }
    }
}