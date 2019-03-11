package UdemyJavaCourse.Section5ControlFlowStatements;

public class DigitSumChallenge {

    public int sumDigits(int number) {
        int returnedNumber = 0;

        if (number < 10) {
            return -1;
        }
        while (number > 0) {

            returnedNumber = returnedNumber + (number % 10);
            number = number / 10;
        }
        return returnedNumber;
    }

    public static void main(String[] args) {
        DigitSumChallenge digitSumChallenge = new DigitSumChallenge();

        System.out.println(digitSumChallenge.sumDigits(125));
        System.out.println(digitSumChallenge.sumDigits(25));
        System.out.println(digitSumChallenge.sumDigits(11111));
        System.out.println(digitSumChallenge.sumDigits(-125));
    }
}
