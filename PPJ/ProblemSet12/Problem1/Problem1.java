public class Problem1 {
    void main() {
        Square s2 = new Square(2);
        Square s1 = new Square();
        System.out.println(s2 + " " + s1);
        System.out.println("Side " + s2.getSide());
        System.out.println("Area " + s2.getArea());
        System.out.println("Diag " + s2.getDiagonal());
        System.out.println("Perim " + s2.getPerimeter());
        System.out.println("Doubled " + s2.getDoubled());

        Square[] sqs = {s1, s2, new Square(3)};
        System.out.println("Total area: " + Square.getTotalArea(sqs));
        System.out.println("Greatest : " + Square.getMax(sqs));
    }
}