public class Rect {
    Point ul;
    Point br;

    static Rect getRect(Point ul, int w, int h) {
        Rect r = new Rect();
        r.ul = ul;
        r.br = Point.getPoint(ul.x + w, ul.y - h);
        return r;
    }

    static Rect getContainingRect(Point[] arr) {
        if (arr == null || arr.length == 0) return null;
        int minX = arr[0].x;
        int maxX = arr[0].x;
        int minY = arr[0].y;
        int maxY = arr[0].y;

        for (int i = 1; i < arr.length; i++) {
            if (arr[i].x < minX) minX = arr[i].x;
            if (arr[i].x > maxX) maxX = arr[i].x;
            if (arr[i].y < minY) minY = arr[i].y;
            if (arr[i].y > maxY) maxY = arr[i].y;
        }

        Rect r = new Rect();
        r.ul = Point.getPoint(minX, maxY);
        r.br = Point.getPoint(maxX, minY);
        return r;
    }

    void showInfo() {
        System.out.println("UL=(" + ul.x + "," + ul.y + ") BR=(" + br.x + "," + br.y + ")");
    }
}