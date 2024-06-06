package ui;

import coordinate.shape.Shape;
import java.util.Scanner;

public class CoordinateCalculatorView {

    private final Scanner scanner;
    private final String INPUT_MESSAGE = "좌표를 입력하세요.";
    private final String ERROR_MESSAGE = "잘못된 값을 입력했습니다.";
    private final Integer MAX_NUMBER = 24;

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
        // TODO: 검증로직 추가
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
        System.out.println("  +-------------------------------------------------------------------");
        System.out.print(" ");
        for (int i = 0; i <= MAX_NUMBER; i+=2) {
            System.out.print(i + "    ");
        }
        System.out.println();
    }
}
