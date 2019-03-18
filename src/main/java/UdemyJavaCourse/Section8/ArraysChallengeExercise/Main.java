package UdemyJavaCourse.Section8.ArraysChallengeExercise;

import java.util.Arrays;
import java.util.Scanner;

public class Main {

    static Scanner scanner = new Scanner(System.in);

    private static int[] getIntegers(int[] intArray) {

        for (int i = 0; i < intArray.length; i++) {
            intArray[i] = scanner.nextInt();
        }
        return intArray;
    }

    private static void printArray(int[] intArray) {
        for (int i = 0; i < intArray.length; i++) {
            System.out.println(intArray[i]);
        }

    }

    public static int[] sortIntegers(int[] intArray) {

        //Copy array simple method
        /*int[] sortedArray = new int[intArray.length];
        for (int i = 0; i < intArray.length; i++) {
            sortedArray[i] = intArray[i];
        }*/

        //Copy array method 2
        int[] sortedArray = Arrays.copyOf(intArray,intArray.length);

        boolean flag = true;
        int temp;

        while (flag) {
            flag = false;
            for (int i = 0; i < sortedArray.length - 1; i++) {
                if (sortedArray[i] < sortedArray[i + 1]) {
                    temp = sortedArray[i];
                    sortedArray[i] = sortedArray[i + 1];
                    sortedArray[i + 1] = temp;
                    flag = true;
                }
            }
        }

        return sortedArray;
    }

    public static void main(String[] args) {

        int[] intArray = new int[5];

        int[] returnedArray = Main.getIntegers(intArray);

        int[] sortedIntArray = Main.sortIntegers(returnedArray);

        Main.printArray(sortedIntArray);

        scanner.close();
    }
}
