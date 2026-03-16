public class Style {
    private String fillColor;
    private String strokeColor;
    private double strokeWidth;

    public String getFillColor() {
        return fillColor;
    }

    public void setFillColor(String fillColor) {
        this.fillColor = fillColor;
    }

    public String getStrokeColor() {
        return strokeColor;
    }

    public void setStrokeColor(String strokeColor) {
        this.strokeColor = strokeColor;
    }

    public double getStrokeWidth() {
        return strokeWidth;
    }

    public void setStrokeWidth(double strokeWidth) {
        this.strokeWidth = strokeWidth;
    }

    public Style(String fillColor, String strokeColor, double strokeWidth) {
        this.fillColor = fillColor;
        this.strokeColor = strokeColor;
        this.strokeWidth = strokeWidth;
    }

    public String toSvg(){
        String result = "style=\"fill:" + this.fillColor +
                ";stroke:" + this.strokeColor +
                ";stroke-width:" + this.strokeWidth +
                "\"";
        return result;
    }

//    <svg height="220" width="500" xmlns="http://www.w3.org/2000/svg">
//      <polygon points="100,10 150,190 50,190"
//      style="fill:lime;stroke:purple;stroke-width:3" />
//    </svg>

}
