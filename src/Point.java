public class Point {
    private double x;
    private double y;


    public double getX() {
        return x;
    }

    public void setX(double x) {
        this.x = x;
    }

    public double getY() {
        return y;
    }

    public void setY(double y) {
        this.y = y;
    }

    public Point() {
    }
    public Point(double x, double y){
        this.x = x;
        this.y = y;
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