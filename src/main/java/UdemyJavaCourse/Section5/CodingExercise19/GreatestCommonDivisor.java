package UdemyJavaCourse.Section5.CodingExercise19;

public class GreatestCommonDivisor {

    public static int getGreatestCommonDivisor(int first, int second) {
        if (first < 10 || second < 10) {
            return -1;
        }
        int minumumValue = Math.min(first, second);

        for (int i = minumumValue; i > 0; i--) {
            if (first % i == 0 && second % i == 0) {
                return i;
            }
        }
        return -1;

    }

    public static void main(String[] args) {
        System.out.println(getGreatestCommonDivisor(25, 15));
    }
}
