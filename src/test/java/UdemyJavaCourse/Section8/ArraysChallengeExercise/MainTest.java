package UdemyJavaCourse.Section8.ArraysChallengeExercise;

import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.runners.MockitoJUnitRunner;

import static org.hamcrest.Matchers.is;

@RunWith(MockitoJUnitRunner.class)
public class MainTest {

    @Test
    public void shouldSortIntegerArray() {
        // given
        int[] array = new int[]{1, 2, 3, 4, 5, 6};

        // when
        int[] returnedArray = Main.sortIntegers(array);

        // then
        Assert.assertThat(returnedArray, is(new int[]{6, 5, 4, 3, 2, 1}));

    }
}
