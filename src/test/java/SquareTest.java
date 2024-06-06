import static org.assertj.core.api.Assertions.*;

import coordinate.Point;
import coordinate.shape.Shape;
import coordinate.shape.Square;
import org.junit.jupiter.api.Test;

public class SquareTest {

    @Test
    void 사각형의_면적을_계산한다() {
        // given
        Shape square = new Square(new Point(10, 10), new Point(22, 10), new Point(22, 18),
                new Point(10, 18));

        // when
        square.calculateArea();

        // then
        assertThat(square.getArea()).isEqualTo(96);
    }
}
