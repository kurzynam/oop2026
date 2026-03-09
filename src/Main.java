public class Main {

    public static void main(String[] args) {

        Point p1 = new Point(100,100);
        Point p2 = p1.translated(300, 0);
        Point p3 = p2.translated(0, 300);
        Point p4 = p3.translated(-300,0);
        Point[] points = {p1, p2, p3, p4};

        Polygon poly = new Polygon(points);

        System.out.println(poly.toSvg());
    }
}