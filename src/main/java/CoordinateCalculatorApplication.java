import calculator.CoordinateCalculator;
import ui.CoordinateCalculatorView;

public class CoordinateCalculatorApplication {

    public static void main(String[] args) {
        CoordinateCalculator coordinateCalculator = new CoordinateCalculator(new CoordinateCalculatorView());

        coordinateCalculator.run();
    }

}
