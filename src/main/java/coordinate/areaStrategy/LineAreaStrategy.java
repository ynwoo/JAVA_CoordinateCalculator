package coordinate.areaStrategy;

import coordinate.shape.Line;
import coordinate.shape.Shape;

public class LineAreaStrategy implements AreaStrategy {

    @Override
    public double calculateArea(Shape shape) {
        Line line = (Line) shape;
        line.calculateArea();
        return line.getArea();
    }

    @Override
    public String getOutputText() {
        return "두 점 사이의 거리는 ";
    }
}
