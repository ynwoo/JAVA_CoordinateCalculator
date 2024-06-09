package ui;

import coordinate.shape.Shape;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class CoordinateCalculatorView {

    private final Scanner scanner;
    private final String INPUT_MESSAGE = "좌표를 입력하세요.";
    private final String ERROR_MESSAGE = "잘못된 값을 입력했습니다.";
    private final Integer MAX_NUMBER = 24;
    private static final String SQUARE_PATTERN = "\\((\\d+),(\\d+)\\)-\\((\\d+),(\\d+)\\)-\\((\\d+),(\\d+)\\)-\\((\\d+),(\\d+)\\)";
    private static final String TRIANGLE_PATTERN = "\\((\\d+),(\\d+)\\)-\\((\\d+),(\\d+)\\)-\\((\\d+),(\\d+)\\)";
    private static final String LINE_PATTERN = "\\((\\d+),(\\d+)\\)-\\((\\d+),(\\d+)\\)";

    public CoordinateCalculatorView() {
        scanner = new Scanner(System.in);
    }

    public String inputCoordinates() {
        System.out.println(INPUT_MESSAGE);
        return scanner.nextLine();
    }

    public void printResult(String result) {
        System.out.println(result);
    }

    public boolean validateUserInput(String userInput) {
        // TODO: 검증로직 추가 - 사각형일 때 마름모 및 사다리꼴 확인
        // 1. 사각형, 삼각형, 선인 입력한 허용
        // 2. 숫자 범위 검증

        Pattern squarePattern = Pattern.compile(SQUARE_PATTERN);
        Pattern trianglePattern = Pattern.compile(TRIANGLE_PATTERN);
        Pattern linePattern = Pattern.compile(LINE_PATTERN);

        Matcher squareMatcher = squarePattern.matcher(userInput);
        Matcher triangleMatcher = trianglePattern.matcher(userInput);
        Matcher lineMatcher = linePattern.matcher(userInput);
        if (!squareMatcher.matches() && !triangleMatcher.matches() && !lineMatcher.matches()) {
            return false;
        }

        Pattern numberPattern = Pattern.compile("\\d+");
        Matcher numberMatcher = numberPattern.matcher(userInput);
        while (numberMatcher.find()) {
            int number = Integer.parseInt(numberMatcher.group());
            if (number < 0 || number > 24) {
                return false;
            }
        }

        return true;
    }

    public void printError() {
        System.out.println(ERROR_MESSAGE);
    }

    public void drawCoordinateSystem(Shape shape) {
        // TODO: 화면에 좌표 점 찍기
        for (int i = MAX_NUMBER; i > 0; i -= 2) {
            if (i < 10) {
                System.out.println(" " + i + "|");
            } else {
                System.out.println(i + "|");
            }
            System.out.println("  |");
        }
        System.out.println(
                "  +-------------------------------------------------------------------");
        System.out.print(" ");
        for (int i = 0; i <= MAX_NUMBER; i += 2) {
            System.out.print(i + "    ");
        }
        System.out.println();
    }
}
