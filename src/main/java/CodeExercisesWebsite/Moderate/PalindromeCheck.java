package CodeExercisesWebsite.Moderate;

import org.apache.commons.lang3.time.StopWatch;

/**
 * All exercises were taken from https://code-exercises.com/programming/
 */
public class PalindromeCheck {

    public boolean isPalindrome(String word) {
        char[] charArray = word.toCharArray();
        String returnedWord = "";
        for (int i = charArray.length - 1; i >= 0; i--) {
            returnedWord = returnedWord.concat(String.valueOf(charArray[i]));
        }
        return word.equals(returnedWord);
    }

    public boolean isPalindromeEfficientMethod(String word) {
        String splitWord1 = word.substring(0, word.length() / 2);
        String splitWord2 = word.substring(word.length() / 2);
        if (splitWord2.length() > splitWord1.length()) {
            splitWord2 = splitWord2.substring(1);
        }

        int count = 0;
        char[] chars1 = splitWord1.toCharArray();
        char[] chars2 = splitWord2.toCharArray();
        for (int i = chars2.length - 1; i >= 0; i--) {
            if (chars2[i] != chars1[count]) {
                return false;
            }
            count++;
        }
        return true;
    }

    public static void main(String[] args) {
        PalindromeCheck palindromeCheck = new PalindromeCheck();
        System.out.println("Should be true and is: " + palindromeCheck.isPalindrome("aba"));
        System.out.println("Should be false and is: " + palindromeCheck.isPalindrome("abc"));
        System.out.println("Should be true and is: " + palindromeCheck.isPalindrome("c"));
        System.out.println("Should be false and is: " + palindromeCheck.isPalindrome("abac"));
        System.out.println("Should be true and is: " + palindromeCheck.isPalindrome("aba"));
        System.out.println("Should be false and is: " + palindromeCheck.isPalindrome("abba"));
        System.out.println("Should be true and is: " + palindromeCheck.isPalindrome("kahwfgvjwyervl"));

        palindromeCheck.isPalindromeEfficientMethod("banana");
        palindromeCheck.isPalindromeEfficientMethod("abbba");


        String passedString = "sadjbfdjkgbdskugbsajfamvdfjghekjfhbaejfdjlgsljghslfjgadgdgshskhgnslkgndlsjgbsljgbsj";
        StopWatch timer = new StopWatch();
        timer.start();
        palindromeCheck.isPalindrome(passedString);
        timer.stop();
        System.out.println("Time taken for normal method is " + timer.getNanoTime());

        timer.reset();

        timer.start();
        palindromeCheck.isPalindromeEfficientMethod(passedString);
        timer.stop();
        System.out.println("Time taken for efficient method is " + timer.getNanoTime());
    }
}
