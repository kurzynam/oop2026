public class Ellipse extends Shape {
    private Point center;
    private double rx;
    private double ry;

    public Ellipse(Point center, double rx, double ry, Style style) {
        super(style);
        this.center = center;
        this.rx = rx;
        this.ry = ry;
    }

    @Override
    public String toSvg() {
        return String.format(
                "<ellipse cx=\"%f\" cy=\"%f\" rx=\"%f\" ry=\"%f\" %s />",
                center.getX(),
                center.getY(),
                rx,
                ry,
                style.toSvg()
        );
    }
}