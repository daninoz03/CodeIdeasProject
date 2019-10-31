package CodeExercisesWebsite.Challenging;

import java.util.ArrayList;
import java.util.List;

/**
 * All exercises were taken from https://code-exercises.com/programming/
 */
public class LargestPrimeFactor {

    public Integer getLargestPrimeFactor(Integer n) {
        int divider = n / 2;
        List<Integer> primeFactors = new ArrayList<>();

        while (divider > 0) {
            if (n % divider == 0 && isPrime(divider)) {
                primeFactors.add(divider);
            }
            divider--;
        }
        if (primeFactors.isEmpty()) {
            primeFactors.add(n);
        }
        return getLargestPrime(primeFactors);
    }

    private boolean isPrime(Integer number) {
        if (number == 2) {
            return true;
        } else if (number % 2 == 0) {
            return false;
        }

        int numberToCheck = number / 2;
        int counter = 0;
        while (numberToCheck > 1) {
            if (number % numberToCheck == 0) {
                counter++;
            }
            numberToCheck--;
        }
        return counter == 0;
    }

    private Integer getLargestPrime(List<Integer> integerList) {
        Integer largestPrime = 0;
        for (Integer integer : integerList) {
            if (integer > largestPrime) {
                largestPrime = integer;
            }
        }
        return largestPrime;
    }

    public static void main(String[] args) {
        LargestPrimeFactor largestPrimeFactor = new LargestPrimeFactor();

        System.out.println(largestPrimeFactor.getLargestPrimeFactor(455));
    }
}
