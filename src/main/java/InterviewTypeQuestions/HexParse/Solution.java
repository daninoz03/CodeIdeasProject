package InterviewTypeQuestions.HexParse;

import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.JUnitCore;

import java.util.ArrayList;
import java.util.Collections;


/*
Please attempt all questions. Leave notes in comments where you feel explanation is required. This test is not being timed so feel free to do it at your own pace. The questions are quite open-ended so feel free to use this as an opportunity to show us your technical ability in this area!

Challenge:
Consider a string of hexadecimal characters, s = "a01". The set of substrings of s would be {"0", "01", "1", "a", "a0", "a01"} when ordered alphanumerically. If we reduce this set to only those substrings that start with a letter and end with a number, we're left with {"a0", "a01"}. The alphanumerically first element in this reduced list is "a0", and the alphanumerically last element is "a01".

Letters: a, b, c, d, e and f.
Numbers: 0, 1, 2, 3, 4, 5, 6, 7, 8 and 9

Complete the findSubstrings function in your editor. It has 1 parameter: a string, inputString, consisting of lowercase English letters [a − f] and digits [0 - 9] and has a length defined by
  - 3 ≤ length of inputString ≤ 5 × 10^5

The function must find a set of substrings of s which meet the following conditions.
 - The final character of the substring should be a number.
 - The first character of the substring should be a letter.

The function will then return the first and last of this set when ordered alphanumerically.

Tips
Write as many functions and tests as you deemed necessary to solve this task.
Please focus on code quality and the performance of the algorithm you use. You will be asked to comment your solution in person.


It would also help us if you could use this screen for the entire task, so that we can see how you got to the solution of this problem.

*/
public class Solution {

    public String findSubstrings(String inputString) {
        char[] charArray = inputString.toCharArray();
        ArrayList<String> list = new ArrayList<>();
        int counter = 0;
        for (int i = 0; i < charArray.length; i++) {
            counter = i + 1;
            String element = String.valueOf(charArray[i]);
            while (Character.isAlphabetic(charArray[i])) {
                if (counter <= charArray.length - 1) {
                    element = element + "" + charArray[counter];
                    if (Character.isDigit(charArray[counter])) {
                        list.add(element);
                    }
                } else {
                    break;
                }
                counter++;
            }
        }
        Collections.sort(list);
        return "" + list.get(0) + " " + list.get(list.size() - 1);
    }

    public String findSubstringsWithMinMax(String inputString) {


        return "";
    }

    @Test
    public void testFindSubstring1() {
        Assert.assertTrue(findSubstrings("a01").equals("a0 a01"));
    }

    @Test
    public void testFindSubstring2() {
        Assert.assertTrue(findSubstrings("7961686f6f").equals("f6 f6"));
    }

    @Test
    public void testFindSubstring3() {
        Assert.assertTrue(findSubstrings("7961686ffffff6f").equals("f6 ffffff6"));
    }

    @Test
    public void testFindSubstring4() {
        Assert.assertTrue(findSubstrings("7961686f123456f2").equals("f1 f2"));
    }

    @Test
    public void testFindSubstring5() {
        Assert.assertTrue(findSubstrings("f2f2f2f2a0").equals("a0 f2f2f2f2a0"));
    }

    public static void main(String[] args) {

        JUnitCore.main("Solution");
    }

}
