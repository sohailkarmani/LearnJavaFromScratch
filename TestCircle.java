
public class TestCircle {
    private double radius;

    TestCircle() {
        radius = 1;

    }

    TestCircle(double r) {
        radius = r;

    }

    public double getRadius() {

        return radius;

    }

    public double getArea() {
        return 3.14 * radius * radius;

    }
}