package UdemyJavaCourse.Section6.CodingExercise36;

import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.runners.MockitoJUnitRunner;

import static org.hamcrest.core.Is.is;

@RunWith(MockitoJUnitRunner.class)
public class CuboidTest {

    @Test
    public void shouldReturnCorrectVolume() {
        // given
        double initialWidth = 5;
        double initialLength = 10;
        double initialHeight = 5;
        Cuboid cuboid = new Cuboid(initialWidth, initialLength, initialHeight);

        // when
        double width = cuboid.getWidth();
        double length = cuboid.getLength();
        double area = cuboid.getArea();
        double height = cuboid.getHeight();
        double volume = cuboid.getVolume();

        // then
        Assert.assertThat(width, is(initialWidth));
        Assert.assertThat(length, is(initialLength));
        Assert.assertThat(area, is(initialLength * initialWidth));
        Assert.assertThat(height, is(initialHeight));
        Assert.assertThat(volume, is(initialHeight * area));
    }

    @Test
    public void shouldReturnZeroHeightWhenMinusHeightGiven() {
        // given
        double initialWidth = 5;
        double initialLength = 10;
        double initialHeight = -5;
        Cuboid cuboid = new Cuboid(initialWidth, initialLength, initialHeight);

        // when
        double width = cuboid.getWidth();
        double length = cuboid.getLength();
        double area = cuboid.getArea();
        double height = cuboid.getHeight();
        double volume = cuboid.getVolume();

        // then
        Assert.assertThat(width, is(initialWidth));
        Assert.assertThat(length, is(initialLength));
        Assert.assertThat(area, is(initialLength * initialWidth));
        Assert.assertThat(height, is(0.0));
        Assert.assertThat(volume, is(0.0));
    }
}
