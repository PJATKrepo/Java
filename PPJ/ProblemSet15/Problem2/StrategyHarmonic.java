public class StrategyHarmonic extends Strategy {
    @Override
    public double getMean(double[] data) {
        if (data == null || data.length == 0) return 0.0;
        double reciprocalSum = 0.0;
        for (double v : data) {
            if (v == 0.0) return 0.0;
            reciprocalSum += 1.0 / v;
        }
        if (reciprocalSum == 0.0) return 0.0;
        return data.length / reciprocalSum;
    }
}