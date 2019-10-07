package CodeExercisesWebsite.Easy;

/**
 * All exercises were taken from https://code-exercises.com/programming/
 */
public class Factorial {

    public static Integer factorial(Integer n) {
        Integer factorial = n;
        for (int i = n - 1; i > 0; i--) {
            factorial = factorial * i;
        }
        return factorial;
    }


    public static Integer factorialWithRecursion(Integer n) {
        if (n == 0) {
            return 1;
        } else {
            return (n * factorialWithRecursion(n - 1));
        }
    }

    public static void main(String[] args) {

        System.out.println(factorial(4));
        System.out.println(factorialWithRecursion(4));

        System.out.println(factorial(8));
        System.out.println(factorialWithRecursion(8));

        System.out.println(factorial(10));
        System.out.println(factorialWithRecursion(10));
    }
}
