package Streams.Lambdas.CoderCrunchExamples.InternalExternalIteration.InternalIteration;

import Streams.Lambdas.CoderCrunchExamples.InternalExternalIteration.ExternalItertion.Person;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class ForEachLoop {

    public static void main(String[] args) {

        List<Person> someOtherList = new ArrayList<>();
        someOtherList.add(new Person("Áine", 27));
        someOtherList.add(new Person("Saoirse", 33));
        /**
         * Only one method call on the list
         * Syncronized for the entire duration of the call
         * The iteration happens inside this call
         * No concurrent modification exception can occur
         */
        List<Person> personList = Collections.synchronizedList(someOtherList);

        personList.forEach(person -> System.out.println(person.getName()));


        for(int i = 0 ; i<personList.size(); i++){
            if (personList.get(i).getName().equals("Saoirse")){
                personList.remove(i);
            }
        }
////////////////////////////////////////////////////////////////////////////////

        List<Integer> numberList = new ArrayList<>();
        numberList.add(1);
        numberList.add(2);
        numberList.add(3);

        List<Integer> synchronizedNumberList = Collections.synchronizedList(numberList);

        /*for (Integer number : numberList){
            numberList.remove(1);
        }*/

        numberList.forEach(number -> {
                    synchronizedNumberList.remove(1);
                    System.out.println(number);
                });

        //;);
    }

}
