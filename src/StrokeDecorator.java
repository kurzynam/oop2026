public class StrokeDecorator extends ShapeDecorator {
    private String color;
    private double width;

    public StrokeDecorator(Shape shape, String color, double width) {
        super(shape);
        this.color = color;
        this.width = width;
    }

    @Override
    public String toSvg(String params) {
        String newParams = String.format(
                "stroke=\"%s\" stroke-width=\"%f\" %s ",
                color, width, params
        );
        return decoratedShape.toSvg(newParams);
    }
}