package CodeExercisesWebsite.Easy;

import java.util.ArrayList;
import java.util.List;

/**
 * All exercises were taken from https://code-exercises.com/programming/
 */
public class AverageValue {

    public static Double average(List<Integer> list) {
        return list.stream()
                .mapToInt(e -> e)
                .average()
                .getAsDouble();
    }

    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>();
        list.add(2);
        list.add(4);
        list.add(1);
        list.add(23);
        list.add(43);
        list.add(22);

        System.out.println(average(list));
    }
}
