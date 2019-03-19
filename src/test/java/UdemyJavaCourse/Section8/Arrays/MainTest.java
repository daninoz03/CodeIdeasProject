package UdemyJavaCourse.Section8.Arrays;

import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.runners.MockitoJUnitRunner;

import java.util.stream.IntStream;

import static org.hamcrest.Matchers.is;

@RunWith(MockitoJUnitRunner.class)
public class MainTest {

    @Test
    public void shouldReturnAverage() {
        // given
        Main main = new Main();
        int[] array = new int[]{1,2,3,4,5,6};
        float expectedAverage = (float) (IntStream.of(array).sum())/array.length;


        // when
        float average = Main.calculateAverage(array);


        // then
        Assert.assertThat(average, is(expectedAverage));
    }
}
