import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class Order {
    private int id;
    private final OrderItem[] items;
    private final Customer customer;
    private final LocalDateTime createdAt;
    private Discount discount;

    private Order(int id, OrderItem[] items, Customer customer, Discount discount) {
        this.id = id;
        this.items = new OrderItem[items.length];
        for (int i = 0; i < items.length; i++) {
            this.items[i] = items[i];
        }
        this.customer = customer;
        this.discount = discount;
        this.createdAt = LocalDateTime.now();
    }

    public int getId() { return id; }
    public Customer getCustomer() { return customer; }
    public Discount getDiscount() { return discount; }
    public void setDiscount(Discount discount) { this.discount = discount; }

    public OrderItem[] getItems() {
        OrderItem[] copy = new OrderItem[items.length];
        for (int i = 0; i < items.length; i++)
            copy[i] = items[i];
        return copy;
    }

    public int getLineCount() { return items.length; }

    public int getItemCount() {
        int count = 0;
        for (OrderItem item : items) {
            count += item.quantity();
        }
        return count;
    }

    public double calculateSubtotal() {
        double sum = 0;
        for (OrderItem item : items) {
            sum += item.totalPrice();
        }
        return sum;
    }

    public double calculateTotal() {
        double subtotal = calculateSubtotal();
        return (discount != null) ? discount.apply(subtotal) : subtotal;
    }

    @Override
    public String toString() {
        return String.format("Order #%d (%s) -> %.2f PLN (%d units)",
                id, customer.name(), calculateTotal(), getItemCount());
    }

    // ->
    public class Receipt {
        private final String cashierName;
        private final String CAFE_NAME = "CAFE \"UNDER JAVA\"";
        private final int WIDTH = 42;

        public Receipt(String cashierName) {
            if (cashierName == null || cashierName.isBlank()) {
                throw new IllegalArgumentException("cashier name cannot be empty");
            }
            this.cashierName = cashierName;
        }

        private String center(String text) {
            int spaces = Math.max(0, (WIDTH - text.length()) / 2);
            return " ".repeat(spaces) + text;
        }

        private String formatLine(String label, double amount) {
            String left = "  " + label;
            String right = String.format("%.2f PLN", amount);
            int spaces = Math.max(1, WIDTH - left.length() - right.length());
            return left + " ".repeat(spaces) + right;
        }

        private String formatNegLine(String label, double amount) {
            String left = "  " + label;
            String right = String.format("-%.2f PLN", amount);
            int spaces = Math.max(1, WIDTH - left.length() - right.length());
            return left + " ".repeat(spaces) + right;
        }

        public String generate() {
            StringBuilder sb = new StringBuilder();
            String sep1 = "=".repeat(WIDTH);
            String sep2 = "-".repeat(WIDTH);
            DateTimeFormatter dtf = DateTimeFormatter.ofPattern("dd.MM.yyyy HH:mm");

            sb.append(sep1).append("\n").append(center(CAFE_NAME)).append("\n").append(sep1).append("\n");
            sb.append("Date:          ").append(createdAt.format(dtf)).append("\n");
            sb.append("Cashier name:  ").append(cashierName).append("\n");
            sb.append("Order num:     #").append(id).append("\n");
            sb.append("Customer:      ").append(customer.name()).append(" [").append(customer.loyaltyLevel()).append("]\n\n");

            for (OrderItem item : items) sb.append(item.formatted()).append("\n");

            sb.append("\n").append(sep2).append("\n");
            double sub = calculateSubtotal();
            sb.append(formatLine("Subtotal:", sub)).append("\n");

            if (discount != null) {
                sb.append(formatNegLine("Discount: " + discount.getDescription(), discount.savings(sub))).append("\n");
            }

            sb.append(sep2).append("\n");
            sb.append(formatLine("TOTAL DUE:", calculateTotal())).append("\n");
            sb.append(sep1).append("\n").append(center("Thank you!")).append("\n").append(sep1).append("\n");

            return sb.toString();
        }
    }

    public static class Builder {
        private static final int INITIAL_CAPACITY = 4;
        private final int id;
        private final Customer customer;
        private OrderItem[] items;
        private int size;
        private Discount discount;

        public Builder(int id, Customer customer) {
            if (id <= 0) throw new IllegalArgumentException("order ID must be greater than zero");
            if (customer == null) throw new IllegalArgumentException("customer cannot be null");
            this.id = id;
            this.customer = customer;
            this.items = new OrderItem[INITIAL_CAPACITY];
            this.size = 0;
        }

        private void grow() {
            OrderItem[] next = new OrderItem[items.length * 2];
            System.arraycopy(items, 0, next, 0, size);
            items = next;
        }

        public Builder addItem(Product product, int quantity) {
            if (size == items.length) grow();
            items[size++] = new OrderItem(product, quantity);
            return this;
        }

        public Builder addItem(Product product) { return addItem(product, 1); }

        public Builder withDiscount(Discount discount) {
            this.discount = discount;
            return this;
        }

        public Order build() {
            if (size == 0) throw new IllegalStateException("order must contain at least one item");
            OrderItem[] trimmed = new OrderItem[size];
            System.arraycopy(items, 0, trimmed, 0, size);
            return new Order(id, trimmed, customer, discount);
        }
    }
}