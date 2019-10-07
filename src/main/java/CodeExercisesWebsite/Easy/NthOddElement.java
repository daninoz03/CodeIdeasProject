package CodeExercisesWebsite.Easy;

import java.util.List;

/**
 * All exercises were taken from https://code-exercises.com/programming/
 */
public class NthOddElement {

    public Integer getElement(List<Integer> list, Integer n) {
        if (n >= list.size()) {
            return -1;
        }
        return list.get(n+1);
    }

    public static void main(String[] args) {

    }
}
