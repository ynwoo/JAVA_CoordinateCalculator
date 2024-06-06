package coordinate.shape;

import coordinate.Point;
import java.util.List;

public class ShapeFactory {

    private final static Integer MIN_POINT_COUNT = 2;
    private final static Integer MAX_POINT_COUNT = 4;

    public static Shape getShape(Integer pointCnt, List<Point> pointList) {
        if (pointCnt < MIN_POINT_COUNT || MAX_POINT_COUNT < pointCnt) {
            throw new IllegalArgumentException("point count should be in range.");
        }

        if (pointCnt.equals(MIN_POINT_COUNT)) {
            return new Line(pointList);
        } else if (pointCnt.equals(MAX_POINT_COUNT)) {
            return new Square(pointList);
        } else {
            return new Triangle(pointList);
        }
    }
}
