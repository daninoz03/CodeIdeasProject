package CodeExercisesWebsite.Moderate;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

/**
 * All exercises were taken from https://code-exercises.com/programming/
 */
public class FilterStringsWithStreams {


    public static List<String> search(List<String> list) {
        return list.stream()
                .filter(s -> s.startsWith("a"))
                .filter(s -> s.length() == 3)
                .collect(Collectors.toList());
    }

    public static void main(String[] args) {
        ArrayList<String> first = new ArrayList<>();
        first.add("abc");
        first.add("bbb");

        ArrayList<String> second = new ArrayList<>();
        second.add("ab");
        second.add("abcd");

        ArrayList<String> third = new ArrayList<>();
        third.add("aaa");

        System.out.println(search(first));
        System.out.println(search(second));
        System.out.println(search(third));
    }




}
