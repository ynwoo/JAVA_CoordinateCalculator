package coordinate.areaStrategy;

import coordinate.shape.Shape;

public interface AreaStrategy {
    double calculateArea(Shape shape);

    String getOutputText();

}
