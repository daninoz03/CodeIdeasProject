package CodeExercisesWebsite.Challenging;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class LargestPrimeFactorTest {

    private LargestPrimeFactor largestPrimeFactor;

    @Before
    public void setup() {
        largestPrimeFactor = new LargestPrimeFactor();
    }

    @Test
    public void shouldReturnHighestPrimeFactorOf455() {
        // given
        Integer numberToTest = 455;

        // then
        int returnedNumber = largestPrimeFactor.getLargestPrimeFactor(numberToTest);

        // then
        assertEquals(13, returnedNumber);
    }

    @Test
    public void shouldReturnHighestPrimeFactorOf4555() {
        // given
        Integer numberToTest = 4555;

        // then
        int returnedNumber = largestPrimeFactor.getLargestPrimeFactor(numberToTest);

        // then
        assertEquals(911, returnedNumber);
    }
}
