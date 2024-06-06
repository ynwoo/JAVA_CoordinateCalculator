import static org.assertj.core.api.Assertions.*;

import coordinate.Point;
import coordinate.shape.Shape;
import coordinate.shape.Triangle;
import org.junit.jupiter.api.Test;

public class TriangleTest {

    @Test
    void 삼각형의_면적을_계산한다() {
        // given
        Shape triangle = new Triangle(new Point(10, 10), new Point(14, 15), new Point(20, 8));

        // when
        triangle.calculateArea();

        // then
        assertThat(triangle.getArea()).isEqualTo(29.0, offset(0.00099));
    }

}
