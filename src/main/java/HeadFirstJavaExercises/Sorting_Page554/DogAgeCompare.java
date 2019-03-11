package HeadFirstJavaExercises.Sorting_Page554;

import java.util.Comparator;

public class DogAgeCompare implements Comparator<Dog> {
    @Override
    public int compare(Dog dog1, Dog dog2) {
        return dog1.getAge() - dog2.getAge();
    }
}
