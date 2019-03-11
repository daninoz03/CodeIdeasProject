package Lambdas.CoderCrunchExamples.InternalExternalIteration.ExternalItertion;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class ForLoopList {

    public static void main(String[] args) {
        List<Person> someOtherList = new ArrayList<>();
        someOtherList.add(new Person("Áine",27));
        someOtherList.add(new Person("Saoirse", 33));

        /**
         * A sychronized list being operated on by multiple threads.
         * It constantly calls next() and hasNext()
         * However another thread can modify the list between these calls
         * If this occurs the next method call on the iterator would throw a concurrent modification exception
         * It was controlled outside of the list and hence it was External Iteration
         */
        List<Person> personList = Collections.synchronizedList(someOtherList);

        for (Person person : personList) {
            System.out.println(person.getName());
        }
    }
}
