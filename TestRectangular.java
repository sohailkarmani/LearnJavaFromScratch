
public class TestRectangular {
    private double length;
    private double width;

    public double getLength() {
        return length;
    }

    public void setLength(double len) {
        this.length = len;
    }

    public double getWidth() {
        return width;
    }

    public void setWidth(double wid) {
        this.width = wid;

    }

    public double getArea() {
        return length * width;

    }

    public double getParimeter() {
        return 2 * length + 2 * width;

    }

}