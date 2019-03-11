package Refactoring.ContinuedPart2.MiddleMan.After;

import Refactoring.ContinuedPart2.MiddleMan.Before.License;

public class Motorist {


    private License license = new License();
    private String name;

    private int age;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

}
