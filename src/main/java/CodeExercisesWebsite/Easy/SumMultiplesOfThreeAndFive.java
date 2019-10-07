package CodeExercisesWebsite.Easy;

/**
 * All exercises were taken from https://code-exercises.com/programming/
 */
public class SumMultiplesOfThreeAndFive {

    public static int sum(int n) {
        int sum = 0;
        for (int i = 0; i <= n; i++) {
            if (i % 3 == 0 || i % 5 == 0) {
                sum += i;
            }
        }
        return sum;
    }

    public static void main(String[] args) {
        int sum = sum(15);
        System.out.println(sum);
    }
}
