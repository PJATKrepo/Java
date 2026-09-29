package task07;

import java.util.Collection;
import java.util.List;
import java.util.Random;

public
    class Problem3Test
    implements PerformanceTask {

    private final Collection<Integer> collection;
    private final String collectionName;
    private final int[] data;
    private final boolean isList;

    public Problem3Test(Collection<Integer> collection, int dataSize, int trials) {
        this.collection = collection;
        this.collectionName = collection.getClass().getSimpleName();
        this.isList = collection instanceof List;
        Random rand = new Random(7);

        this.data = new int[dataSize];
        for (int i = 0; i < dataSize; i++)
            data[i] = rand.nextInt(dataSize / 2);
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
        collection.clear();
        for (int val : data) {
            if (isList)
                if (!collection.contains(val)) collection.add(val);
            else
                collection.add(val);

        }
    }
}
