// Excepts
public class Problem1 {
    void main() {
        Car car = new Car();
        while (true) {
            try {
                car.drive100km();
            } catch(NoGasException e) {
                System.err.println(e.getMessage());
                car.fill();
            }
        }
    }
}