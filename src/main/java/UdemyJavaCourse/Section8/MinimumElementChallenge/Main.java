package UdemyJavaCourse.Section8.MinimumElementChallenge;

import java.util.Scanner;

public class Main {

    private static Scanner scanner = new Scanner(System.in);

    private static int[] readIntegers(int count) {
        int[] array = new int[count];
        System.out.println("Please enter " + count + " numbers");
        for (int i = 0; i < count; i++) {
            array[i] = scanner.nextInt();
        }
        return array;
    }

    public static int findMin(int[] array) {
        int min = array[0];
        for (int i = 0; i < array.length; i++) {
            if (array[i] < min) {
                min = array[i];
            }
        }
        return min;
    }

    public static void main(String[] args) {

        System.out.println("Please enter the count");
        int count = scanner.nextInt();
        int[] returnedArray = readIntegers(count);

        System.out.println("Minimum value in array is " + findMin(returnedArray));

        scanner.close();
    }
}
