package coordinate.areaStrategy;

import coordinate.ShapeType;
import java.util.HashMap;
import java.util.Map;

public class AreaStrategyFactory {

    private static final Map<ShapeType, AreaStrategy> strategies = new HashMap<>();

    static {
        strategies.put(ShapeType.SQUARE, new SquareAreaStrategy());
        strategies.put(ShapeType.LINE, new LineAreaStrategy());
        strategies.put(ShapeType.Triangle, new TriangleAreaStrategy());
    }

    public static AreaStrategy getAreaStrategy(ShapeType type) {
        if (type == null) {
            throw new IllegalArgumentException("Type should not be null.");
        }
        return strategies.get(type);
    }
}
