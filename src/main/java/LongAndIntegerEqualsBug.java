package main.java;

import java.awt.*;
import java.util.Objects;

import main.java.Person;

public class LongAndIntegerEqualsBug {

    public void anythingMethod(Person person, Person otherPerson) {
        //Do something
        person.setAge(5);
        otherPerson.setAge(person.getAge());

    }

    public static void main(String args[]) {
        Point point = new Point();
        point.x = 100;
        long param1 = 5000L;
        long param2 = 5000L;

        Person person1 = new Person();
        person1.setAge(150);
        person1.setPpsNumber(12345L);

        Person person2 = new Person();
        person2.setAge(150);
        person2.setPpsNumber(12345L);

        if (person1.getAge() == person2.getAge()) {
            System.out.println("Their ages are equal");
        } else {
            System.out.println("Their ages are not equal");
        }

        /*if (person1.getPpsNumber() == person2.getPpsNumber()) {
            System.out.println("PPS numbers are equal");
        } else {
            System.out.println("PPS numbers are not equal");
        }*/

        if(Objects.equals(person1.getPpsNumber(), person2.getPpsNumber())) {
            System.out.println("Comparing objects are the same");
        }

        LongAndIntegerEqualsBug longAndIntegerEqualsBug = new LongAndIntegerEqualsBug();
        Person person3 = new Person();
        person3.setAge(0);
        Person person4 = new Person();
        person4.setAge(0);
        longAndIntegerEqualsBug.anythingMethod(person3, person4);
        System.out.println("Age of person3 is "+person3.getAge());
        System.out.println("Age of person 4 is "+person4.getAge());

    }
}
