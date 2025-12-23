import java.awt.Color;

public class Car {
    public String make;
    public Color color;

    public Car(String make, Color color) {
        this.make = make;
        this.color = color;
    }

    @Override
    public String toString() {
        return make + " " + color.toString();
    }
}