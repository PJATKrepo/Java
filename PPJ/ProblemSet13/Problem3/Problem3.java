import java.util.Locale;

public class Problem3 {
    void main() {
        Locale.setDefault(Locale.US);
        Square[] sqs = {
                new Square(2), new Square(1), new Square(3)
        };

        System.out.print("Squares: ");
        for (Square s : sqs) System.out.print(s + " ");
        System.out.print("\nAreas: ");
        for (Square s : sqs) System.out.print(s.getArea() + " ");
        System.out.print("\nPerimeters: ");
        for (Square s : sqs) System.out.print(s.getPerimeter() + " ");
        System.out.print("\nInscribed circles: ");
        for (Square s : sqs) System.out.print(s.getInscribedCircle() + " ");
        System.out.print("\nCircumscribed circles: ");
        for (Square s : sqs) System.out.print(s.getCircumscribedCircle() + " ");

        System.out.println("\n\n...and now circles from squares...");
        Circle[] circles = Square.getCircles(sqs);
        System.out.print("Circles: ");
        for (Circle c : circles) System.out.print(c + " ");
        System.out.print("\nAreas: ");
        for (Circle c : circles) System.out.print(c.getArea() + " ");
        System.out.print("\nInscribed squares: ");
        for (Circle c : circles) System.out.print(c.getInscribedSquare() + " ");
        System.out.print("\nCircumscribed squares: ");
        for (Circle c : circles) System.out.print(c.getCircumscribedSquare() + " ");

        System.out.println("\n\n...and back to squares...");
        Square[] squares = Circle.getSquares(circles);
        System.out.print("Squares: ");
        for (Square s : squares) System.out.print(s + " ");
        System.out.println();
    }
}