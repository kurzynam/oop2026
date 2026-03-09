public class Main {

    public static void main(String[] args) {

        Point p1 = new Point(2,7);


        Point p2 = new Point();

        p1.translate(2, 3);
        Point p3 = p1.translated(1, 1);

        Segment s1 = new Segment(p1, p2);
        Segment s2 = new Segment(p2, p3);

        Segment[] segments = {s1, s2};

        System.out.println(s1);
    }
}