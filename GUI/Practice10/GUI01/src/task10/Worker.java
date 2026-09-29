package task10;

public class Worker extends Thread {
    private final CustomBarrier barrier;
    private final int taskDuration;
    private final String taskName;

    public Worker(String name, CustomBarrier barrier, int taskDuration, String taskName) {
        super(name);
        this.barrier = barrier;
        this.taskDuration = taskDuration;
        this.taskName = taskName;
    }

    @Override
    public void run() {
        try {
            executeTask(1);
            barrier.await();

            executeTask(2);
            barrier.await();

            executeTask(3);
            barrier.await();

            System.out.println(Thread.currentThread().getName() + " completed all phases!");
        } catch (InterruptedException e) {
            System.err.println(Thread.currentThread().getName() + " was interrupted.");
            Thread.currentThread().interrupt();
        }
    }

    public void executeTask(int phase) throws InterruptedException {
        System.out.println(Thread.currentThread().getName() + " starting phase " + phase + " (" + taskName + ")");
        Thread.sleep(taskDuration);
        System.out.println(Thread.currentThread().getName() + " completed phase " + phase);
    }
}