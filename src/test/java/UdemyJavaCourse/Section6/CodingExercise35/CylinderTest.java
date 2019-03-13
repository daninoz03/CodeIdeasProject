package UdemyJavaCourse.Section6.CodingExercise35;

import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.runners.MockitoJUnitRunner;

import static org.hamcrest.core.Is.is;

@RunWith(MockitoJUnitRunner.class)
public class CylinderTest {

    @Test
    public void shouldReturnCorrectVolume() {
        // given
        double radius = 3.2;
        double height = 10.8;
        Cylinder cylinder = new Cylinder(radius, height);

        // when
        double area = cylinder.getArea();
        double volume = cylinder.getVolume();

        // then
        Assert.assertThat(volume, is(height*area));
    }

    @Test
    public void shouldReturnZeroForRadiusWhenMinusNumberGiven() {
        // given
        double radius = -3.2;
        double height = 10.8;
        Cylinder cylinder = new Cylinder(radius, height);

        // when
        double area = cylinder.getArea();
        double volume = cylinder.getVolume();
        double returnedRadius = cylinder.getRadius();

        // then
        Assert.assertThat(volume, is(height*area));
        Assert.assertThat(returnedRadius, is(0.0));
    }

    @Test
    public void shouldReturnZeroForHeightWhenMinusNumberGiven() {
        // given
        double radius = 3.2;
        double height = -10.8;
        Cylinder cylinder = new Cylinder(radius, height);

        // when
        double area = cylinder.getArea();
        double volume = cylinder.getVolume();
        double returnedHeight = cylinder.getHeight();

        // then
        Assert.assertThat(volume, is(0.0));
        Assert.assertThat(returnedHeight, is(0.0));
    }

}
