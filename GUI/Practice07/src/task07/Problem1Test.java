package task07;

import java.util.List;
import java.util.Random;

public
    class Problem1Test
    implements PerformanceTask {

    private final List<Integer> list;
    private final int trials;
    private final Random random = new Random();

    public Problem1Test(List<Integer> list, int dataSize, int trials) {
        this.list = this.generateTestData(dataSize, list);
        this.trials = trials;
    }

    @Override
    public List<Integer> generateTestData(int size, List<Integer> testData) {
        Random rand = new Random();
        for (int i = 0; i < size; i++) {
            testData.add(rand.nextInt(1_000_000));
        }
        return testData;
    }

    @Override
    public String getListName() {
        return list.getClass().getSimpleName();
    }

    @Override
    public void execute() {
        int size = this.list.size();
        for (int i = 0; i < trials; i++) {
            int index = random.nextInt(size);
            Integer value = list.get(index);

            //JIT
            if (value == null) System.out.print("");
        }
    }


}