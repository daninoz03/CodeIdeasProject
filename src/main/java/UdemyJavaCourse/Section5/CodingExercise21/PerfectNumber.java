package UdemyJavaCourse.Section5.CodingExercise21;

public class PerfectNumber {

    public static boolean isPerfectNumber(int number) {
        if (number < 1) {
            return false;
        }
        int perfectCheck = 0;
        for (int i = 1; i < number; i++) {
            if (number % i == 0) {
                perfectCheck = perfectCheck + i;
            }
        }
        if (perfectCheck == number) {
            return true;
        } else {
            return false;
        }
    }

    public static void main(String[] args) {
        System.out.println(isPerfectNumber(6));
    }
}
