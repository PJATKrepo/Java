public class FixedAmountDiscount extends Discount {
    private final double amount;

    public FixedAmountDiscount(double amount) {
        super(String.format("%.2f PLN off", amount));
        if (amount <= 0) {
            throw new IllegalArgumentException("discount value is invalid. Received: " + amount);
        }
        this.amount = amount;
    }

    public double getAmount() {
        return amount;
    }

    @Override
    public double apply(double originalPrice) {
        return Math.max(0, originalPrice - amount);
    }
}