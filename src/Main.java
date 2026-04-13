import java.io.IOException;

public class Main {
    public static void main(String[] args) throws IOException {
        Polygon triangle = new Polygon(new Vec2[]{
                new Vec2(0, 0),
                new Vec2(300, 0),
                new Vec2(150, 250)
        });

        Polygon rectangle = new Polygon(new Vec2[]{
                new Vec2(350, 0),
                new Vec2(750, 0),
                new Vec2(750, 200),
                new Vec2(350, 200)
        });

        Polygon pentagon = new Polygon(new Vec2[]{
                new Vec2(0, 260),
                new Vec2(100, 460),
                new Vec2(300, 560),
                new Vec2(500, 460),
                new Vec2(600, 260)
        });

        Ellipse ellipse = new Ellipse(new Vec2(500, 700), 400, 100);

        Shape transformed = new TransformationDecorator.Builder()
                .translate(new Vec2(100, 50))
                .rotate(70, new Vec2(0, 0))
                .scale(new Vec2(10, 2))
                .build(triangle);

        SvgScene scene = new SvgScene();
        scene.addShape(transformed);
        scene.addShape(rectangle);
        scene.addShape(pentagon);
        scene.addShape(ellipse);

        scene.save("result.svg");
    }
}
