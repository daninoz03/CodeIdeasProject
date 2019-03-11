package UdemyJavaCourse.Section6.InheritanceChallengePart1;

public class Ferrari extends Car {

    private int roadServiceMonths;

    public Ferrari(int roadServiceMonths) {
        super("Outlander", "FrontWD", 4, 2, 6, false);
        this.roadServiceMonths = roadServiceMonths;
    }

    public void accelerate(int rate) {
        int newVelocity = getCurrentVelocity() + rate;
        if (newVelocity == 0) {
            stop();
            changeGear(1);
        } else if (newVelocity > 0 && newVelocity <= 10) {
            changeGear(1);
        } else if (newVelocity > 11 && newVelocity <= 20) {
            changeGear(2);
        } else if (newVelocity > 21 && newVelocity <= 30) {
            changeGear(3);
        } else if (newVelocity > 31 && newVelocity <= 40) {
            changeGear(4);
        } else if (newVelocity > 41 && newVelocity <= 50) {
            changeGear(5);
        } else {
            changeGear(6);
        }
    }
}
