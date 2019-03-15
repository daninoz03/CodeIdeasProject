package UdemyJavaCourse.Section8.ReversedArrayChallenge;

import UdemyJavaCourse.Section8.ReverseArrayChallenge.Main;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.runners.MockitoJUnitRunner;

@RunWith(MockitoJUnitRunner.class)
public class MainTest {

    @Test
    public void shouldReverseReturnedArray() {
        // given
        int[] array = new int[]{1, 2, 3, 4, 5, 6, 7, 8, 9};
        int[] expectedReturnedArray = new int[]{9, 8, 7, 6, 5, 4, 3, 2, 1};

        // when
        int[] returnedArray = Main.reverse(array);

        // then
        Assert.assertArrayEquals(returnedArray, expectedReturnedArray);
    }

    @Test
    public void shouldReverseSentArray() {
        // given
        int[] array = new int[]{1, 2, 3, 4, 5, 6, 7, 8, 9};
        int[] expectedReturnedArray = new int[]{9, 8, 7, 6, 5, 4, 3, 2, 1};

        // when
        Main.reverseNewApproachUsingOnlyThePassedArray(array);

        // then
        Assert.assertArrayEquals(array, expectedReturnedArray);
    }
}
