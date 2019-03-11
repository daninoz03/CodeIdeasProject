package UdemyJavaCourse.Section5.CodingExercise16;

public class EvenDigitSum {

    public static int getEvenDigitSum(int number) {
        if (number<0){
            return -1;
        }
        int returnedNumber = 0;
        int lastDigit = 0;
        while (number>=1){
            lastDigit = number%10;
            if (lastDigit>0 && lastDigit%2==0){
                returnedNumber = returnedNumber+lastDigit;
            }
            number = number/10;
        }
        return returnedNumber;
    }

    public static void main(String[] args) {
        System.out.println(getEvenDigitSum(1234));
    }



}
