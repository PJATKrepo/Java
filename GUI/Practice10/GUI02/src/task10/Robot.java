package task10;

public class Robot {
    private static int counter = 0;
    private final int id;
    private final String name;
    private volatile String currentStatus;
    private final long createdAt;

    public Robot() {
        counter++;
        this.id = counter;
        this.name = "Robot-" + String.format("%03d", id);
        currentStatus = "CREATED";
        createdAt = System.currentTimeMillis();
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public String getCurrentStatus() {
        return currentStatus;
    }

    public void setCurrentStatus(String status) {
        this.currentStatus = status;
    }

    public long getCreatedAt() {
        return createdAt;
    }

    @Override
    public String toString() {
        return name;
    }
}