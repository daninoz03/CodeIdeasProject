package Top5Algorithms;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class SlidingWindow {
    //List<String> stringList = new ArrayList<>();

    /**
     * Sliding window algorithm: Return the longest substring without repeating characters
     */
    public int getLongestSubstring(char[] arrayOfChars) {
        int count = 0;
        String stringToAddToList = "";
        List<Character> longestList = new ArrayList<>();
        List<String> stringList = new ArrayList<>();

        for (int i = 0; i < arrayOfChars.length; i++) {
            for (int j = 0; j < arrayOfChars.length; j++) {

                // Check if we have a repeated char
                if (!longestList.contains(arrayOfChars[j])) {
                    longestList.add(arrayOfChars[j]);
                } else {
                    count = longestList.size();
                    stringToAddToList = addToStringList(arrayOfChars, i, j);
                    stringList.add(stringToAddToList);
                    break;
                }
            }
        }
        count = getLengthOfLongestSubstring(stringList);
        return count;
    }

    private int getLengthOfLongestSubstring(List<String> stringList) {
        int longestWordLetterCount = 0;
        for (String item : stringList) {
            if (item.length() > longestWordLetterCount) {
                longestWordLetterCount = item.length();
            }
        }
        return longestWordLetterCount;
    }

    private String addToStringList(char[] arrayOfChar, int i, int j) {
        String concatonatedString = "";
        for (int h = i; h < j; h++) {
            concatonatedString = concatonatedString.concat(String.valueOf(arrayOfChar[h]));
            //stringList.add(arrayOfChar[h]);
        }
        return concatonatedString;
    }

    public Integer lengthOfLongestSubstring(String str) {
        int stringLength = str.length();
        int result = 0;

        for (int i = 0; i < stringLength; i++) {
            boolean[] visited = new boolean[256];
            for (int j = i; j < stringLength; j++) {
                if (visited[str.charAt(j)] == true)
                    break;
                else {
                    result = Math.max(result, j - i + 1);
                    visited[str.charAt(j)] = true;
                }
            }
            visited[str.charAt(i)] = false;
        }
        return result;
    }

    public Integer optomisedLengthOfLongestSubstring(String str) {


        // if string length is 0
        if (str.length() == 0)
            return 0;

        // if string length 1
        if (str.length() == 1)
            return 1;

        // if string length is more than 2
        int maxLength = 0;
        boolean[] visited = new boolean[256];

        // left and right pointer of sliding window
        int left = 0, right = 0;
        while (right < str.length()) {

            // if character is visited
            if (visited[str.charAt(right)]) {

                // The left pointer moves to the right while
                // marking visited characters as false until
                // the repeating character is no longer part
                // of the current window.
                while (visited[str.charAt(right)]) {
                    visited[str.charAt(left)] = false;
                    left++;
                }
            }
            visited[str.charAt(right)] = true;

            // The length of the current window (right -
            // left + 1) is calculated and answer is updated
            // accordingly.
            maxLength
                    = Math.max(maxLength, (right - left + 1));
            right++;
        }
        return maxLength;
    }

    /**
     * My simple solution
     *
     * @param string to be used to get substrings from
     * @return the length of the longest substring
     */
    public int getLengthOfLongestSubstring(String string) {
        int left = 0;
        int right = 0;
        int max = 0;
        //abcab
        Set<Character> characterSet = new HashSet<>();

        while (right < string.length()) {
            if (!characterSet.contains(string.charAt(right))) {
                characterSet.add(string.charAt(right));
                max = Math.max(characterSet.size(), max);
                right++;
            } else {
                characterSet.remove(string.charAt(left));
                left++;
            }

        }
        return max;
    }
}
