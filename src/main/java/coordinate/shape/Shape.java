package coordinate.shape;

import coordinate.Point;

public interface Shape {

    void calculateArea();

    Double getArea();

    default Double getDistance(Point point1, Point point2) {
        return Math.sqrt(Math.pow(point1.getX() - point2.getX(), 2) + Math.pow(point1.getY()
                - point2.getY(), 2));
    }

    String getOutputText();
}
