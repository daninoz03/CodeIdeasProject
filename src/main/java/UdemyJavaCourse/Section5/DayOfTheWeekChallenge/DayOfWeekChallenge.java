package UdemyJavaCourse.Section5.DayOfTheWeekChallenge;

public class DayOfWeekChallenge {


    public void printDayOfTheWeek(int day){
        switch (day){
            case 0:
                System.out.println("Sunday");
                break;
            case 1:
                System.out.println("Monday");
                break;
            case 2:
                System.out.println("Tuesday");
                break;
            case 3:
                System.out.println("Wednesday");
                break;
            case 4:
                System.out.println("Thursday");
                break;
            case 5:
                System.out.println("Friday");
                break;
            case 6:
                System.out.println("Saturday");
                break;
            default:
                System.out.println("Invalid Day");
                break;
        }
    }

    public static void main(String[] args) {
        DayOfWeekChallenge dayOfWeekChallenge = new DayOfWeekChallenge();
        dayOfWeekChallenge.printDayOfTheWeek(0);
    }
}
