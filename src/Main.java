public class Main {

    public static void main(String[] args) throws Exception {

        Point[] triangle = {
                new Point(10, 10),
                new Point(100, 10),
                new Point(50, 80)
        };

        Polygon p1 = new Polygon(triangle);

        Point[] square = {
                new Point(120, 20),
                new Point(200, 20),
                new Point(200, 100),
                new Point(120, 100)
        };

        Polygon p2 = new Polygon(square);

        SvgScene scene = new SvgScene();

        scene.addPolygon(p1);
        scene.addPolygon(p2);

        scene.save("scene.svg");

        System.out.println("SVG zapisany.");
    }
}