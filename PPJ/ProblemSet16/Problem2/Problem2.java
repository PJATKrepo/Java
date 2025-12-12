// BankExceptions
public class Problem2 {
    void main() {
        Customer[] customers = {
                new Customer("Jane", 60), new Customer("John", 20),
                new Customer("Bill"), new Customer("Sue")
        };
        Bank bank = new Bank(customers);
        bank.deposit("Carol", 20);
        bank.deposit("Bill", 10);
        bank.withdraw("Jane", 110);
        bank.withdraw("Sue", 140);
        bank.deposit("Sue", -40);
        bank.deposit("John", 10);
        bank.withdraw("Jane", 50);
        bank.withdraw("Bill", 90);
    }
}