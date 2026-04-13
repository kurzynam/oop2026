public class SolidFilledPolygon extends Polygon {
    private String color;

    public SolidFilledPolygon(Vec2[] points, String color) {
        super(points);
        this.color = color;
    }

    @Override
    public String toSvg(String params) {
        String newParams = String.format("fill=\"%s\" %s ", color, params);
        return super.toSvg(newParams);
    }
}