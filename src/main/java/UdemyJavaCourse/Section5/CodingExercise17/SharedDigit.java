package UdemyJavaCourse.Section5.CodingExercise17;

import java.util.ArrayList;
import java.util.List;

public class SharedDigit {

    public static boolean hasSharedDigitWithAnySizeNumbers(int number1, int number2) {
        List<Integer> firstNumbersDigits = new ArrayList<>();
        List<Integer> secondNumbersDigits = new ArrayList<>();

        while(number1>0){
            firstNumbersDigits.add(number1%10);
            number1 = number1/10;
        }
        while (number2>0){
            secondNumbersDigits.add(number2%10);
            number2 = number2/10;
        }
        for (Integer firstListDigit : firstNumbersDigits){
            for (Integer secondListDigit : secondNumbersDigits){
                if (firstListDigit==secondListDigit){
                    return true;
                }
            }
        }
        return false;
    }

    public static void main(String[] args) {
        System.out.println(hasSharedDigitWithAnySizeNumbers(1212323445,167890));
    }
}
