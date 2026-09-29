public class Car {
    private String make;
    private int price;
    private Car next;

    public Car(String make, int price, Car next) {
        this.make = make;
        this.price = price;
        this.next = next;
    }

    public Car(String make, int price) {
        this(make, price, null);
    }

    public String getMake() {
        return make;
    }

    public int getPrice() {
        return price;
    }

    public Car getNext() {
        return next;
    }

    public void showCars() {
        System.out.print(this + " ");
        if (next != null) {
            next.showCars();
        }
    }

    public void showCarsRev() {
        if (next != null) {
            next.showCarsRev();
        }
        System.out.print(this + " ");
    }

    @Override
    public String toString() {
        return make + " (" + price + ")";
    }
}