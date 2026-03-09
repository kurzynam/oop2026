public class Main {

    public static void main(String[] args) {

        Point p1 = new Point();
        p1.x = 1;
        p1.y = 2;

        Point p2 = new Point();
        p2.x = 5;
        p2.y = 6;

        System.out.println(p1);
        System.out.println(p1.toSvg());

        p1.translate(2, 3);
        System.out.println("Po przesunięciu: " + p1);

        Point p3 = p1.translated(1, 1);
        System.out.println("Nowy punkt: " + p3);

        Segment s1 = new Segment(p1, p2);
        Segment s2 = new Segment(p2, p3);

        Segment[] segments = {s1, s2};

        Segment longest = Segment.longestSegment(segments);
        System.out.println("Najdłuższy segment ma długość: " + longest.length());
    }
}