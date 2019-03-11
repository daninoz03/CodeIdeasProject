package UdemyJavaCourse.Section5ControlFlowStatements;

public class Pallindrome {

    public boolean isNumberPallindrome(int number) {

        if (number < 0) {
            number = number * (-1);
        }
        int numberToBeReversed = number;
        int reversedNumber = 0;
        int leastSignificantDigit = 0;

        while(numberToBeReversed>0){

            leastSignificantDigit = numberToBeReversed % 10;

            reversedNumber = (reversedNumber*10) + leastSignificantDigit;

            numberToBeReversed = numberToBeReversed / 10;
        }

        if (number == reversedNumber){
            return true;
        } else {
            return false;
        }
    }

    public boolean isStringPallindrome(String word) {
        String reversedWord = "";
        if (word != null) {

            for (int i=word.length() -1; i>=0; i--) {
                reversedWord = reversedWord.concat(Character.toString(word.charAt(i)));
            }

            if (word.equals(reversedWord)) {
                return true;
            }else {
                return false;
            }
        }else {
            return false;
        }

    }

    public static void main(String[] args) {
        Pallindrome pallindrome = new Pallindrome();
        int numberTest = -121121;
        if (pallindrome.isNumberPallindrome(numberTest)){
            System.out.println(""+numberTest +" is a pallindrome");
        }else{
            System.out.println(""+numberTest +" is not a pallindrome");
        }

        String wordTest = "abba";
        if (pallindrome.isStringPallindrome(wordTest)) {
            System.out.println(""+wordTest+" is a pallindrome");
        }else {
            System.out.println(""+wordTest+ " is not a pallindrome");
        }

    }
}
