package task07;

import java.util.Collection;
import java.util.List;
import java.util.Random;

public
    class Problem8Test
    implements PerformanceTask {

    private final Collection<Integer> collection;
    private final String collectionName;
    private final int[] queries;

    public Problem8Test(Collection<Integer> collection, int dataSize, int trials) {
        this.collection = collection;
        this.collectionName = collection.getClass().getSimpleName();
        this.generateTestData(dataSize, null);
        Random rand = new Random(23);
        this.queries = new int[trials];

        int[] dataArr = collection.stream().mapToInt(Integer::intValue).toArray();
        for (int i = 0; i < trials; i++) {
            if (i % 2 == 0)
                queries[i] = dataArr[rand.nextInt(dataArr.length)];
            else
                queries[i] = rand.nextInt(2_000_000) + 1_000_001;
        }
    }

    @Override
    public List<Integer> generateTestData(int size, List<Integer> testData) {
        collection.clear();
        Random rand = new Random(23);
        for (int i = 0; i < size; i++)
            collection.add(rand.nextInt(1_000_000));
        return testData;
    }

    @Override
    public String getListName() {
        return collectionName;
    }

    @Override
    public void execute() {
        int found = 0;
        for (int q : queries) {
            if (collection.contains(q))
                found++;
        }

        //JIT
        if (found < 0)
            System.out.print("");
    }
}
