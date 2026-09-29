import java.util.Scanner;
import java.util.Locale;

public class Problem2 {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);

        QueueOfTasks queue = new QueueOfTasks();
        Scanner console = new Scanner(System.in);
        String op = null;

        System.out.println(
                "Enter tasks in the form 'op arg1 arg2' \n" +
                        "where op is + - * / and args are doubles\n" +
                        "Enter 'q' to stop reading"
        );

        while (!(op = console.next()).startsWith("q")) {
            double a = console.nextDouble();
            double b = console.nextDouble();

            Task task = Task.getInstance(op, a, b);
            queue.enqueue(task);
        }

        while (!queue.empty()) {
            Task task = queue.dequeue();
            System.out.println(task.execute());
        }
        console.close();
    }
}