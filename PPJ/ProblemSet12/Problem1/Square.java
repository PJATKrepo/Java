public class Square {
    private double side;

    public Square(double side) {
        this.side = side;
    }

    public Square() {
        this(1);
    }

    public double getSide() {
        return side;
    }

    public double getArea() {
        return side * side;
    }

    public double getDiagonal() {
        return side * Math.sqrt(2);
    }

    public double getPerimeter() {
        return 4 * side;
    }

    public Square getDoubled() {
        return new Square(this.side * 2);
    }

    public static double getTotalArea(Square[] sqs) {
        double total = 0;
        for (Square s : sqs) {
            if (s != null) {
                total += s.getArea();
            }
        }
        return total;
    }

    public static Square getMax(Square[] sqs) {
        if (sqs == null || sqs.length == 0) return null;
        Square maxSq = sqs[0];
        for (int i = 1; i < sqs.length; i++) {
            if (sqs[i] != null) {
                if (maxSq == null || sqs[i].getArea() > maxSq.getArea()) {
                    maxSq = sqs[i];
                }
            }
        }
        return maxSq;
    }

    public String toString() {
        return "Square [" + side + "]";
    }
}