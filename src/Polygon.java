import java.util.Arrays;

public class Polygon {
    private Point[] points;

    public Polygon(Point[] points) {
        this.points = points;
    }

    @Override
    public String toString() {
        return "Polygon{" +
                "points=" + Arrays.toString(points) +
                '}';
    }


    public String toSvg(){
        return "<polygon points=\"" + listPoints() +
                "\" " +
                "style=\"fill:lime;stroke:purple;stroke-width:3\" />";
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
