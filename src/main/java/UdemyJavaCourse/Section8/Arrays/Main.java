package UdemyJavaCourse.Section8.Arrays;

import java.util.Scanner;

public class Main {

    public static float calculateAverage(int[] intArray) {
        int total = 0;
        float average = 0;

        for (int i = 0; i < intArray.length; i++) {
            total += intArray[i];
        }
        System.out.println("Total is " + total);
        average = (float) total / intArray.length;
        return average;
    }

    public static void main(String[] args) {
        int[] intArray = new int[10];
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter 10 numbers:");
        for (int i = 0; i < intArray.length; i++) {
            intArray[i] = scanner.nextInt();
        }

        System.out.println("The average is " + calculateAverage(intArray));

        scanner.close();
    }


}
