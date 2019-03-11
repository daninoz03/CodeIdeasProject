package Lambdas.CoderCrunchExamples.MethodReferences;

import Lambdas.CoderCrunchExamples.SimpleSorting.Java8Lambda.Person;

import java.util.ArrayList;
import java.util.List;

public class MethodReferences {

    public static void main(String[] args) {
        List<String> stringList = new ArrayList<>();
        stringList.add("Hello");
        stringList.add("World");

        //Standard lambda way;
        stringList.replaceAll(s -> s.toUpperCase());

        //New way (:: is the reference operator)
        stringList.replaceAll(String::toUpperCase);

        System.out.println(stringList);
    }
}
