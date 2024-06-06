package coordinate.areaStrategy;

import coordinate.shape.Shape;
import coordinate.shape.Triangle;

public class TriangleAreaStrategy implements AreaStrategy{

    @Override
    public double calculateArea(Shape shape) {
        Triangle triangle = (Triangle) shape;
        triangle.calculateArea();
        return triangle.getArea();
    }

    @Override
    public String getOutputText() {
        return "삼각형의 넓이는 ";
    }
}
