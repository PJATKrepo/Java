public class Car {
    private int fuelLevel = 35;
    private int kilometersTravelled = 0;

    public void fill() {
        if (Math.random() < 0.1) {
            throw new ExplosionException();
        }
        int addedFuel = (int) (Math.random() * 21) + 15;
        fuelLevel += addedFuel;
    }

    public void drive100km() throws NoGasException {
        if (fuelLevel < 10)
            throw new NoGasException(fuelLevel);
        fuelLevel -= 10;
        kilometersTravelled += 100;

        IO.println(kilometersTravelled + "km driven, " + fuelLevel + " liters left");
    }
}