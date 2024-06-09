package ui;

import static org.assertj.core.api.Assertions.assertThat;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class CoordinateCalculatorViewTest {
    private CoordinateCalculatorView coordinateCalculatorView;

    @BeforeEach
    void setUp() {
        coordinateCalculatorView = new CoordinateCalculatorView();
    }

    @AfterEach
    void tearDown() {
    }

    @Test
    void 사각형_입력형식을_검증한다() {
        // given
        String userInputText = "(10,10)-(22,10)-(22,18)-(10,18)";

        // when
        boolean isValid = coordinateCalculatorView.validateUserInput(userInputText);

        // then
        assertThat(isValid).isTrue();
    }

    @Test
    void 삼각형_입력형식을_검증한다() {
        // given
        String userInputText = "(10,10)-(14,15)-(20,8)";

        // when
        boolean isValid = coordinateCalculatorView.validateUserInput(userInputText);

        // then
        assertThat(isValid).isTrue();
    }

    @Test
    void 선의_입력형식을_검증한다() {
        // given
        String userInputText = "(10,10)-(14,15)";

        // when
        boolean isValid = coordinateCalculatorView.validateUserInput(userInputText);

        // then
        assertThat(isValid).isTrue();
    }

    @Test
    void 잘못된_입력형식을_검증한다() {
        // given
        String shortInputText = "(10,10)";
        String longInputText = "(10,10)-(10,10)-(10,10)-(10,10)-(10,10)";

        // when
        boolean isValid1 = coordinateCalculatorView.validateUserInput(shortInputText);
        boolean isValid2 = coordinateCalculatorView.validateUserInput(longInputText);

        // then
        assertThat(isValid1).isFalse();
        assertThat(isValid2).isFalse();
    }

    @Test
    void 입력범위를_검증한다() {
        // given
        String squareInputText = "(25,25)-(30,25)-(30,25)-(30,30)";
        String triangleInputText = "(25,25)-(25,30)-(30,25)";
        String lineInputText = "(-10,-10)-(10,10)";

        // when
        boolean isValid1 = coordinateCalculatorView.validateUserInput(squareInputText);
        boolean isValid2 = coordinateCalculatorView.validateUserInput(triangleInputText);
        boolean isValid3 = coordinateCalculatorView.validateUserInput(lineInputText);

        // then
        assertThat(isValid1).isFalse();
        assertThat(isValid2).isFalse();
        assertThat(isValid3).isFalse();
    }

    @Test
    void 직사각형을_검증한다() {
        // given
        String userInputText = "(10,10)-(22,10)-(22,18)-(11,18)";

        // when
        boolean isValid = coordinateCalculatorView.validateUserInput(userInputText);

        // then
        assertThat(isValid).isFalse();
    }
}