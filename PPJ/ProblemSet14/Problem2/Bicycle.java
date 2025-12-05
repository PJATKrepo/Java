class Bicycle extends Vehicle {

    public Bicycle(String n, int p) {
        super(n, p, 0.0);
    }

    @Override
    public String toString() {
        return "Bicycle " + super.getName() + "($" + super.getPrice() + ")";
    }
}
