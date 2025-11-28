public class Temperature {
    private double cel;

    public Temperature(double tm, char unit) {
        if (unit == 'C') {
            this.cel = tm;
        } else if (unit == 'F') {
            this.cel = 5.0 / 9.0 * (tm - 32);
        } else if (unit == 'K') {
            this.cel = tm - 273.15;
        }
    }

    public double getInC() {
        return cel;
    }

    public double getInF() {
        return 9.0 / 5.0 * cel + 32;
    }

    public double getInK() {
        return cel + 273.15;
    }
}