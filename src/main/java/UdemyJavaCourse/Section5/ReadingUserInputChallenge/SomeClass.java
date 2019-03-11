package UdemyJavaCourse.Section5.ReadingUserInputChallenge;

import java.util.Scanner;

public class SomeClass {


    public static void main(String[] args) {
        int sum = 0;
        int validNumberCount = 1;
        Scanner scanner = new Scanner(System.in);
        while (validNumberCount <=10){
            System.out.println("Enter number #"+validNumberCount);
            if(scanner.hasNextInt()){
                sum = sum + scanner.nextInt();
                validNumberCount++;
            }else {
                System.out.println("Invalid Number");
            }
            scanner.nextLine();
        }
        scanner.close();
        System.out.println("Total of all values is "+sum);
    }
}
