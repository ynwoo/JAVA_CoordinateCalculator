package coordinate.areaStrategy;

import coordinate.shape.Shape;
import coordinate.shape.Square;

public class SquareAreaStrategy implements AreaStrategy {

    @Override
    public double calculateArea(Shape shape) {
        Square square = (Square) shape;
        square.calculateArea();
        return square.getArea();
    }

    @Override
    public String getOutputText() {
        return "사각형의 넓이는 ";
    }
}
