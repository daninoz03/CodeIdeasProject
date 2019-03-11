package UdemyJavaCourse.Section5.MinAndMaxOutputChallenge;

import java.util.Scanner;

public class SomeClass {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int min =0;
        int max=0;
        int numberEntered;
        boolean firstTime = true;
        while (true){
            System.out.println("Enter Number:");
            if (!scanner.hasNextInt()){
                System.out.println("Invalid Number");
                System.out.println("Min is "+min+" and Max is "+max);
                break;
            }
            numberEntered = scanner.nextInt();
            if (firstTime){
                min = numberEntered;
                max = numberEntered;
                firstTime = false;
            }
            if (numberEntered > max){
                max = numberEntered;
            }else if(numberEntered < min){
                min = numberEntered;
            }
            scanner.nextLine();
        }
        scanner.close();
    }
}
