package figure;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {

        var figures = new ArrayList<Figure>();
        figures.add(new Square(5));
        figures.add(new Rectangle(2, 3));
        figures.add(new Triangle(3, 4, 5));

        var maxAreaFigure = FigureController.getMaxArea(figures);
        var maxPerimeterFigure = FigureController.getMaxPerimeter(figures);
        System.out.println("Task 2");
        System.out.println("Max Area: " + maxAreaFigure.getArea() + " for " + maxAreaFigure);
        System.out.println("Max Perimeter: " + maxPerimeterFigure.getPerimeter() + " for " + maxPerimeterFigure);

        Figure circle = new Figure() {
            private final double radius = 5;

            @Override
            public double getArea() {
                return Math.PI * radius * radius;
            }

            @Override
            public double getPerimeter() {
                return 2 * Math.PI * radius;
            }

            @Override
            public String toString() {
                return "Circle{" +
                        "radius=" + radius +
                        '}';
            }
        };

        figures.add(circle);

        maxAreaFigure = FigureController.getMaxArea(figures);
        maxPerimeterFigure = FigureController.getMaxPerimeter(figures);
        System.out.println("Task 3");
        System.out.println("Max Area: " + maxAreaFigure.getArea() + " for " + maxAreaFigure);
        System.out.println("Max Perimeter: " + maxPerimeterFigure.getPerimeter() + " for " + maxPerimeterFigure);
    }
}