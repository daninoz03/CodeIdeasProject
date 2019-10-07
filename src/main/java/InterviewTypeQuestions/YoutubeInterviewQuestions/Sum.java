package InterviewTypeQuestions.YoutubeInterviewQuestions;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

/**
 * The task is to find the sum of any pair of numbers from two passed arrays
 * that equal the third parameter sent to the method
 */
public class Sum {

    //Brute force order is O(n^2)
    private static void bruteForce(int[] array1, int[] array2, int requiredTotal) {
        for (int i = 0; i < array1.length; i++) {
            for (int j = 0; j < array2.length; j++) {
                if (array1[i] + array2[j] == requiredTotal) {
                    System.out.println("Brute Force: The following two number's sum are equal to the required total - " + array1[i] + " " + array2[j]);
                }
            }
        }
    }

    //Look at each element in only one array and see what value is needed to
    // add up to the required total from the other array
    // Order is 0(n)
    private static void moreEfficientWay(int[] array1, int[] array2, int requiredTotal) {

        List<Integer> integerArrayList1 = convertIntArrayToIntegerArray(array1);
        List<Integer> integerArrayList2 = convertIntArrayToIntegerArray(array2);

        for (int i = 0; i < integerArrayList1.size(); i++) {
            int requiredAdditionalNumber = requiredTotal - array1[i];

            if (integerArrayList2.contains(requiredAdditionalNumber)) {
                System.out.println("More Efficient: The following two number's sum are equal to the required total - " + integerArrayList1.get(i) + " " + requiredAdditionalNumber);
            }
        }
    }

    // Sort arrays first. If the sum of two numbers is higher then the
    // required total then you can move onto the next iteration of the for loop
    private static void evenMoreEfficientWay(int[] array1, int[] array2, int requiredTotal) {

        // Sort arrays first
        Arrays.sort(array1);
        Arrays.sort(array2);

        for (int i = 0; i < array1.length; i++) {
            int requiredAdditionalNumber = requiredTotal - array1[i];
            for (int j = 0; j < array2.length; j++) {
                if (array1[i] + array2[j] > requiredTotal) {
                    break;
                }
                if (array2[j] == requiredAdditionalNumber) {
                    System.out.println("Even More Efficient: The following two number's sum are equal to the required total - " + array1[i] + " " + array2[j]);
                }
            }
        }
    }

    private static List<Integer> convertIntArrayToIntegerArray(int[] array) {
        List<Integer> integerList = Arrays.stream(array)
                .boxed()
                .collect(Collectors.toList());
        return integerList;
    }

    public static void main(String[] args) {
        int[] array1 = new int[]{1, 8, 9, 12, 15, 3};
        int[] array2 = new int[]{3, 15, 16, 7, 9, 1};
        int requiredTotal = 19;

        bruteForce(array1, array2, requiredTotal);
        moreEfficientWay(array1, array2, requiredTotal);
        evenMoreEfficientWay(array1, array2, requiredTotal);
    }
}
