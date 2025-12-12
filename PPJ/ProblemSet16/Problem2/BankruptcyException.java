public class BankruptcyException extends RuntimeException {
    public BankruptcyException() {
        super("Bank went bankrupt!");
    }
}