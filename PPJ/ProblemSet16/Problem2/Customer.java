public class Customer {
    private int balance;
    private String name;

    public Customer(String name, int balance) {
        this.name = name;
        this.balance = balance;
    }

    public Customer(String name) {
        this(name, 100);
    }

    public String getName() {
        return name;
    }

    public int getBalance() {
        return balance;
    }

    public void deposit(int amount) throws NegativeAmountException {
        if (amount < 0) {
            throw new NegativeAmountException();
        }
        balance += amount;
        System.err.println(name + ": deposit " + amount);
    }

    public void withdraw(int amount) throws NegativeAmountException, InsufficientFundsException {
        if (amount < 0) {
            throw new NegativeAmountException();
        }
        if (amount > balance + Bank.MAX_DEBET) {
            throw new InsufficientFundsException();
        }
        balance -= amount;
        System.err.println(name + ": withdrawal " + amount);
    }
}