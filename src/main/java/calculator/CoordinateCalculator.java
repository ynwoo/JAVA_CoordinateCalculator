package calculator;

import coordinate.Point;
import coordinate.shape.Shape;
import coordinate.shape.ShapeFactory;
import java.util.List;
import ui.CoordinateCalculatorView;
import utils.PointUtils;

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
            List<Point> pointList = PointUtils.stringArrayToPointList(stringPointArray);

            Shape shape = ShapeFactory.getShape(length, pointList);

            coordinateCalculatorView.drawCoordinateSystem(shape);
            coordinateCalculatorView.printResult(shape.getOutputText() + shape.getArea());

            isRunning = false;
        }
    }
}
