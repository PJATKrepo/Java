public class NoGasException extends Exception {
    public NoGasException() { }
    public NoGasException(int fuelLevel) {
        super("Only " + fuelLevel + " liters. Must fill the tank");
    }
}