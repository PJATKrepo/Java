package task05.processing;

import task05.container.Pair;
import task05.container.Box;

public class InspectionUtils {
    public static <T> void logInspection(T item) {
        System.out.println("\n=== INSPECTION LOG ===");
        System.out.println("Type : " + item.getClass().getSimpleName());
        System.out.println("Value: " + item);
        System.out.println("======================");
    }

    public static <T> Pair<String, T> label(String id, T item) {
        System.out.println(String.format("[LABELER] Assigning label '%s' to: %s", id, item));
        return new Pair<>(id, item);
    }

    public static <T> void transferBetweenBoxes(Box<T> source, Box<T> destination) {
        T item = source.getAndClear();
        destination.put(item);
        System.out.println("[TRANSFER] Moved: " + item);
    }
}