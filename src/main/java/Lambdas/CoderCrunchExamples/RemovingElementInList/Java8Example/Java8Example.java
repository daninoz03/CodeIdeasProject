package Lambdas.CoderCrunchExamples.RemovingElementInList.Java8Example;

import Lambdas.CoderCrunchExamples.RemovingElementInList.Person;

import java.util.ArrayList;
import java.util.List;

public class Java8Example {


    public static void main(String[] args) {

        List<Person> personList = new ArrayList<>();
        personList.add(new Person("Áine", 27));
        personList.add(new Person("Saoirse", 33));


        personList.removeIf(person -> "Áine".equals(person.getName()));
    }
}
