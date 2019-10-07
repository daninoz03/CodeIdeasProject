package CodeExercisesWebsite.Easy;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

/**
 * All exercises were taken from https://code-exercises.com/programming/
 */
public class ConvertToUpperCase {

    public static List<String> upperCase(List<String> list) {
        return list.stream()
                .map(String::toUpperCase)
                .collect(Collectors.toList());
    }

    public static void main(String[] args) {

        List<String> list = new ArrayList<>();
        list.add("asd");
        list.add("qwe");
        list.add("rew");
        list.add("sdfdgf");
        list.add("ncvncg");

        List<String> returnedList = upperCase(list);

        for (String element : returnedList) {
            System.out.println(element);
        }

    }
}
