public class Ticket {
    private static double basePrice;

    public static double getBasePrice() {
        return basePrice;
    }

    public static void setBasePrice(double price) {
        basePrice = price;
    }

    public double getPrice() {
        return basePrice;
    }

    public static double getSum(Ticket[] tickets) {
        double totalSum = 0.0;
        for (Ticket t : tickets) {
            totalSum += t.getPrice();
        }
        return totalSum;
    }
}