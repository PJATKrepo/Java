package task07;

import java.util.Iterator;
import java.util.List;
import java.util.Random;

public
    class Problem7Test
    implements PerformanceTask {

    private final List<Integer> list;
    private final int dataSize;

    public Problem7Test(List<Integer> list, int dataSize, int trials) {
        this.list = list;
        this.dataSize = dataSize;
        this.generateTestData(dataSize, list);
    }

    @Override
    public List<Integer> generateTestData(int size, List<Integer> testData) {
        testData.clear();
        Random rand = new Random(17);
        for (int i = 0; i < size; i++)
            testData.add(rand.nextInt(1_000_000));

        return testData;
    }

    @Override
    public String getListName() {
        return list.getClass().getSimpleName();
    }

    @Override
    public void execute() {
        generateTestData(dataSize, list);
        Iterator<Integer> it = list.iterator();
        int count = 0;
        while (it.hasNext()) {
            it.next();
            if (count % 4 == 0) it.remove();
            count++;
        }
    }
}
