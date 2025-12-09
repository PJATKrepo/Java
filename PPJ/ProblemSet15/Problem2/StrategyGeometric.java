public class StrategyGeometric extends Strategy {
    @Override
    public double getMean(double[] data) {
        if (data == null || data.length == 0) return 0.0;
        double product = 1.0;
        for (double v : data) {
            product *= v;
        }
        return Math.pow(product, 1.0 / data.length);
    }
}