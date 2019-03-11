package UdemyJavaCourse.Section5.CodingExercise12;

public class NumberOfDaysInMonth {

    public static boolean isLeapYear(int year) {
        if (year < 1 || year > 9999){
            return false;
        }
        if ((year%4==0 && year%100!=0) ||(year%400==0)){
            return true;
        }else {
            return false;
        }
    }

    public static int getDaysInMonth(int month, int year){
        if (month < 1 || month > 12){
            return -1;
        }
        if (year < 1 || year > 9999) {
            return -1;
        }
        if (month == 9 || month==4 || month==6 || month==11){
            return 30;
        }else if(month == 2){
            if (isLeapYear(year)){
                return 29;
            }else{
                return 28;
            }
        }else {
            return 31;
        }

    }

    public static void main(String[] args) {
        System.out.println(isLeapYear(-1600));
        System.out.println(isLeapYear(1600));
        System.out.println(isLeapYear(2017));
        System.out.println(isLeapYear(2000));
        //System.out.println(isLeapYear(-1600));
        System.out.println(getDaysInMonth(2,1989));
    }
}
