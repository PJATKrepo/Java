public class StrategyArithmetic extends Strategy {
    @Override
    public double getMean(double[] data) {
        if (data == null || data.length == 0) return 0.0;
        double sum = 0.0;
        for (double v : data) {
            sum += v;
        }
        return sum / data.length;
    }
}