package Top5Algorithms;

import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.runners.MockitoJUnitRunner;

import java.util.ArrayList;
import java.util.List;

@RunWith(MockitoJUnitRunner.class)
public class TopOrBottomKAlgorithmTest {

    TopOrBottomKAlgorithm topOrBottomKAlgorithm = new TopOrBottomKAlgorithm();

    @Test
    public void shouldReturnTop3ElementsInArray_whenThereAreNoRepeatingNumbers() {
        // given
        List<Integer> integerList = new ArrayList<>();
        integerList.add(4);
        integerList.add(2);
        integerList.add(8);
        integerList.add(9);
        integerList.add(3);
        integerList.add(1);
        integerList.add(5);

        int numberOfElementsWanted = 3;

        List<Integer> expectedReturnedList = new ArrayList<>();
        expectedReturnedList.add(5);
        expectedReturnedList.add(8);
        expectedReturnedList.add(9);

        // when
        List<Integer> returnedList = topOrBottomKAlgorithm.getTopKElements(integerList, numberOfElementsWanted);

        // then
        Assert.assertEquals(returnedList, expectedReturnedList);
    }


    @Test
    public void shouldReturnTop3ElementsInArray_whenThereAreRepeatingNumbers() {
        // given
        List<Integer> integerList = new ArrayList<>();
        integerList.add(4);
        integerList.add(2);
        integerList.add(8);
        integerList.add(9);
        integerList.add(3);
        integerList.add(3);
        integerList.add(5);

        int numberOfElementsWanted = 3;

        List<Integer> expectedReturnedList = new ArrayList<>();
        expectedReturnedList.add(5);
        expectedReturnedList.add(8);
        expectedReturnedList.add(9);

        // when
        List<Integer> returnedList = topOrBottomKAlgorithm.getTopKElements(integerList, numberOfElementsWanted);

        // then
        Assert.assertEquals(returnedList, expectedReturnedList);
    }

    @Test
    public void shouldReturnBottom3ElementsInArray_whenThereAreNoRepeatingNumbers() {
        // given
        List<Integer> integerList = new ArrayList<>();
        integerList.add(4);
        integerList.add(2);
        integerList.add(8);
        integerList.add(9);
        integerList.add(3);
        integerList.add(1);
        integerList.add(5);

        int numberOfElementsWanted = 3;

        List<Integer> expectedReturnedList = new ArrayList<>();
        expectedReturnedList.add(1);
        expectedReturnedList.add(2);
        expectedReturnedList.add(3);

        // when
        List<Integer> returnedList = topOrBottomKAlgorithm.getBottomKElements(integerList, numberOfElementsWanted);

        // then
        Assert.assertEquals(returnedList, expectedReturnedList);
    }

    @Test
    public void shouldReturnBottom3ElementsInArray_whenThereAreRepeatingNumbers() {
        // given
        List<Integer> integerList = new ArrayList<>();
        integerList.add(4);
        integerList.add(2);
        integerList.add(8);
        integerList.add(8);
        integerList.add(3);
        integerList.add(1);
        integerList.add(5);

        int numberOfElementsWanted = 3;

        List<Integer> expectedReturnedList = new ArrayList<>();
        expectedReturnedList.add(1);
        expectedReturnedList.add(2);
        expectedReturnedList.add(3);

        // when
        List<Integer> returnedList = topOrBottomKAlgorithm.getBottomKElements(integerList, numberOfElementsWanted);

        // then
        Assert.assertEquals(returnedList, expectedReturnedList);
    }
}
