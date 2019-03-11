package HeadFirstJavaExercises.Sorting_Page554;

import java.util.Comparator;

public class DogNameCompare implements Comparator<Dog> {


    @Override
    public int compare(Dog dog1, Dog dog2) {
        return dog1.getName().compareTo(dog2.getName());
    }
}
