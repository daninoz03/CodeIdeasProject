package UdemyJavaCourse.Section5.CodingExercise27;

import java.util.Scanner;

public class InputCalculator {

    public static void inputThenPrintSumAndAverage() {

        int sum = 0;
        double avg;
        int counter = 0;
        Scanner scanner = new Scanner(System.in);
        while (true) {
            System.out.println("Please enter number:");
            if (scanner.hasNextInt()) {
                sum += scanner.nextInt();
                counter++;
            } else {
                avg = (float) sum / counter;
                System.out.println("SUM = " + sum + " AVG = " + (int) Math.ceil(avg));
                break;
            }
            scanner.nextLine();
        }

    }

    public static void main(String[] args) {

        inputThenPrintSumAndAverage();
    }
}
