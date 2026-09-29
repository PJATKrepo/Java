package task07;

import java.util.concurrent.TimeUnit;

public
    class BenchmarkRunner {

    public void runTest(PerformanceTask task) {
        long startTime = System.nanoTime();
        task.execute();
        long endTime = System.nanoTime();
        
        long durationNano = endTime - startTime;
		long durationMicro = TimeUnit.NANOSECONDS.toMicros(durationNano);

        System.out.printf("  %-20s -> %4d us%n", task.getListName(), durationMicro);
    }

}