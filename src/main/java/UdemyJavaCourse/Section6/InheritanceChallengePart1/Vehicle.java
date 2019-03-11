package UdemyJavaCourse.Section6.InheritanceChallengePart1;

public class Vehicle {


    private String name;
    private String size;

    public Vehicle(String name, String size) {
        this.name = name;
        this.size = size;
    }

    public void steering(){
        System.out.println("In vehicle class and now steering");
    }



    public void moving(){
        System.out.println("In vehicle class and now moving");
    }
}
