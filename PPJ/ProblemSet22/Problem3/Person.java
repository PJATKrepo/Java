public class Person {
    private String name;
    private Car cars;

    public Person(String name) {
        this.name = name;
        this.cars = null;
    }

    public Person buys(String make, int price) {
        cars = new Car(make, price, cars);
        return this;
    }

    public String getName() {
        return name;
    }

    public void showCars() {
        if (cars != null) {
            cars.showCars();
        }
    }

    public void showCarsRev() {
        if (cars != null) {
            cars.showCarsRev();
        }
    }

    public int getTotalPrice() {
        int total = 0;
        Car curr = cars;
        while (curr != null) {
            total += curr.getPrice();
            curr = curr.getNext();
        }
        return total;
    }

    public boolean hasCar(String make) {
        Car curr = cars;
        while (curr != null) {
            if (curr.getMake().equalsIgnoreCase(make)) {
                return true;
            }
            curr = curr.getNext();
        }
        return false;
    }

    public Car mostExpensive() {
        if (cars == null) return null;

        Car maxCar = cars;
        Car curr = cars.getNext();

        while (curr != null) {
            if (curr.getPrice() > maxCar.getPrice()) {
                maxCar = curr;
            }
            curr = curr.getNext();
        }
        return maxCar;
    }
}