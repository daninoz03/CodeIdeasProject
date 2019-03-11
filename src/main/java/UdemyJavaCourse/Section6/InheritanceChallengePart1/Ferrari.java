package UdemyJavaCourse.Section6.InheritanceChallengePart1;

public class Ferrari extends Car {

    private int roadServiceMonths;

    public Ferrari(int roadServiceMonths) {
        super("Outlander", "FrontWD", 4, 2, 6, false);
        this.roadServiceMonths = roadServiceMonths;
    }
}
