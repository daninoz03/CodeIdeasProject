package UdemyJavaCourse.Section4.CodingExercise8;

public class MinutesToYearsDaysCalculator {

    private static long years;
    private static long days;
    private static long hours;
    private static long remainingDays;

    public void printYearsAndDays(long minutes) {
        if (minutes < 0) {
            System.out.println("Invalid Value");
        } else {
            hours = minutes / 60;
            days = hours / 24;
            years = days / 365;

            remainingDays = days - (years * 365);


            System.out.println("" + minutes + " min = " + years + " y and " + remainingDays + " d");
        }
    }

    public static void main(String[] args) {
        MinutesToYearsDaysCalculator minutesToYearsDaysCalculator = new MinutesToYearsDaysCalculator();

        //minutesToYearsDaysCalculator.printYearsAndDays(259200);
        minutesToYearsDaysCalculator.printYearsAndDays(1576800 + 2880);
    }
}
