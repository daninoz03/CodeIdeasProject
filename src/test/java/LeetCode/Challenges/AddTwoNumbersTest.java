package LeetCode.Challenges;

import org.junit.Assert;
import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

public class AddTwoNumbersTest {

    AddTwoNumbers addTwoNumbers = new AddTwoNumbers();

    @Test
    public void shouldReturnCorrectNumberWhenBothArrayListContainTheSameNumberOfElements() {
        // given
        List<Integer> list1 = new ArrayList<>();
        list1.add(1);
        list1.add(2);
        list1.add(3);

        List<Integer> list2 = new ArrayList<>();
        list2.add(9);
        list2.add(2);
        list2.add(1);

        List<Integer> expectedReturnedList = new ArrayList<>();
        expectedReturnedList.add(0);
        expectedReturnedList.add(5);
        expectedReturnedList.add(4);

        // when
        List<Integer> returnedList = addTwoNumbers.addTwoNumbers(list1, list2);

        // then
        Assert.assertEquals(returnedList,expectedReturnedList);

    }

    @Test
    public void shouldReturnCorrectNumberWhenArrayListsContainDifferentNumberOfElements() {
        // given
        List<Integer> list1 = new ArrayList<>();
        list1.add(1);
        list1.add(2);
        list1.add(9);
        list1.add(2);

        List<Integer> list2 = new ArrayList<>();
        list2.add(9);
        list2.add(3);
        list2.add(4);

        List<Integer> expectedReturnedList = new ArrayList<>();
        expectedReturnedList.add(0);
        expectedReturnedList.add(6);
        expectedReturnedList.add(3);
        expectedReturnedList.add(3);

        // when
        List<Integer> returnedList = addTwoNumbers.addTwoNumbers(list1, list2);

        // then
        Assert.assertEquals(returnedList,expectedReturnedList);
    }
}
