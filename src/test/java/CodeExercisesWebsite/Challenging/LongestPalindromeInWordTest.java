package CodeExercisesWebsite.Challenging;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class LongestPalindromeInWordTest {

    private LongestPalindromeInWord longestPalindromeInWord;

    @Before
    public void setup() {
        longestPalindromeInWord = new LongestPalindromeInWord();
    }


    @Test
    public void shouldReturnLongestWordIfAtStartOfArray() {
        // given
        String palindromeSearch = "sosatt";

        // then
        String returnedPalindrome = longestPalindromeInWord.findLongestPalindrome(palindromeSearch);

        // when
        assertEquals(returnedPalindrome, "sos");
    }

    @Test
    public void shouldReturnLongestWordIfAtEndOfArray() {
        // given
        String palindromeSearch = "stxastasa";

        // then
        String returnedPalindrome = longestPalindromeInWord.findLongestPalindrome(palindromeSearch);

        // when
        assertEquals(returnedPalindrome, "asa");
    }

    @Test
    public void shouldReturnLongestWordIfInMiddleOfArray() {
        // given
        String palindromeSearch = "stxassasc";

        // then
        String returnedPalindrome = longestPalindromeInWord.findLongestPalindrome(palindromeSearch);

        // when
        assertEquals(returnedPalindrome, "assa");
    }

    @Test
    public void shouldReturnLongestPalindromeWhenThereAreMultipleResults() {
        // given
        String palindromeSearch = "stxassascsasdfgrdd";

        // then
        String returnedPalindrome = longestPalindromeInWord.findLongestPalindrome(palindromeSearch);

        // when
        assertEquals(returnedPalindrome, "sascsas");
    }

}
