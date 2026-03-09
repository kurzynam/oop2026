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

}
