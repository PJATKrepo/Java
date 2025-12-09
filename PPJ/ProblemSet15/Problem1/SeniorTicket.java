public class SeniorTicket extends Ticket {
    @Override
    public double getPrice() {
        double reducedPrice = getBasePrice() - 5.00;
        return Math.max(0.0, reducedPrice);
    }
}