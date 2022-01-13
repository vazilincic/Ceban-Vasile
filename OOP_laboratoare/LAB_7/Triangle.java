package figure;

public class Triangle extends Figure {
    private final double side1;
    private final double side2;
    private final double side3;

    public Triangle(double side1, double side2, double side3) {
        if (side1 <= 0 || side2 <= 0 || side3 <= 0 ||
                side1 + side2 < side3 || side1 + side3 < side2 || side2 + side3 < side1) {
            throw new IllegalArgumentException("Invalid triangle side values");
        }
        this.side1 = side1;
        this.side2 = side2;
        this.side3 = side3;
    }

    @Override
    public double getArea() {
        return Math.sqrt((getPerimeter() / 2) * (getPerimeter() / 2 - side1) * (getPerimeter() / 2 - side2) * (getPerimeter() / 2 - side3));
    }

    @Override
    public double getPerimeter() {
        return side1 + side2 + side3;
    }

    @Override
    public String toString() {
        return "Triangle{" +
                "side1=" + side1 +
                ", side2=" + side2 +
                ", side3=" + side3 +
                '}';
    }
}