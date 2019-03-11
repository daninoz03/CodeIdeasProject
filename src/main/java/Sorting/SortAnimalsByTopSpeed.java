package Sorting;

import java.util.Comparator;

public class SortAnimalsByTopSpeed implements Comparator<Animal>{


    @Override
    public int compare(Animal o1, Animal o2) {
        return o1.getTopSpeed() - o2.getTopSpeed();
    }
}
