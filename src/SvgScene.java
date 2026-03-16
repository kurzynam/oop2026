import java.io.FileWriter;
import java.io.IOException;

public class SvgScene {

    private Polygon[] polygons = new Polygon[3];
    private int index = 0;

    public void addPolygon(Polygon p) {

        polygons[index] = p;

        index++;
        if (index == polygons.length) {
            index = 0;
        }
    }

    public String toSvg() {

        StringBuilder sb = new StringBuilder();

        for (Polygon p : polygons) {
            if (p != null) {
                sb.append(p.toSvg()).append("\n");
            }
        }

        return sb.toString();
    }

    public void save(String path) throws IOException {

        double maxX = 0;
        double maxY = 0;

        for (Polygon p : polygons) {

            if (p == null) continue;

            BoundingBox b = p.boundingBox();

            double x2 = b.x() + b.width();
            double y2 = b.y() + b.height();

            if (x2 > maxX) maxX = x2;
            if (y2 > maxY) maxY = y2;
        }

        FileWriter writer = new FileWriter(path);

        writer.write("<svg xmlns=\"http://www.w3.org/2000/svg\" ");
        writer.write("width=\"" + maxX + "\" height=\"" + maxY + "\">\n");

        writer.write(toSvg());

        writer.write("</svg>");

        writer.close();
    }
}