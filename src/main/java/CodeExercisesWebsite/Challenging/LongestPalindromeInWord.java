package CodeExercisesWebsite.Challenging;

import java.util.HashSet;
import java.util.Set;

/**
 * All exercises were taken from https://code-exercises.com/programming/
 */
public class LongestPalindromeInWord {

    public String findLongestPalindrome(String word) {

        Set<String> palindromeList = new HashSet<>();

        for (int i = 0; i < word.length(); i++) {
            for (int j = word.length() - 1; j >= 0; j--) {
                if (i < j && word.charAt(i) == word.charAt(j)) {
                    if (isPalindromeQuicker(word.substring(i, j + 1))) {
                        palindromeList.add(word.substring(i, j + 1));
                    }
                }
            }
        }
        return getLongestPalindromeInList(palindromeList);
    }

    private boolean isPalindromeQuicker(String word) {
        int leftChecker = 0;
        int rightChecker = word.length() - 1;
        while (rightChecker > leftChecker) {
            if (word.charAt(leftChecker) != word.charAt(rightChecker)) {
                return false;
            }
            leftChecker++;
            rightChecker--;
        }
        return true;
    }

    private String getLongestPalindromeInList(Set<String> palindromes) {
        String longestPalindrome = "";
        for (String palindrome : palindromes) {
            if (palindrome.length() > longestPalindrome.length()) {
                longestPalindrome = palindrome;
            }
        }
        return longestPalindrome;
    }

    public static void main(String[] args) {
        LongestPalindromeInWord longestPalindromeInWord = new LongestPalindromeInWord();

        String longestPalindromeNewMethod = longestPalindromeInWord.findLongestPalindrome("artytdd");
        System.out.println(longestPalindromeNewMethod);
    }
}
