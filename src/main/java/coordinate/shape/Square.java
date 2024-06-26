package coordinate.shape;

import coordinate.Point;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Square implements Shape {

    private final List<Point> pointList;
    private Double area;

    public Square(Point p1, Point p2, Point p3, Point p4) {
        pointList = new ArrayList<>();
        pointList.add(p1);
        pointList.add(p2);
        pointList.add(p3);
        pointList.add(p4);

        calculateArea();
    }

    public Square(List<Point> pointList) {
        this.pointList = pointList;
        calculateArea();
    }

    public void calculateArea() {
        List<Double> lineCandidate = new ArrayList<>();
        Point point = pointList.get(0);
        for (int i = 1; i < pointList.size(); i++) {
            lineCandidate.add(getDistance(point, pointList.get(i)));
        }
        Collections.sort(lineCandidate);
        area = lineCandidate.get(0) * lineCandidate.get(1);
    }

    public Double getArea() {
        return area;
    }

    @Override
    public String getOutputText() {
        return "사각형의 넓이는 ";
    }
}
