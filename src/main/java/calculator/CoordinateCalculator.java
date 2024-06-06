package calculator;

import coordinate.Point;
import coordinate.ShapeType;
import coordinate.shape.Shape;
import coordinate.areaStrategy.AreaStrategy;
import coordinate.areaStrategy.AreaStrategyFactory;
import coordinate.shape.ShapeFactory;
import java.util.ArrayList;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import ui.CoordinateCalculatorView;

public class CoordinateCalculator {

    private final CoordinateCalculatorView coordinateCalculatorView;
    private boolean isRunning;

    public CoordinateCalculator(CoordinateCalculatorView coordinateCalculatorView) {
        this.coordinateCalculatorView = coordinateCalculatorView;
        isRunning = true;
    }

    public void run() {
        while (isRunning) {
            String userInput = coordinateCalculatorView.inputCoordinates();
            if (!coordinateCalculatorView.validateUserInput(userInput)) {
                coordinateCalculatorView.printError();
                continue;
            }

            String[] stringPointArray = userInput.split("-");
            int length = stringPointArray.length;
            List<Point> pointList = stringArrayToPointList(stringPointArray);

            Shape shape = ShapeFactory.getShape(length, pointList);
            coordinateCalculatorView.drawCoordinateSystem(shape);
            String result = calculate(shape);

            coordinateCalculatorView.printResult(result);
            isRunning = false;
        }
    }

    private List<Point> stringArrayToPointList(String[] stringPointArray) {
        ArrayList<Point> pointList = new ArrayList<>();
        for (String stringPoint : stringPointArray ) {
            String pattern = "\\((\\d+),(\\d+)\\)";
            Pattern p = Pattern.compile(pattern);
            Matcher m = p.matcher(stringPoint);

            if (m.matches()) {
                int x = Integer.parseInt(m.group(1));
                int y = Integer.parseInt(m.group(2));
                pointList.add(new Point(x,y));
            }
        }
        return pointList;
    }

    private String calculate(Shape shape) {
        ShapeType type = shape.getType();
        AreaStrategy areaStrategy = AreaStrategyFactory.getAreaStrategy(type);
        return areaStrategy.getOutputText() + areaStrategy.calculateArea(shape);
    }
}
