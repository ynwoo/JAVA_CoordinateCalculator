package coordinate.shape;

import coordinate.Point;
import coordinate.ShapeType;
import java.util.ArrayList;
import java.util.List;

public class Triangle implements Shape {

    private final List<Point> pointList;
    private Double area;

    public Triangle(Point p1, Point p2, Point p3) {
        pointList = new ArrayList<>();
        pointList.add(p1);
        pointList.add(p2);
        pointList.add(p3);
    }

    public Triangle(List<Point> pointList) {
        this.pointList = pointList;
    }

    @Override
    public void calculateArea() {
        Double a = getDistance(pointList.get(0), pointList.get(1));
        Double b = getDistance(pointList.get(0), pointList.get(2));
        Double c = getDistance(pointList.get(1), pointList.get(2));
        Double s = (a + b + c) / 2;
        area = Math.sqrt(s * (s - a) * (s - b) * (s - c));
    }

    @Override
    public ShapeType getType() {
        return ShapeType.Triangle;
    }

    @Override
    public Double getArea() {
        return area;
    }
}
