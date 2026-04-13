public class TransformationDecorator extends ShapeDecorator {
    private String transform;

    public TransformationDecorator(Shape shape, String transform) {
        super(shape);
        this.transform = transform;
    }

    @Override
    public String toSvg(String params) {
        String newParams = String.format("transform=\"%s\" %s ", transform, params);
        return decoratedShape.toSvg(newParams);
    }
    public static class Builder {
        private String transform = "";

        public Builder translate(Vec2 t) {
            transform += String.format("translate(%f %f) ", t.x(), t.y());
            return this;
        }

        public Builder rotate(float angle, Vec2 center) {
            transform += String.format("rotate(%f %f %f) ",
                    angle, center.x(), center.y());
            return this;
        }

        public Builder scale(Vec2 s) {
            transform += String.format("scale(%f %f) ",
                    s.x(), s.y());
            return this;
        }

        public Shape build(Shape shape) {
            return new TransformationDecorator(shape, transform);
        }
    }

}