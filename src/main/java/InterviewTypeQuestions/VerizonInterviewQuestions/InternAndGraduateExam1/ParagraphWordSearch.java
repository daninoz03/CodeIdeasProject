package InterviewTypeQuestions.VerizonInterviewQuestions.InternAndGraduateExam1;

/*
Given a paragraph and a list of banned words, return the most frequent word that is not in the list of banned words.
If more than one word is possible then print lexicographically largest among them. The paragraph may contain punctuation.
Word search is case-insensitive, result is returned as a lowercase string.

EXAMPLE:
Paragraph Input:
"The function of a paragraph is to mark a pause, setting the paragraph apart from what precedes it.
 If a paragraph is preceded by a title or subhead, the indent is superfluous and can therefore be omitted."
Banned Words: ["a"]
Result: "paragraph"

HOW TO RUN:
1) Click the green Run button in the top left of Coderpad
2) The main function invokes the tests specified in the class

TIPS:
Write as many methods and tests as you deemed necessary to solve this task.
Please focus on code quality and not only hacking something together to make it work. You will be asked to explain & comment your solution.
It would also help us if you could use this screen for the entire task, so that we can see how you got to the solution of this problem.
Feel free to ask questions if you need clarification.
 */

import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.JUnitCore;

import java.util.HashMap;
import java.util.Map;

public class ParagraphWordSearch {

    public static String mostCommon(String paragraph, String[] bannedWords) {
        Map<String, Integer> wordsWithCountMap = new HashMap<>();

        paragraph = paragraph.toLowerCase();
        paragraph = paragraph.replace(".", "");
        paragraph = paragraph.replace(",", "");

        String[] separatedWords = paragraph.split("\\s");
        for (String word : separatedWords) {
            if (wordsWithCountMap.containsKey(word)) {
                wordsWithCountMap.put(word, wordsWithCountMap.get(word) + 1);
            } else {
                wordsWithCountMap.put(word, 1);
            }
        }
        String mostFrequentWord = "";
        int highestFrequency = 0;
        for (String key : wordsWithCountMap.keySet()) {
            if (wordsWithCountMap.get(key) > highestFrequency && !isWordPresentInBannedWordArray(key, bannedWords)) {
                mostFrequentWord = key;
                highestFrequency = wordsWithCountMap.get(key);
            }
        }
        return mostFrequentWord;
    }

    private static boolean isWordPresentInBannedWordArray(String word, String[] bannedWords) {
        for (String bannedWord : bannedWords) {
            if (word.equals(bannedWord)) {
                return true;
            }
        }
        return false;

    }

    @Test
    public void testParagraph() {
        String paragraph = "The function of a paragraph is to mark a pause, setting the paragraph apart from what precedes it." +
                " If a paragraph is preceded by a title or subhead, the indent is superfluous and can therefore be omitted.";
        String[] bannedWords = {"a"};
        Assert.assertEquals("paragraph", mostCommon(paragraph, bannedWords));
    }

    @Test
    public void shouldReturnExpectedStringWhenCapitalLettersAreUsed() {
        String paragraph = "The function of a parAgraph is to mark a pause, setting the Paragraph Apart from what precedes it." +
                " If a paragrapH is preceded by a title or subhead, the indent is superfluous and can therefore be omitted.";
        String[] bannedWords = {"a"};
        Assert.assertEquals("paragraph", mostCommon(paragraph, bannedWords));
    }

    @Test
    public void shouldReturnExpectedStringWhenFullStopsAndCommasAreUsed() {
        String paragraph = "The function of a paragraph, is to mark a pause, setting the paragraph, apart from what precedes it." +
                " If a paragraph. is preceded by a title or subhead, the indent is superfluous and can therefore be omitted.";
        String[] bannedWords = {"a"};
        Assert.assertEquals("paragraph", mostCommon(paragraph, bannedWords));
    }

    @Test
    public void shouldReturnExpectedStringWithAlternativeStringPassed() {
        String paragraph = "This is a test where the test is itself a test.";
        String[] bannedWords = {"a"};
        Assert.assertEquals("test", mostCommon(paragraph, bannedWords));
    }

    public static void main(String[] args) {
        JUnitCore.main("ParagraphWordSearch");
    }
}