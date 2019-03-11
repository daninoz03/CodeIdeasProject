package Generics;


import Sorting.Animal;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class SimpleTest {

    public static void main(String[] args) {
        Container<Integer, String> container = new Container<>(123,"test");

        int intItem = container.getItem1();
        String stringItem = container.getItem2();

        System.out.println(intItem);
        System.out.println(stringItem);

        Set<String> stringSet1 = new HashSet<>();
        stringSet1.add("one");
        stringSet1.add("two");
        stringSet1.add("three");

        Set<String> stringSet2 = new HashSet<>();
        stringSet2.add("two");
        stringSet2.add("three");
        stringSet2.add("four");

        SimpleTest simpleTest = new SimpleTest();
        Set resultSet = union(stringSet1, stringSet2);

        Iterator iterator = resultSet.iterator();
        while (iterator.hasNext()){
            System.out.println("****"+iterator.next());
        }

    }

    public static <E> Set<E> union (Set<E> set1, Set<E> set2){
        Set<E> result = new HashSet<>(set1);
        result.addAll(set2);
        return result;
    }

    public static Set<?> unionWildCard (Set<? extends Animal> set1, Set<?> set2){
        Set<?> result = new HashSet<>(set1);
        //Can't add here as it could be anything being added
        //result.addAll(set2);
        return result;
    }
}

