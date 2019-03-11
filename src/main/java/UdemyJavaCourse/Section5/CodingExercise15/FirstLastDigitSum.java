package UdemyJavaCourse.Section5.CodingExercise15;

public class FirstLastDigitSum {

    public static int sumFirstAndLastDigit(int number) {
        if (number < 0) {
            return -1;
        }
        int counter = 0;
        int returnedNumber = 0;
        while (number >= 1) {
            if (counter == 0) {
                returnedNumber = returnedNumber + number % 10;
                counter++;
            }
            if (number / 10 == 0) {
                returnedNumber = returnedNumber + number;
            }
            number = number / 10;
        }
        return returnedNumber;
    }

    public static void main(String[] args) {
        System.out.println(sumFirstAndLastDigit(212));
        System.out.println(sumFirstAndLastDigit(-21254567));
        System.out.println(sumFirstAndLastDigit(21254567));
    }
}
