package task07;

import java.util.List;

public interface PerformanceTask {
    String getListName();
    void execute();
    List<Integer> generateTestData(int size, List<Integer> testData);
}