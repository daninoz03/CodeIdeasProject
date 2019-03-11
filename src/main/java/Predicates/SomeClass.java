package Predicates;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Predicate;

/**
 * Represents a boolean return function which takes one argument
 * The most common use is for filtering lists
 * Good practice to have them in their own classes for usability
 */
public class SomeClass {

    private static List<Integer> filterNumbersList = new ArrayList<>();


    public static void main(String[] args) {
        List<Integer> integerList = new ArrayList<>();
        for (int i = 0; i < 20; i++) {
            integerList.add(i);
            if (integerList.get(i) % 2 == 0) {
                integerList.remove(i);
                integerList.add(i * -1);
            }

        }
        SomeClass someClass = new SomeClass();
        filterNumbersList = someClass.getFilteredNumbers(integerList, IntegerPredicate.positiveIntegerPredicate);
        filterNumbersList.forEach(System.out::println);
        filterNumbersList.clear();
        System.out.println("===============================");

        filterNumbersList = someClass.getFilteredNumbers(integerList, IntegerPredicate.negativeIntegerPredicate);
        filterNumbersList.forEach(System.out::println);
        filterNumbersList.clear();
        System.out.println("===============================");

        filterNumbersList = someClass.getFilteredNumbers(integerList, IntegerPredicate.evenIntegerPredicate);
        filterNumbersList.forEach(System.out::println);
        filterNumbersList.clear();
        System.out.println("===============================");

        filterNumbersList = someClass.getFilteredNumbers(integerList, IntegerPredicate.oddIntegerPredicate);
        filterNumbersList.forEach(System.out::println);

    }


    public List<Integer> getFilteredNumbers(List<Integer> integerList, Predicate<Integer> integerPredicate) {

        for (Integer integer : integerList) {
            if (integerPredicate.test(integer)) {
                filterNumbersList.add(integer);
            }
        }
        return filterNumbersList;
    }
}
