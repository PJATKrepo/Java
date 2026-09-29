package task07;

import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;
import java.util.Random;

public
    class Problem10Test
    implements PerformanceTask {

    private final String collectionName;
    private final int trials;
    private final int[] values;
    private final int type;

    public Problem10Test(Object collection, int dataSize, int trials) {
        this.collectionName = collection.getClass().getSimpleName();
        this.trials = trials;
        if (collection instanceof ArrayDeque)
            type = 0;
        else
            if (collection instanceof LinkedList)
                type = 1;
            else
                type = 2;
        Random rand = new Random(37);
        this.values = new int[trials];
        for (int i = 0; i < trials; i++)
            values[i] = rand.nextInt(1_000_000);
    }

    @Override
    public List<Integer> generateTestData(int size, List<Integer> testData) {
        return testData;
    }

    @Override
    public String getListName() {
        return collectionName;
    }

    @Override
    public void execute() {
        switch (type) {
            case 0 -> {
                Queue<Integer> q = new ArrayDeque<>();
                for (int v : values) {
                    q.offer(v);
                    q.poll();
                }
            }
            case 1 -> {
                Queue<Integer> q = new LinkedList<>();
                for (int v : values) {
                    q.offer(v);
                    q.poll();
                }
            }
            case 2 -> {
                ArrayList<Integer> al = new ArrayList<>();
                for (int v : values) {
                    al.add(v);
                    if (!al.isEmpty())
                        al.remove(0);
                }
            }
        }
    }
}
