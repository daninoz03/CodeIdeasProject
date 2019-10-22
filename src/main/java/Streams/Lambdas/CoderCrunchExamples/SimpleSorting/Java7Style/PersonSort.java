package Streams.Lambdas.CoderCrunchExamples.SimpleSorting.Java7Style;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class PersonSort {

    public static void main(String[] args) {
        List<Person> peopleList = new ArrayList<>();

        peopleList.add(new Person("John", 20));
        peopleList.add(new Person("Ringo", 40));
        peopleList.add(new Person("Aoife", 28));
        peopleList.add(new Person("Sinead", 35));

        Collections.sort(peopleList, new SortPersonByName());
        for (Person person : peopleList){
            System.out.println(person.getName());
        }
    }
}
