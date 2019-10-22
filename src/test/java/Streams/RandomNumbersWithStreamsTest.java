package Streams;

import org.junit.Before;
import org.junit.Test;

import java.util.List;

import static org.hamcrest.Matchers.everyItem;
import static org.hamcrest.Matchers.greaterThanOrEqualTo;
import static org.hamcrest.Matchers.lessThanOrEqualTo;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertThat;

public class RandomNumbersWithStreamsTest {

    private RandomNumbersWithStreams randomNumbersWithStreams;

    @Before
    public void setup() {
        randomNumbersWithStreams = new RandomNumbersWithStreams();
    }

    @Test
    public void shouldReturnCorrectNumberOfDoublesInList() {
        // given
        int lowerBound = 5;
        int upperBound = 10;
        int limit = 2;

        // when
        List<Double> returnedDoubleList = randomNumbersWithStreams.generateRandomDoubleList(lowerBound,upperBound,limit);

        // then
        assertThat(returnedDoubleList, everyItem(greaterThanOrEqualTo((Double.valueOf(lowerBound)))));
        assertThat(returnedDoubleList, everyItem(lessThanOrEqualTo(Double.valueOf(upperBound))));
        assertEquals(returnedDoubleList.size(), limit);
    }

    @Test
    public void shouldReturnCorrectNumberOfIntegersInList() {
        // given
        int lowerBound = 5;
        int upperBound = 10;
        int limit = 2;

        // when
        List<Integer> returnedIntegerList = randomNumbersWithStreams.generateRandomIntegerList(lowerBound,upperBound,limit);

        // then
        assertThat(returnedIntegerList, everyItem(greaterThanOrEqualTo(lowerBound)));
        assertThat(returnedIntegerList, everyItem(lessThanOrEqualTo(upperBound)));

        assertEquals(returnedIntegerList.size(), limit);
    }
}
