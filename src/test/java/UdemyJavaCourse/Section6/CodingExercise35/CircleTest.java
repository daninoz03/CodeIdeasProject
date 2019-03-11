package UdemyJavaCourse.Section6.CodingExercise35;

import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.runners.MockitoJUnitRunner;

import static org.hamcrest.core.Is.is;

@RunWith(MockitoJUnitRunner.class)
public class CircleTest {

    @Test
    public void shouldCalculateAreaCorrectly() {
        // given
        double radius = 3.75;
        Circle circle = new Circle(radius);

        // when
        double area = circle.getArea();

        // then
        Assert.assertThat(circle.getRadius(), is(radius));
        Assert.assertThat(area, is(radius*radius*Math.PI));
    }

    @Test
    public void shouldSetRadiusToZeroWhenSetAtMinusNumber() {
        // given
        double radius = -3.75;
        Circle circle = new Circle(radius);

        // when
        double area = circle.getArea();

        // then
        Assert.assertThat(circle.getRadius(), is(0.0));
        Assert.assertThat(area, is(0.0));
    }
}
