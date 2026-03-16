public class Main {

    public static void main(String[] args) throws Exception {

        Point[] triangle = {
                new Point(10, 10),
                new Point(100, 10),
                new Point(50, 80)
        };

        Polygon p1 = new Polygon(triangle,
                "purple", "yellow", 5);

        Point[] square = {
                new Point(120, 20),
                new Point(200, 20),
                new Point(200, 100),
                new Point(120, 100)
        };


        Segment s1 = new Segment(new Point(50,150), new Point(100,230));

        Polygon poly = Segment.createSquare(s1);
        SvgScene scene = new SvgScene();
        scene.addPolygon(poly);
        scene.save("scene.svg");
        System.out.println("SVG zapisany.");


    }
}