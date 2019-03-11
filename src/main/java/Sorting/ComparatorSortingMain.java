package Sorting;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

public class ComparatorSortingMain {

    public static void main(String[] args) {
        ComparatorSortingMain comparatorSortingMain = new ComparatorSortingMain();
        comparatorSortingMain.go();
    }


    public void go(){
        Animal animal1 = new Animal("Whale", 40);
        Animal animal2 = new Animal("Cheetah", 100);
        Animal animal3 = new Animal("Snail", 1);

        List<Animal> animals = new ArrayList<>();
        animals.add(animal1);
        animals.add(animal2);
        animals.add(animal3);

        SortAnimalsBySpecies sortAnimalsBySpecies = new SortAnimalsBySpecies();
        Collections.sort(animals, sortAnimalsBySpecies);
        System.out.println(animals);

        SortAnimalsByTopSpeed sortAnimalsByTopSpeed = new SortAnimalsByTopSpeed();
        Collections.sort(animals, sortAnimalsByTopSpeed);
        System.out.println(animals);
    }

}
