package UdemyJavaCourse.Section11.PackagesChallenge;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.runners.MockitoJUnitRunner;

import static org.junit.Assert.assertEquals;

@RunWith(MockitoJUnitRunner.class)
public class SeriesTest {

    @Test
    public void shouldReturnCorrectSum() {
        // given
        int passedInt = 9;
        int expectedReturnedInt = 45;

        // when
        int returnedInt = Series.nSum(passedInt);

        // then
        assertEquals(returnedInt, expectedReturnedInt);
    }

    @Test
    public void shouldReturnCorrectFactorial() {
        // given
        int passedInt = 9;
        int expectedReturnedInt = 362880;

        // when
        int returnedInt = Series.factorial(passedInt);

        // then
        assertEquals(returnedInt, expectedReturnedInt);
    }

    @Test
    public void shouldReturnCorrectFibonacciValue() {
        // given
        int passedInt = 9;
        int expectedReturnedInt = 34;

        // then
        int returnedInt = Series.fibonacci(passedInt);

        // when
        assertEquals(returnedInt, expectedReturnedInt);
    }
}
