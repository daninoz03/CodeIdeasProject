package UdemyJavaCourse.Section6.InheritanceChallengePart1;

public class Car extends Vehicle {

    private int numberOfGears;

    public Car(String name, String size, int numberOfGears) {
        super(name, size);
        this.numberOfGears = numberOfGears;
    }

    public void changeGears(){
        System.out.println("In vehicle class and now changing gears");
        System.out.println("In vehicle class vehicle has "+numberOfGears+ " gears");
    }
}
