import java.util.Locale;

public class Circle {
    private double radius;

    public Circle(double radius) {
        this.radius = radius;
    }

    public Circle(Square s) {
        this.radius = Math.sqrt(s.getArea() / Math.PI);
    }

    public double getRadius() {
        return radius;
    }

    public double getArea() {
        return Math.PI * radius * radius;
    }

    public double getPerimeter() {
        return 2 * Math.PI * radius;
    }

    public Square getInscribedSquare() {
        return new Square(radius * Math.sqrt(2));
    }

    public Square getCircumscribedSquare() {
        return new Square(radius * 2);
    }

    public static Square[] getSquares(Circle[] circles) {
        Square[] squares = new Square[circles.length];
        for (int i = 0; i < circles.length; i++) {
            squares[i] = new Square(circles[i]);
        }
        return squares;
    }

    @Override
    public String toString() {
        return String.format(Locale.US, "Circle [%.2f]", radius);
    }
}