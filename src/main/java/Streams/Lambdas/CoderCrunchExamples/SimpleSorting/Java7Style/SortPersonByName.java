package Streams.Lambdas.CoderCrunchExamples.SimpleSorting.Java7Style;

import java.util.Comparator;

public class SortPersonByName implements Comparator<Person> {

    @Override
    public int compare(Person person1, Person person2) {
        return person1.getName().compareTo(person2.getName());
    }
}
