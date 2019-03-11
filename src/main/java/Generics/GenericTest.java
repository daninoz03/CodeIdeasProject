package Generics;

import java.util.List;

public class GenericTest<T> {

    public void printMethod(T element) {
        System.out.println(element.toString());
    }

    public void windcardTest (String name) {

    }


}

class Main {
    public static void main(String[] args) {
        GenericTest<Integer> genericTest = new GenericTest<>();
        GenericTest<Boolean> genericTestBool = new GenericTest<>();
        GenericTest<?> genericTestWildcard = new GenericTest<>();

        genericTest.printMethod(1);
        genericTestBool.printMethod(true);
        //genericTestWildcard.printMethod(new Object());
        genericTest.windcardTest("");
    }
}

