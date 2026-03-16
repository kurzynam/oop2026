public class Segment {
    private Point p1;
    private Point p2;


    public Point getP1() {
        return p1;
    }

    public void setP1(Point p1) {
        this.p1 = p1;
    }

    public Point getP2() {
        return p2;
    }

    public void setP2(Point p2) {
        this.p2 = p2;
    }

    public Segment(Point p1, Point p2) {
        this.p1 = p1;
        this.p2 = p2;
    }

    public Segment perpendicular(){
        double x1 = p1.getX();
        double y1 = p1.getY();
        double x2 = p2.getX();
        double y2 = p2.getY();
        Point middle = center();
        double dx = x2 - x1;
        double dy = y2 - y1;
        double perpX = -dy;
        double perpY = dx;
        double halfPerpX = perpX/2;
        double halfPerpY = perpY/2;
        Point a = new Point(middle.getX()-halfPerpX, middle.getY()-halfPerpY);
        Point b = new Point(middle.getX()+halfPerpX, middle.getY()+halfPerpY);
        return new Segment(a,b);
    }




    public double length() {
        double dx = p2.getX() - p1.getX();
        double dy = p2.getY() - p1.getY();
        return Math.sqrt(dx * dx + dy * dy);
    }

    public static Segment longestSegment(Segment[] segments) {
        if (segments == null || segments.length == 0) {
            return null;
        }

        Segment longest = segments[0];

        for (Segment s : segments) {
            if (s.length() > longest.length()) {
                longest = s;
            }
        }

        return longest;
    }

    public Point center(){
        return new Point((p1.getX() + p2.getX())/2, (p1.getY() + p2.getY())/2);
    }


    @Override
    public String toString() {
        return "Segment{" +
                "p1=" + p1 +
                ", p2=" + p2 +
                '}';
    }


    public static Polygon createSquare(Segment segment) {
        System.out.println(segment.perpendicular());
        Point[] squaresPoints = new Point[4];
        squaresPoints[0] = segment.getP1();
        squaresPoints[1] = segment.perpendicular().getP1();
        squaresPoints[2] = segment.getP2();
        squaresPoints[3] = segment.perpendicular().getP2();
        return new Polygon(squaresPoints);
    }
}