import java.util.Locale;

public class Square {
    private double side;

    public Square(double side) {
        this.side = side;
    }

    public Square(Circle c) {
        this.side = Math.sqrt(Math.PI * c.getRadius() * c.getRadius());
    }

    public double getSide() {
        return side;
    }

    public double getArea() {
        return side * side;
    }

    public double getPerimeter() {
        return 4 * side;
    }

    public Circle getInscribedCircle() {
        return new Circle(side / 2);
    }

    public Circle getCircumscribedCircle() {
        return new Circle((side * Math.sqrt(2)) / 2);
    }

    public static Circle[] getCircles(Square[] squares) {
        Circle[] circles = new Circle[squares.length];
        for (int i = 0; i < squares.length; i++) {
            circles[i] = new Circle(squares[i]);
        }
        return circles;
    }

    @Override
    public String toString() {
        return String.format(Locale.US, "Square [%.1f]", side);
    }
}