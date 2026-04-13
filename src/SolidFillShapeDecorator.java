public class SolidFillShapeDecorator extends ShapeDecorator {
    private String color;

    public SolidFillShapeDecorator(Shape shape, String color) {
        super(shape);
        this.color = color;
    }

    @Override
    public String toSvg(String params) {
        String newParams = String.format("fill=\"%s\" %s ", color, params);
        return decoratedShape.toSvg(newParams);
    }
}