package task06;

import java.math.BigDecimal;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.EnumMap;
import java.util.List;

public class Order implements Comparable<Order> {
    private static int orderCounter;
    private final int orderNumber;
    private final String customerName;
    private final List<OrderItem> items;
    private final LocalDate orderDate;
    private OrderStatus status;

    Order(String customerName) {
        this.orderNumber = orderCounter++;
        this.customerName = customerName;
        this.items = new ArrayList<>();
        this.orderDate = LocalDate.now();
        this.status = OrderStatus.NEW;
    }

    public int getOrderNumber() { return orderNumber; }
    public String getCustomerName() { return customerName; }
    public List<OrderItem> getItems() { return items; }
    public LocalDate getOrderDate() { return orderDate; }
    public OrderStatus getStatus() { return status; }

    public void setStatus(OrderStatus status) {
        this.status = status;
    }

    public void addItem(Product product, int quantity) {
        if (product.getStockQuantity() < quantity) {
            throw new IllegalStateException("Too few products in stock");
        }
        items.add(new OrderItem(product, quantity));
        product.sell(quantity);
    }

    public BigDecimal calculateTotalValue() {
        BigDecimal total = BigDecimal.ZERO;
        for (OrderItem item : items) {
            total = total.add(item.calculateLineTotal());
        }
        return total;
    }

    public int getItemCount() {
        return items.size();
    }

    public int getTotalProductCount() {
        int total = 0;
        for (OrderItem item : items) {
            total += item.getQuantity();
        }
        return total;
    }

    public EnumMap<Category, Integer> getCategoryStatistics() {
        EnumMap<Category, Integer> statistics = new EnumMap<>(Category.class);
        for (OrderItem item : items) {
            Category cat = item.getProduct().getCategory();
            Integer current = statistics.get(cat);
            if (current == null) {
                statistics.put(cat, item.getQuantity());
            } else {
                statistics.put(cat, current + item.getQuantity());
            }
        }
        return statistics;
    }

    @Override
    public int compareTo(Order other) {
        return this.orderDate.compareTo(other.orderDate);
    }

    @Override
    public String toString() {
        return String.format("Order #%04d | %s | %s | $%.2f | Items: %d | Status: %s",
                orderNumber, customerName,
                orderDate.format(DateTimeFormatter.ofPattern("MM/dd/yyyy")),
                calculateTotalValue(), items.size(), status.getDescription());
    }

    public void displayDetails() {
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("MM/dd/yyyy");
        System.out.println("=".repeat(80));
        System.out.printf("ORDER #%04d%n", orderNumber);
        System.out.println("=".repeat(80));
        System.out.println("Customer:   " + customerName);
        System.out.println("Order date: " + orderDate.format(formatter));
        System.out.println("Status:     " + status.getDescription());
        System.out.println("-".repeat(80));
        for (OrderItem item : items) {
            System.out.printf("%s x %d%n", item.getProduct().getName(), item.getQuantity());
            System.out.printf("  $%.2f x %d = $%.2f%n",
                    item.getUnitPrice(), item.getQuantity(), item.calculateLineTotal());
        }
        System.out.println("-".repeat(80));
        System.out.printf("TOTAL VALUE: $%.2f%n", calculateTotalValue());
        System.out.println("=".repeat(80));
    }

}