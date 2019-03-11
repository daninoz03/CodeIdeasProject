package Predicates;

import java.util.function.Predicate;

public class IntegerPredicate {

    /*public static Predicate<Integer> positiveIntegerPredicate = new Predicate<Integer>() {
        @Override
        public boolean test(Integer integer) {
            return integer > 0;
        }
    };*/

    //The same but using lambda
    public static Predicate<Integer> positiveIntegerPredicate = integer -> integer > 0;

    public static Predicate<Integer> negativeIntegerPredicate = integer -> integer < 0;

    public static Predicate<Integer> evenIntegerPredicate = integer -> integer % 2 == 0;

    public static Predicate<Integer> oddIntegerPredicate = integer -> integer % 2 != 0;

    /*public static Predicate<IntegerPredicate> evenIntegerPredicate = new Predicate<Integer>() {
        @Override
        public boolean test(Integer integer) {
            return integer > 0;
        }
    };*/
}
