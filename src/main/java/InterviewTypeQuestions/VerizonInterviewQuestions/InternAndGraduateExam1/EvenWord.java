package InterviewTypeQuestions.VerizonInterviewQuestions.InternAndGraduateExam1;

import org.junit.Assert;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class EvenWord {


    private static int evenWord(String word) {

        int oddLetterCount = 0;
        int individualLetterCount = 0;
        List<Character> characterList = new ArrayList<>();
        char[] chars = word.toCharArray();
        for (int i=0;i<chars.length;i++) {
            if (characterList.contains(chars[i])){
                continue;
            }
            characterList.add(chars[i]);
            individualLetterCount =1;
            for (int j = i+1;j<chars.length;j++) {
                if (chars[i] == chars[j]) {
                    individualLetterCount++;
                }
            }
            if (individualLetterCount % 2 != 0) {
                oddLetterCount++;
            }
        }
        return oddLetterCount;
    }

    private static int evenWordBetterApproach(String word) {
        int oddLetterCount = 0;
        char[] chars = word.toCharArray();
        Map<Character, Integer> characterCountMap = new HashMap<>();

        for (char aChar : chars) {
            if (characterCountMap.containsKey(aChar)) {
                characterCountMap.put(aChar, characterCountMap.get(aChar) + 1);
            } else {
                characterCountMap.put(aChar, 1);
            }
        }

        for (Character key: characterCountMap.keySet()) {
            if (characterCountMap.get(key) % 2 !=0) {
                oddLetterCount++;
            }
        }
        return oddLetterCount;
    }

    public static void main(String[] args) {
        Assert.assertEquals(0, evenWord(""));
        Assert.assertEquals(0, evenWord("aaaa"));
        Assert.assertEquals(1, evenWord("aaaaa"));
        Assert.assertEquals(2, evenWord("potato"));

        Assert.assertEquals(0, evenWordBetterApproach(""));
        Assert.assertEquals(0, evenWordBetterApproach("aaaa"));
        Assert.assertEquals(1, evenWordBetterApproach("aaaaa"));
        Assert.assertEquals(2, evenWordBetterApproach("potato"));
    }
}
