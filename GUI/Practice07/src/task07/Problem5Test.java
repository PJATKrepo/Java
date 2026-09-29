package task07;

import java.util.Collection;
import java.util.Collections;
import java.util.List;
import java.util.Random;

public
    class Problem5Test
    implements PerformanceTask {

    private final Collection<Integer> collection;
    private final String collectionName;
    private final int[] insertBatch;
    private final int rounds;
    private final boolean needsSort;

    public Problem5Test(Collection<Integer> collection, int dataSize, int trials) {
        this.collection = collection;
        this.collectionName = collection.getClass().getSimpleName();
        this.needsSort = collection instanceof List;
        this.rounds = trials;
        Random rand = new Random(5);

        this.insertBatch = new int[rounds * 10];
        for (int i = 0; i < insertBatch.length; i++)
            insertBatch[i] = rand.nextInt(1_000_000);

        for (int i = 0; i < dataSize; i++)
            collection.add(rand.nextInt(1_000_000));
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
        long sum = 0;
        for (int r = 0; r < rounds; r++) {
            collection.add(insertBatch[r * 10 + (r % 10)]);

            if (needsSort)
                Collections.sort((List<Integer>) collection);

            for (int val : collection)
                sum += val;
        }
        //JIT
        if (sum == Long.MIN_VALUE)
            System.out.print("");
    }
}
