package UdemyJavaCourse.Section5.CodingExercise22;

public class NumberToWords {

    public static void numberToWords(int number){
        if (number<0){
            System.out.println("Invalid Value");
        }
        int digitCount = getDigitCount(number);
        int reversedNumber = reverse(number);
        int reversedNumberDigitCount = getDigitCount(reversedNumber);


        int numberToConvert = 0;

        while (reversedNumber>0){
            numberToConvert = reversedNumber%10;
            switch (numberToConvert){
                case 0:
                    System.out.print("Zero ");
                    break;
                case 1:
                    System.out.print("One ");
                    break;
                case 2:
                    System.out.print("Two ");
                    break;
                case 3:
                    System.out.print("Three ");
                    break;
                case 4:
                    System.out.print("Four ");
                    break;
                case 5:
                    System.out.print("Five ");
                    break;
                    case 6:
                    System.out.print("Six ");
                    break;
                case 7:
                    System.out.print("Seven ");
                    break;
                case 8:
                    System.out.print("Eight ");
                    break;

                    case 9:
                    System.out.print("Nine ");
                    break;
                default:
                    break;
            }
            reversedNumber = reversedNumber/10;
        }
        if (digitCount != reversedNumberDigitCount){
            for (int i = 0; i< (digitCount-reversedNumberDigitCount); i++){
                System.out.print("Zero ");
            }
        }
        if (number ==0){
            System.out.print("Zero");
        }
    }

    public static int reverse(int number) {

        int numberCopy = number;
        if (number <0){
            number = number*-1;
        }
        int reversedNumber = 0;
        int counter = 0;
        while (number>0){
            if (counter==0){
                reversedNumber = reversedNumber + (number%10);
            }else {
                reversedNumber = (reversedNumber*10) + (number%10);
            }

            counter++;
            number = number/10;
        }
        if (numberCopy < 0){
            return reversedNumber*-1;
        }else {
            return reversedNumber;
        }

    }

    public static int getDigitCount(int number) {
        if (number<0){
            return -1;
        }
        if (number==0){
            return 1;
        }
        int counter = 0;
        while (number>0){
            counter++;
            number = number/10;
        }
        //System.out.println("Digit count is "+counter);
        return counter;

    }

    public static void main(String[] args) {
        //numberToWords(123);
        //numberToWords(1200);
        //numberToWords(0);

        reverse(-2);
    }
}
