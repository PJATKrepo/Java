package task06;

import java.util.Comparator;

public class ProductComparators {
    public static Comparator<Product> byName() {
        return (p1, p2) -> p1.getName().compareToIgnoreCase(p2.getName());
    }

    public static Comparator<Product> byCode() {
        return (p1, p2) -> p1.getCode().compareTo(p2.getCode());
    }

    public static Comparator<Product> byPriceAscending() {
        return (p1, p2) -> p1.getPriceAfterDiscount().compareTo(p2.getPriceAfterDiscount());
    }

    public static Comparator<Product> byPriceDescending() {
        return (p1, p2) -> p2.getPriceAfterDiscount().compareTo(p1.getPriceAfterDiscount());
    }

    public static Comparator<Product> byCategoryAndPrice() {
        return (p1, p2) -> {
            int catComp = p1.getCategory().compareTo(p2.getCategory());
            if (catComp != 0) return catComp;
            return p1.getPriceAfterDiscount().compareTo(p2.getPriceAfterDiscount());
        };
    }

    public static Comparator<Product> byStockQuantity() {
        return (p1, p2) -> Integer.compare(p2.getStockQuantity(), p1.getStockQuantity());
    }

    public static Comparator<Product> byProfit() {
        return (p1, p2) -> p2.calculatePotentialProfit().compareTo(p1.calculatePotentialProfit());
    }

    public static Comparator<Product> byManufacturer() {
        return (p1, p2) -> {
            int manComp = p1.getManufacturer().compareToIgnoreCase(p2.getManufacturer());
            if (manComp != 0) return manComp;
            return p1.getName().compareToIgnoreCase(p2.getName());
        };
    }

    public static Comparator<Product> byRating() {
        return (p1, p2) -> {
            int ratComp = Double.compare(p2.getRating(), p1.getRating());
            if (ratComp != 0) return ratComp;
            return Integer.compare(p2.getReviewCount(), p1.getReviewCount());
        };
    }

    public static Comparator<Product> byDaysInStock() {
        return (p1, p2) -> Integer.compare(p2.getDaysInStock(), p1.getDaysInStock());
    }

    public static Comparator<Product> byStatus() {
        return (p1, p2) -> {
            int statComp = p1.getStatus().compareTo(p2.getStatus());
            if (statComp != 0) return statComp;
            return Integer.compare(p1.getStockQuantity(), p2.getStockQuantity());
        };
    }

    public static Comparator<Product> multiCriteria() {
        return (p1, p2) -> {
            int res = p1.getCategory().compareTo(p2.getCategory());
            if (res != 0) return res;

            res = Double.compare(p2.getRating(), p1.getRating());
            if (res != 0) return res;

            res = p1.getPriceAfterDiscount().compareTo(p2.getPriceAfterDiscount());
            if (res != 0) return res;

            return p1.getName().compareToIgnoreCase(p2.getName());
        };
    }
}