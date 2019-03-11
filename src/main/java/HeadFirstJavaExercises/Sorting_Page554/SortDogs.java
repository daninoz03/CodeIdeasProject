package HeadFirstJavaExercises.Sorting_Page554;


import java.util.*;

public class SortDogs {

    List<Dog> dogs = new ArrayList<>();

    public static void main(String[] args) {
        SortDogs sortDogs = new SortDogs();
        sortDogs.go();
    }

    public void go() {
        List<String> previousOwners1 = new ArrayList<>();
        previousOwners1.add("Bettie");
        previousOwners1.add("Davis");
        previousOwners1.add("Junior");
        List<String> previousOwners2 = new ArrayList<>();
        previousOwners2.add("Mark");
        previousOwners2.add("David");
        previousOwners2.add("Chapman");
        Dog dog1 = new Dog("Topsy", 1, previousOwners1);
        Dog dog2 = new Dog("Tappa", 5, previousOwners2);
        Dog dog3 = new Dog("Takka", 4, previousOwners1);
        Dog dog4 = new Dog("Mindy", 8, previousOwners2);
        Dog dog5 = new Dog("Dipso", 2, previousOwners1);
        dogs.add(dog1);
        dogs.add(dog2);
        dogs.add(dog3);
        dogs.add(dog4);
        dogs.add(dog5);

        DogNameCompare dogNameCompare = new DogNameCompare();
        Collections.sort(dogs, dogNameCompare);
        System.out.println("Dog name compare:\n"+dogs+"\n");

        DogAgeCompare dogAgeCompare = new DogAgeCompare();
        Collections.sort(dogs, dogAgeCompare);
        System.out.println("Dogs age compare:\n"+dogs+"\n");

        ArrayList<String> allPreviousOwners = new ArrayList<>();
        allPreviousOwners.addAll(previousOwners1);
        allPreviousOwners.addAll(previousOwners2);
        Collections.sort(allPreviousOwners);
        System.out.println("Previous Owners compare:\n"+allPreviousOwners);
    }
}