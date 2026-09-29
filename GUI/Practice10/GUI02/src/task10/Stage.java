package task10;

public class Stage {
    private final String name;
    private final int processingTimeMin;
    private final int processingTimeMax;
    private boolean occupied;
    private Robot currentRobot;
    private int processedCount;

    public Stage(String name, int processingTimeMin, int processingTimeMax) {
        this.name = name;
        this.processingTimeMin = processingTimeMin;
        this.processingTimeMax = processingTimeMax;
        this.occupied = false;
        this.currentRobot = null;
        this.processedCount = 0;
    }

    public synchronized void acquire(Robot robot) throws InterruptedException {
        while (occupied) {
            System.out.println("[STAGE] [" + name + "] Station occupied by " + currentRobot.getName()
                    + ", " + robot.getName() + " is waiting...");
            wait();
        }
        occupied = true;
        currentRobot = robot;
        robot.setCurrentStatus("IN_STAGE_" + name);
        System.out.println("[STAGE] [" + name + "] >>> " + robot.getName() + " starts processing. Station occupied.");
    }

    public void process(Robot robot) throws InterruptedException {
        int time = processingTimeMin + (int)(Math.random() * (processingTimeMax - processingTimeMin));
        System.out.println("[STAGE] [" + name + "] Processing " + robot.getName() + "... (time: " + time + "ms)");
        Thread.sleep(time);
    }

    public synchronized void release(Robot robot) {
        occupied = false;
        currentRobot = null;
        processedCount++;
        robot.setCurrentStatus("DONE_" + name);
        System.out.println("[STAGE] [" + name + "] <<< " + robot.getName() + " finished processing. Station free. Total done: " + processedCount);
        notify();
    }

    public String getName() {
        return name;
    }

    public synchronized int getProcessedCount() {
        return processedCount;
    }

    public synchronized boolean isOccupied() {
        return occupied;
    }
}