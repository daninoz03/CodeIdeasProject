package InterviewTypeQuestions.BuildingsRainfallQuestion;

import org.junit.Assert;
import org.junit.Ignore;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.runners.MockitoJUnitRunner;

import static org.hamcrest.Matchers.is;

@RunWith(MockitoJUnitRunner.class)
public class RainfallChallengeTest {

    @Test
    public void shouldReturnZeroForEmptyArrayPassed() {
        // given
        int[] buildingHeights = new int[]{};
        RainfallChallenge rainfallChallenge = new RainfallChallenge(buildingHeights);

        // when
        int result = rainfallChallenge.entryMethodUsedForTesting();

        // then
        Assert.assertEquals(result, 0);
        Assert.assertThat(result, is(0));
    }

    @Test
    public void shouldReturnZeroForAscendingArrayPassedWithNoSolution() {
        // given
        int[] buildingHeights = new int[]{1,2,3,4,5,6,7,8,9};
        RainfallChallenge rainfallChallenge = new RainfallChallenge(buildingHeights);

        // when
        int result = rainfallChallenge.entryMethodUsedForTesting();

        // then
        Assert.assertEquals(result, 0);
        Assert.assertThat(result, is(0));
    }

    @Test
    public void shouldReturnZeroForDescendingArrayPassedWithNoSolution() {
        // given
        int[] buildingHeights = new int[]{9,8,7,6,5,4,3,2,1};
        RainfallChallenge rainfallChallenge = new RainfallChallenge(buildingHeights);

        // when
        int result = rainfallChallenge.entryMethodUsedForTesting();

        // then
        Assert.assertEquals(result, 0);
        Assert.assertThat(result, is(0));
    }

    @Test
    public void shouldReturnCorrectResultForArrayPassedWithSolutionWithMatchingHeights() {
        // given
        int[] buildingHeights = new int[]{1,5,6,2,6,3,4,6,2};
        RainfallChallenge rainfallChallenge = new RainfallChallenge(buildingHeights);

        // when
        int result = rainfallChallenge.entryMethodUsedForTesting();

        // then
        Assert.assertEquals(result, 5);
    }


    @Ignore("Need to fix code as it appears to not work in all cases.")
    @Test
    public void shouldReturnCorrectResultForArrayPassedWithSolutionWithNoMatchingHeights() {
        // given
        int[] buildingHeights = new int[]{1,5,6,2,7,3,4,8,2};
        RainfallChallenge rainfallChallenge = new RainfallChallenge(buildingHeights);

        // when
        int result = rainfallChallenge.entryMethodUsedForTesting();

        // then
        Assert.assertEquals(result, 7);
    }

    @Test
    public void shouldReturnCorrectSolutionsWhenReadingFromAFileOfArrays() {
        // given


        // when


        // then


    }
}
