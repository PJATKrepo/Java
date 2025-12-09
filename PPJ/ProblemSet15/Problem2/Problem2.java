// Strategies
public class Problem2 {
    void main() {
        double[] data = {2, 3, 4, 5, 6, 7, 8, 9};
        Mean mean = new Mean(data);

        double    meanVal;

        mean.setStrategy(new StrategyArithmetic());
        meanVal  = mean.getMean();
        System.out.printf("%10s strategy: mean = %5.3f\n",
                "Arithmetic", meanVal);

        mean.setStrategy(new StrategyGeometric());
        meanVal  = mean.getMean();
        System.out.printf("%10s strategy: mean = %5.3f\n",
                "Geometric", meanVal);

        mean.setStrategy(new StrategyHarmonic());
        meanVal  = mean.getMean();
        System.out.printf("%10s strategy: mean = %5.3f\n",
                "Harmonic", meanVal);
    }
}