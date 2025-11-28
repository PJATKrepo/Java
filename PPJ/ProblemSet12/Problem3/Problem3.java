public class Problem3 {
    void main() {
        Rect rec = Rect.getRect(Point.getPoint(2, 6), 6, 4);
        rec.showInfo();

        Point[] points = {
                Point.getPoint(3, 4), Point.getPoint(5, 6),
                Point.getPoint(1, 3), Point.getPoint(5, 3),
                Point.getPoint(4, 1), Point.getPoint(3, 7)
        };
        Rect cont = Rect.getContainingRect(points);
        cont.showInfo();
    }
}