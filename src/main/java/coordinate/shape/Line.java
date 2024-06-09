package coordinate.shape;

import coordinate.Point;
import java.util.ArrayList;
import java.util.List;

public class Line implements Shape {

    private final List<Point> pointList;
    private Double length;

    public Line(Point p1, Point p2) {
        pointList = new ArrayList<>();
        pointList.add(p1);
        pointList.add(p2);

        calculateArea();
    }

    public Line(List<Point> pointList) {
        this.pointList = pointList;
        calculateArea();
    }

    @Override
    public void calculateArea() {
        length = getDistance(pointList.get(0), pointList.get(1));
    }

    @Override
    public Double getArea() {
        return length;
    }

    @Override
    public String getOutputText() {
        return "두 점 사이의 거리는 ";
    }
}
