package UdemyJavaCourse.Section5.CodingExercise14;

public class NumberPalindrome {

    public static boolean isPalindrome(int number) {
        if (number < 0) {

            number = number * -1;
        }
        int newNumber = number;
        String newString = "";
        while (newNumber >= 1) {

            newString = newString + Integer.toString(newNumber % 10);
            newNumber = newNumber / 10;
        }
        if (number == Integer.parseInt(newString)) {
            return true;
        } else {
            return false;
        }
    }

    public static void main(String[] args) {
        isPalindrome(-1221);
    }

}
