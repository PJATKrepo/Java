public class NoSuchCustomerException extends Exception {
    public NoSuchCustomerException() { }
    public NoSuchCustomerException(String name) {
        super("No such customer: " + name);
    }
}