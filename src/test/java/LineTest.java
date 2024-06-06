import static org.assertj.core.api.Assertions.assertThat;
import static org.assertj.core.api.Assertions.offset;

import coordinate.Point;
import coordinate.shape.Line;
import coordinate.shape.Shape;
import org.junit.jupiter.api.Test;

public class LineTest {
    @Test
    void 선분의_길이를_계산한다() {
        // given
        Shape line = new Line(new Point(10, 10), new Point(14, 15));

        // when
        line.calculateArea();

        // then
        assertThat(line.getArea()).isEqualTo(6.403124, offset(0.00099));
    }
}
