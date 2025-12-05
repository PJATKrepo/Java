public class Vehicle {
    private String name;
    private int price;
    private double mpg;

    public Vehicle(String n, int p, double f) {
        this.name = n;
        this.price = p;
        this.mpg = f;
    }

    @Override
    public String toString() {
        return " ";
    }

    public String getName() {
        if (this.getClass() == Vehicle.class) throw new UnsupportedOperationException();
        return name;
    }

    public int getPrice() {
        if (this.getClass() == Vehicle.class) throw new UnsupportedOperationException();
        return price;
    }

    public double getMpg() {
        if (this.getClass() == Vehicle.class) throw new UnsupportedOperationException();
        return mpg;
    }

    public int compareTo(Vehicle v) {
        boolean thisIsBike = (this instanceof Bicycle);
        boolean otherIsBike = (v instanceof Bicycle);

        if (thisIsBike && !otherIsBike) return -1;
        if (!thisIsBike && otherIsBike) return 1;

        if (thisIsBike) {
            return Integer.compare(this.price, v.price);
        } else {
            return Double.compare(v.mpg, this.mpg);
        }
    }

    public static void sort(Vehicle[] vs) {
        for (int i = 0; i < vs.length - 1; i++) {
            for (int j = 0; j < vs.length - i - 1; j++) {
                if (vs[j].compareTo(vs[j + 1]) > 0) {
                    Vehicle temp = vs[j];
                    vs[j] = vs[j + 1];
                    vs[j + 1] = temp;
                }
            }
        }
    }
}