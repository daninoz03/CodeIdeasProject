package Top5Algorithms;

import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.runners.MockitoJUnitRunner;

@RunWith(MockitoJUnitRunner.class)
public class SlidingWindowTest {

    SlidingWindow slidingWindow = new SlidingWindow();

    @Test
    public void shouldReturnCorrectLongestSubstringSizeWhenArraysOfCharsIsSent(){
        // given
        String testString = "abcabba";
        char[] charArray = testString.toCharArray();

        int returnedNumber;
        int expectedNumber = 3;

        // when
        returnedNumber = slidingWindow.getLongestSubstring(charArray);

        // then
        Assert.assertEquals(returnedNumber,expectedNumber);
    }

    /*@Test
    public void shouldReturnCorrectLongestSubstringSizeWithLongWordWhenArraysOfCharsIsSent(){
        // given
        String testString = "javaconceptoftheday";
        char[] charArray = testString.toCharArray();

        int returnedNumber;
        int expectedNumber = 8;

        // when
        returnedNumber = slidingWindow.getLongestSubstring(charArray);

        // then
        Assert.assertEquals(returnedNumber,expectedNumber);
    }*/

    @Test
    public void shouldReturnCorrectLongestSubstringSizeWithLongWordWhenOptomisedAlgorithmIsCalled(){
        // given
        String testString = "javaconceptoftheday";

        int returnedNumber;
        int expectedNumber = 8;
        // when
        returnedNumber = slidingWindow.optomisedLengthOfLongestSubstring(testString);

        // then
        Assert.assertEquals(returnedNumber,expectedNumber);
    }

    @Test
    public void shouldReturnCorrectLongestSubstringSizeWithLongWordWhenPersonalAlgorithmIsCalled(){
        // given
        String testString = "javaconceptoftheday";

        int returnedNumber;
        int expectedNumber = 8;
        // when
        returnedNumber = slidingWindow.getLengthOfLongestSubstring(testString);

        // then
        Assert.assertEquals(returnedNumber,expectedNumber);
    }

    @Test
    public void shouldReturnCorrectLongestSubstringSizeWithLongerWordWhenPersonalAlgorithmIsCalled(){
        // given
        String testString = "abcabba";

        int returnedNumber;
        int expectedNumber = 3;
        // when
        returnedNumber = slidingWindow.getLengthOfLongestSubstring(testString);

        // then
        Assert.assertEquals(returnedNumber,expectedNumber);
    }

}
