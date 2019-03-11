package UdemyJavaCourse.Section6.CodingExercise36;

import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.runners.MockitoJUnitRunner;

import static org.hamcrest.Matchers.is;

@RunWith(MockitoJUnitRunner.class)
public class RectangleTest {

    @Test
    public void shouldReturnCorrectArea() {
        // given
        double width = 5.5;
        double length = 2.3;
        Rectangle rectangle = new Rectangle(width, length);

        // when
        double area = rectangle.getArea();

        // then
        Assert.assertThat(area, is(width * length));
    }

    @Test
    public void shouldReturnZeroWidthWhenMinusValueGiven() {
        // given
        double width = -5.5;
        double length = 2.3;
        Rectangle rectangle = new Rectangle(width, length);

        // when
        double area = rectangle.getArea();

        // then
        Assert.assertThat(rectangle.getWidth(), is(0.0));
        Assert.assertThat(area, is(0.0));
    }

    @Test
    public void shouldReturnZeroLengthWhenMinusValueGiven() {
        // given
        double width = 5.5;
        double length = -2.3;
        Rectangle rectangle = new Rectangle(width, length);

        // when
        double area = rectangle.getArea();

        // then
        Assert.assertThat(rectangle.getLength(), is(0.0));
        Assert.assertThat(area, is(0.0));
    }
}
