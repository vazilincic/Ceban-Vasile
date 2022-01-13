package figure;

public class Square extends Figure {
    private final double length;

    public Square(double length) {
        if (length <= 0) {
            throw new IllegalArgumentException("Invalid square length value");
        }
        this.length = length;
    }

    @Override
    public double getArea() {
        return length * length;
    }

    @Override
    public double getPerimeter() {
        return length * 4;
    }

    @Override
    public String toString() {
        return "Square{" +
                "length=" + length +
                '}';
    }
}