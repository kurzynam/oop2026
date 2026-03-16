import java.util.Arrays;

public class Polygon extends Shape{
    private Point[] points;

    public Polygon(Point[] points, String fillColor, String strokeColor, double strokeWidth)
    {
        super(new Style(fillColor, strokeColor, strokeWidth));
        this.points = points;
    }



    public Polygon(Point[] points) {
        super(null);
        this.points = points;
    }

    @Override
    public String toString() {
        return "Polygon{" +
                "points=" + Arrays.toString(points) +
                '}';
    }

    public Polygon(Polygon copyFrom){
        super(null);
        this.points = copyFrom.points;
        Point[] pointsCopy = new Point[this.points.length];
        Point[] oldPoints = copyFrom.points;

        for (int i = 0; i < pointsCopy.length; i++) {
            Point newPoint = new Point(oldPoints[i].getX(), oldPoints[i].getY());
            pointsCopy[i] = newPoint;
        }
        this.points = pointsCopy;
    }

    @Override
    public String toSvg(){
        String result = "";
        if (style != null) {
            result =  "<polygon points=\"" + listPoints() +
                    "\" " +
                    "" + style.toSvg() +
                    " />";
        }else{
            result =  "<polygon points=\"" + listPoints() +
                    "\" " +
                    " />";
        }
        return result;
    }

    public String listPoints(){
        String result = "";
        for(Point p : points){
            result += p.getX() + "," + p.getY() + " ";
        }
        return result;
    }

    public BoundingBox boundingBox() {

        double minX = points[0].getX();
        double maxX = points[0].getX();
        double minY = points[0].getY();
        double maxY = points[0].getY();

        for (Point p : points) {

            if (p.getX() < minX) minX = p.getX();
            if (p.getX() > maxX) maxX = p.getX();

            if (p.getY() < minY) minY = p.getY();
            if (p.getY() > maxY) maxY = p.getY();
        }

        double width = maxX - minX;
        double height = maxY - minY;

        return new BoundingBox(minX, minY, width, height);
    }


}
