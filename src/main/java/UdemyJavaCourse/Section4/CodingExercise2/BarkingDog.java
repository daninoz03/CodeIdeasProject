package UdemyJavaCourse.Section4.CodingExercise2;

public class BarkingDog {

    public static boolean bark(boolean barking, int hourOfDay) {

        if (hourOfDay < 0 || hourOfDay > 23) {
            return false;
        }else if ((hourOfDay <8 || hourOfDay >22) && barking ){
            return true;
        }else{
            return false;
        }
    }

    public static void main(String[] args) {
        System.out.println(bark(true, 1));
        System.out.println(bark(false,2));
        System.out.println(bark(true ,10));
        System.out.println(bark(true, 22));
        System.out.println(bark(false, 3));
    }
}
