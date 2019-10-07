package CodeExercisesWebsite.Moderate;

/**
 * All exercises were taken from https://code-exercises.com/programming/
 */
public class PrimeNumber {

    public Boolean isPrime(Integer n) {
        if (n <= 1) {
            return false;
        }
        int count = 0;
        for (int i = n - 1; i > 1; i--) {
            if (n % i == 0) {
                count++;
                break;
            }
        }
        if (count > 0) {
            return false;
        } else {
            return true;
        }
    }

    public static void main(String[] args) {
        PrimeNumber primeNumber = new PrimeNumber();
        System.out.println(primeNumber.isPrime(5));
        System.out.println(primeNumber.isPrime(4));
        System.out.println(primeNumber.isPrime(10));
        System.out.println(primeNumber.isPrime(13));
    }
}
