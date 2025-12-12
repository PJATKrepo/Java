public class NegativeAmountException extends Exception {
    public NegativeAmountException() {
        super("amount negative");
    }
}