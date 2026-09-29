package task10;

import java.util.LinkedList;
import java.util.Queue;

public class Buffer {
    private final Queue<Robot> queue;
    private final int capacity;
    private final String name;
    private boolean closed;

    public Buffer(String name, int capacity) {
        this.name = name;
        this.capacity = capacity;
        this.queue = new LinkedList<>();
        this.closed = false;
    }

    public synchronized void put(Robot robot) throws InterruptedException {
        while (queue.size() >= capacity && !closed) {
            System.out.println("[BUFFER] [" + name + "] Buffer full (" + queue.size() + "/" + capacity + "), "
                    + Thread.currentThread().getName() + " is waiting...");
            wait();
        }

        if (closed) {
            throw new InterruptedException("Buffer " + name + " is closed");
        }

        queue.add(robot);
        robot.setCurrentStatus("WAITING_IN_" + name);
        System.out.println("[BUFFER] [" + name + "] " + robot.getName() + " added to buffer. State: " + queue.size() + "/" + capacity);
        notifyAll();
    }

    public synchronized Robot take() throws InterruptedException {
        while (queue.isEmpty() & !closed) {
            System.out.println("[BUFFER] [" + name + "] Buffer empty, worker is waiting...");
            wait();
        }
        if (queue.isEmpty() & closed) {
            return null;
        }

        Robot robot = queue.poll();
        System.out.println("[BUFFER] [" + name + "] " + robot.getName() + " taken from buffer. State: " + queue.size() + "/" + capacity);
        notifyAll();
        return robot;
    }

    public synchronized void close() {
        this.closed = true;
        System.out.println("[BUFFER] [\" + name + \"] Buffer closed");
        notifyAll();
    }

    public synchronized int size() {
        return queue.size();
    }

    public boolean isClosed() {
        return closed;
    }

    public String getName() {
        return name;
    }
}