public class ReducedTicket extends Ticket {
    @Override
    public double getPrice() {
        return getBasePrice() * 0.50;
    }
}