public class TaskF {
    void main() {
        while (true) {
            int a = (int)(Math.random() * 6) + 1;
            int b = (int)(Math.random() * 6) + 1;

            int sum = a + b;
            System.out.println("Dice = " + sum);
            if (sum == 9)
                break;
        }
    }
}