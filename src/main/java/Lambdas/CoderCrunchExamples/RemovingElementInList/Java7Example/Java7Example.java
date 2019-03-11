package Lambdas.CoderCrunchExamples.RemovingElementInList.Java7Example;

import Lambdas.CoderCrunchExamples.RemovingElementInList.Person;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Function;

public class Java7Example {


    public static void main(String[] args) {

        List<Person> personList = new ArrayList<>();
        personList.add(new Person("Áine", 27));
        personList.add(new Person("Saoirse", 33));
        personList.add(new Person("Anything", 21));


        for (Person person : personList) {
        //for (int i=0 ; i < personList.size() ; i++){
            if (person.getName().equals("Saoirse")) {
                //We cannot remove from list as we don't have access to the iterator


            }
            personList.remove(0);
            //System.out.println(personList.get(i).getName());
        }
    }
}
