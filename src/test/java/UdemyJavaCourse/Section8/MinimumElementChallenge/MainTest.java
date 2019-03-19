package UdemyJavaCourse.Section8.MinimumElementChallenge;

import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.runners.MockitoJUnitRunner;

import static org.hamcrest.core.Is.is;

@RunWith(MockitoJUnitRunner.class)
public class MainTest {

    @Test
    public void shouldReturnMinimumValueOfArray() {
        // given
        int minimumValue = -123;
        int[] array = new int[]{21,77,4566,minimumValue};

        // when
        int returnedValue = Main.findMin(array);

        // then
        Assert.assertThat(returnedValue, is(minimumValue));
    }

}
