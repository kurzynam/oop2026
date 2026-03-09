public class Point {
    public double x;
    public double y;

    public Point() {
    }

    @Override
    public String toString() {
        return "Point(x=" + x + ", y=" + y + ")";
    }

    public String toSvg() {
        return "<circle cx=\"" + x + "\" cy=\"" + y + "\" r=\"5\" fill=\"red\" />";
    }

    public void translate(double dx, double dy) {
        x += dx;
        y += dy;
    }

    public Point translated(double dx, double dy) {
        Point p = new Point();
        p.x = this.x + dx;
        p.y = this.y + dy;
        return p;
    }
}