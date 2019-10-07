package CodeExercisesWebsite.Moderate;

/**
 * All exercises were taken from https://code-exercises.com/programming/
 */
public class GreatestCommonDivisor {

    public Integer greatestCommonDivisor(Integer p, Integer q) {

        if (p < q && q % p == 0) {
            return p;
        } else if (q < p && p % q == 0) {
            return q;
        }

        Integer min = Math.min(p, q);
        Integer gcd = 1;

        for (int i = 2; i < min; i++) {
            if (p % i == 0 && q % i == 0) {
                gcd = i;
            }
        }
        return gcd;
    }

    public static void main(String[] args) {
        GreatestCommonDivisor greatestCommonDivisor = new GreatestCommonDivisor();

        System.out.println(greatestCommonDivisor.greatestCommonDivisor(1052, 52));
    }
}
