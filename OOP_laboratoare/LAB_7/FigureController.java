package figure;

import java.util.ArrayList;

public class FigureController {

    public static Figure getMaxArea(ArrayList<Figure> figures) {
        if (figures == null || figures.size() == 0) {
            throw new IllegalArgumentException("Empty list");
        }

        var maxAreaFigure = figures.get(0);
        for (var figure : figures) {
            if (maxAreaFigure.getArea() < figure.getArea()) {
                maxAreaFigure = figure;
            }
        }
        return maxAreaFigure;
    }

    public static Figure getMaxPerimeter(ArrayList<Figure> figures) {
        if (figures == null || figures.size() == 0) {
            throw new IllegalArgumentException("Empty list");
        }

        var maxPerimeterFigure = figures.get(0);
        for (var figure : figures) {
            if (maxPerimeterFigure.getPerimeter() < figure.getPerimeter()) {
                maxPerimeterFigure = figure;
            }
        }
        return maxPerimeterFigure;
    }
}