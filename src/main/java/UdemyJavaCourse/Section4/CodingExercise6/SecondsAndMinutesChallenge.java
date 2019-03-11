package UdemyJavaCourse.Section4.CodingExercise6;

public class SecondsAndMinutesChallenge {


    public static String getDurationString(int minutes, int seconds) {
        if ((minutes<0) || (seconds <0 || seconds > 59)){
            return "Invalid Value";
        }
        int hours = minutes / 60;
        int newMinutes = minutes - ( hours *60 );

        return ""+hours+"h "+newMinutes+"m "+seconds+"s";
    }

    public static String getDurationString(int seconds) {
        if (seconds <= 0) {
            return "Invalid Value";
        }
        int minutes = seconds / 60;
        int newSeconds = seconds - (minutes * 60);

        return getDurationString(minutes, newSeconds);
    }

    public static void main(String[] args) {

        System.out.println(getDurationString(187, 25));

        System.out.println(getDurationString(2));
    }
}
