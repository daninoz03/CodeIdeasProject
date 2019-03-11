package UdemyJavaCourse.Section5.CodingExercise13;

public class SumOdd {

    public static boolean isOdd(int number) {
        if (number < 0) {
            return false;
        }
        if (number % 2 == 0){
            return false;
        }else {
            return true;
        }
    }

    public static int sumOdd(int start, int end) {
        if (end < start || (end < 0 || start < 0)) {
            return -1;
        }
        int returnedInt = 0;
        for (int i = start; i<=end; i++){
            if (isOdd(i)){
                returnedInt += i;
            }
        }
        return returnedInt;
    }

    public static void main(String[] args) {
        System.out.println(sumOdd(0,5));
        System.out.println(sumOdd(-4,6));
    }
}
