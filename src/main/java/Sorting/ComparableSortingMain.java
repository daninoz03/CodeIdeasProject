package Sorting;

import java.util.*;

public class ComparableSortingMain {

    public static void main(String[] args) {
        ComparableSortingMain comparableSortingMain = new ComparableSortingMain();
        comparableSortingMain.go();
    }

    public void go() {
        Person person1 = new Person(1, "Dave");
        Person person2 = new Person(2, "Steve");
        Person person3 = new Person(3, "Dipso");

        ArrayList<Person> personList = new ArrayList<>();
        //TODO: Why does collection not work like the following?
        //Collection<Person> personList = new ArrayList<>();
        personList.add(person1);
        personList.add(person2);
        personList.add(person3);
        Collections.sort(personList);
        System.out.println(personList);
    }
}
