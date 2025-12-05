import java.util.Arrays;

public class Problem2 {
    public static void main(String[] args) {
        Vehicle[] vs = {
                new Car("Toyota", 25000, 50.5),
                new Bicycle("Pinarello", 1800),
                new Car("Ford", 21000, 55.1),
                new Bicycle("Canyon", 1600)
        };
        Vehicle.sort(vs);
        System.out.println(Arrays.toString(vs)
                .replaceAll(", ", "\n "));
    }
}