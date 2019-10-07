package CodeExercisesWebsite.Easy;

/**
 * All exercises were taken from https://code-exercises.com/programming/
 */
public class FindMaximum {


    public static Integer maximum(Integer[] list) {
        Integer max = 0;
        for (int i=0; i< list.length; i++) {
            if (list[i] > max){
                max = list[i];
            }
        }
        return max;
    }

    public static void main(String[] args) {

        Integer[] integers = new Integer[]{3,56,3,543,1};
        System.out.println(maximum(integers));
    }
}
