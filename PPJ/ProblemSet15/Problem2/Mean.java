public class Mean {
    private Strategy strategy;
    private final double[] data;

    public Mean(double[] data) {
        this.data = data;
    }

    public void setStrategy(Strategy strategy) {
        this.strategy = strategy;
    }

    public double getMean() {
        if (strategy == null) {
            throw new IllegalStateException("Strategy must be set before calculating mean!!");
        }
        return strategy.getMean(data);
    }
}