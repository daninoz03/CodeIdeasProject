package Streams.Lambdas.CoderCrunchExamples.TwoLevelSorting;

import Streams.Lambdas.CoderCrunchExamples.SimpleSorting.Java8Lambda.Person;

import java.util.ArrayList;
import static java.util.Comparator.*;

import java.util.Comparator;
import java.util.List;

public class TwoLevelSorting {

    public static void main(String[] args) {
        /**
         * If we want to compare a list of people by age a lot of people might have the same age so
         * therefore we want to order the people with the same age by name
         */

        List<Person> personList = new ArrayList<>();
        personList.add(new Person("Aine", 23));
        personList.add(new Person("Daithí", 23));
        personList.add(new Person("Seán", 48));
        personList.add(new Person("Roisín", 23));
        personList.add(new Person("Brian", 48));

        personList.forEach(person -> System.out.println(person.getName()+" "+person.getAge()));

        System.out.println("****************");

        //Higher Order function
        personList.sort(
                Comparator.comparing(Person::getAge)
                        .thenComparing(Person::getName)
        );

        personList.forEach(person -> System.out.println(person.getName()+" "+person.getAge()));

        //Static import equivalent
        personList.sort(comparing(Person::getAge).thenComparing(Person::getName)
        );

    }
}
