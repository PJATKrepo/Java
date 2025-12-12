public class Bank {
    public static final int MAX_DEBET = 50;
    private final Customer[] customers;

    public Bank(Customer[] customers) {
        this.customers = customers;
    }

    public Customer getCustomerByName(String name) throws NoSuchCustomerException {
        for (Customer customer : customers) {
            if (customer.getName().equals(name)) {
                return customer;
            }
        }
        throw new NoSuchCustomerException(name);
    }

    public void deposit(String name, int amount) {
        try {
            Customer customer = getCustomerByName(name);
            customer.deposit(amount);
        } catch (NoSuchCustomerException | NegativeAmountException e) {
            System.err.println("Cancelled: " + e.getMessage());
        }
    }

    private void checkAssets() {
        int totalAssets = 0;
        for (Customer customer : customers) {
            totalAssets += customer.getBalance();
        }
        if (totalAssets < 0) {
            throw new BankruptcyException();
        }
    }

    public void withdraw(String name, int amount) {
        try {
            Customer customer = getCustomerByName(name);
            customer.withdraw(amount);
            checkAssets();
        } catch (NoSuchCustomerException | NegativeAmountException | InsufficientFundsException e) {
            System.err.println("Cancelled: " + e.getMessage());
        }
    }
}