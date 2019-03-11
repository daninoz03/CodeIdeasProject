package Generics.LaurasTest;

public class Human {

    private int numberOfEyes = 2;
    private int numberOfLegs = 2;
    private String name;

    //Optional pet
    private Pet pet;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }


    public void walk() {

    }
}
