package CodeExercisesWebsite.Easy;

/**
 * All exercises were taken from https://code-exercises.com/programming/
 */
public class ReverseString {


    public static String reverse(String s) {
        char[] chars = s.toCharArray();
        String returnedString = "";
        for (int i = chars.length - 1; i >= 0; i--) {
            returnedString = returnedString.concat(String.valueOf(chars[i]));
        }
        return returnedString;
    }

    public static void main(String[] args) {

        System.out.println(reverse("abcdefg"));
    }
}
