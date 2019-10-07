package CodeExercisesWebsite.Easy;

/**
 * All exercises were taken from https://code-exercises.com/programming/
 */
public class LinearSearch {

    public static int search(Integer n, Integer[] list) {
        for (int i = 0; i < list.length; i++) {
            if (n.equals(list[i])) {
                return i;
            }
        }
        return -1;
    }

    public static void main(String[] args) {
        Integer[] integers = new Integer[]{5, 4, 7, 2, 3, 1};
        System.out.println(search(7, integers));
    }
}
