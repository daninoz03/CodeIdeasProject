package HashCodes;

import HeadFirstJavaExercises.Sorting_Page554.Dog;

import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;

public class HashCodeTest {

    HashMap<String, Dog> dictionary = new HashMap<>();

    public static void main(String[] args) {
        HashCodeTest hashCodeTest = new HashCodeTest();

        hashCodeTest.go();
    }

    public void go() {
        ArrayList<String> previousOwners = new ArrayList<>();
        previousOwners.add("Dan");

        Dog dog1 = new Dog("Bracken", 7, previousOwners);
        Dog dog2 = new Dog("Axl", 8, previousOwners);
        Dog dog3 = new Dog("Logie", 4, previousOwners);
        dictionary.put("Funny", dog1);
        Dog newDog1 = new Dog("Bracken", 7, previousOwners);
        dictionary.put("Funniest", newDog1);
        System.out.println(dictionary.get("Funny"));
        System.out.println(dictionary.get("Funny").equals( dictionary.get("Funniest")));
        System.out.println(dictionary.get("Funny").hashCode());
        System.out.println(dictionary.get("Funniest").hashCode());
    }

}
