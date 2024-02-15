package Top5Algorithms;

import Top5Algorithms.HelperClasses.CombinationSumListComparator;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.runners.MockitoJUnitRunner;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

@RunWith(MockitoJUnitRunner.class)
public class CombinationSumTest {

    CombinationSum combinationSum;

    @Test
    public void shouldReturnListOfArraysWhereNumbersAddUpTo8() {
        // given
        ArrayList<Integer> arr = new ArrayList<>();
        arr.add(2);
        arr.add(4);
        arr.add(6);
        arr.add(8);

        int sum = 8;

        List<Integer> expectedResult1 = new ArrayList<>();
        expectedResult1.add(2);
        expectedResult1.add(2);
        expectedResult1.add(2);
        expectedResult1.add(2);

        List<Integer> expectedResult2 = new ArrayList<>();
        expectedResult2.add(2);
        expectedResult2.add(2);
        expectedResult2.add(4);

        List<Integer> expectedResult3 = new ArrayList<>();
        expectedResult3.add(4);
        expectedResult3.add(4);

        List<Integer> expectedResult4 = new ArrayList<>();
        expectedResult4.add(2);
        expectedResult4.add(6);

        List<Integer> expectedResult5 = new ArrayList<>();
        expectedResult5.add(8);

        List<List<Integer>> expectedResultCombined = new ArrayList<>();
        expectedResultCombined.add(expectedResult1);
        expectedResultCombined.add(expectedResult2);
        expectedResultCombined.add(expectedResult3);
        expectedResultCombined.add(expectedResult4);
        expectedResultCombined.add(expectedResult5);

        Collections.sort(expectedResultCombined, new CombinationSumListComparator<>());

        // when
        ArrayList<ArrayList<Integer>> ans = combinationSum.getCombinationSum(arr, sum);

        // then
        Assert.assertEquals(ans, expectedResultCombined);

    }
}
