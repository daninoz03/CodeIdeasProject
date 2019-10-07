package CodeExercisesWebsite.Moderate;

import java.util.ArrayList;
import java.util.List;

import static java.util.stream.Collectors.joining;

/**
 * All exercises were taken from https://code-exercises.com/programming/
 */
public class CommaSeparated {

    public String getString(List<Integer> list) {
        return list.parallelStream()
                .map(integer -> integer % 2 == 0 ? "e" + integer : "o" + integer)
                .collect(joining(","));
    }


    public static void main(String[] args) {
        CommaSeparated commaSeparated = new CommaSeparated();
        List<Integer> list = new ArrayList<>();
        list.add(3);
        list.add(44);

        commaSeparated.getString(list);
    }
}
