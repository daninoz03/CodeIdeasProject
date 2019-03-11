package StaticMethodsInInterface;

public interface Interviewer {

    int maxNumberOfInterviewsPerWeek = 3;

    void interview();

    static void bookRoom(int hours) {
        System.out.println("The room is booked for the interview for "+hours+" hours");
    }
}
