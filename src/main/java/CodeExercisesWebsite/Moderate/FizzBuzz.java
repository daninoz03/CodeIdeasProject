package CodeExercisesWebsite.Moderate;

/**
 * All exercises were taken from https://code-exercises.com/programming/
 */
public class FizzBuzz {

    public static String fizzBuzz(Integer i) {

        if (i % 3 == 0 && i % 5 == 0) {
            return "FizzBuzz";
        } else if (i % 3 == 0) {
            return "Fizz";
        } else if (i % 5 == 0) {
            return "Buzz";
        } else {
            return "" + i;
        }
    }
}
