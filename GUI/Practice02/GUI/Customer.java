public record Customer(String name, String email, int loyaltyPoints) {

    public Customer {
        if (name == null || name.isBlank()) {
            throw new IllegalArgumentException("Customer name cannot be empty.");
        }
        if (email == null || !email.contains("@")) {
            throw new IllegalArgumentException("Email address is invalid. Received: " + email);
        }
        if (loyaltyPoints < 0) {
            throw new IllegalArgumentException("Number of points cannot be negative.");
        }
    }

    public String loyaltyLevel() {
        if (loyaltyPoints >= 200) return "GOLD";
        if (loyaltyPoints >= 100) return "SILVER";
        if (loyaltyPoints >= 50) return "BRONZE";
        return "STANDARD";
    }

    public String formatted() {
        return String.format("%s - %s (%d pts)", name, loyaltyLevel(), loyaltyPoints);
    }
}