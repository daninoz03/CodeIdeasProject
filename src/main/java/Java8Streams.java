package main.java;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

/**
 * Created by danielobrien on 6/12/17.
 */
public class Java8Streams {


    List<String> lowerCaseList = new ArrayList<>();

    List<String> upperCaseList = new ArrayList<>();

    String placeHolder;

    public Java8Streams() {
        lowerCaseList.add("small");
        lowerCaseList.add("medium");
        lowerCaseList.add("large");
    }

    public void testingJava7 () {
        //List<String> lowerCaseList = Arrays.asList("small", "medium", "large");



        for(int i=0; i<lowerCaseList.size(); i++) {

            placeHolder = lowerCaseList.get(i);
            //upperCaseList.set(i,placeHolder.toUpperCase());
            upperCaseList.add(placeHolder.toUpperCase());

            System.out.println("The value of upperCaseList is "+upperCaseList);
        }

        System.out.println("The value of lowerCaseList is "+lowerCaseList);
        System.out.println("The value of upperCaseList is "+upperCaseList);
    }

    public void testingJava8Streams() {

        List<String> collection = lowerCaseList.stream().map(lowerCaseList->lowerCaseList.toUpperCase())
                .collect(Collectors.toList());
        System.out.println("Java8 The value of lowerCaseList is now "+collection);
    }

    /*public void newForLoop () {
        List<String> forList = new ArrayList<>();
        forList.add("First");
        forList.add("Second");
        forList.add("Third");

        List<String> secondForList = new ArrayList<>();
        secondForList.add("Third");
        secondForList.add("Forth");
        secondForList.add("Fifth");

        for(forList:secondForList){
            System.out.println(currentResult);
        }
    }*/

    public void java8StreamFilters() {
        List<String> lines = Arrays.asList("spring", "node", "mkyong");
    }

    public static void main(String[] args) {
        Java8Streams java8Streams = new Java8Streams();
        java8Streams.testingJava7();
        java8Streams.testingJava8Streams();
        //java8Streams.newForLoop();
    }
}
