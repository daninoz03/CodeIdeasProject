package UdemyJavaCourse.Section4.CodingExercise5;

public class EqualSumChecker {

    public static boolean hasEqualSum(int num1, int num2, int num3) {

        /*if ((num1 + num2) == num3){
            return true;
        }else{
            return false;
        }*/
        return ((num1+num2) == num3);
    }

    public static void main(String[] args) {

        System.out.println("Params are 1, 1, 1 and result is:"+hasEqualSum(1,1,1));
        System.out.println("Params are 1, 1, 2 and result is:"+hasEqualSum(1,1,2));
        System.out.println("Params are 1, -1, 0 and result is:"+hasEqualSum(1,-1,0));
    }
}
