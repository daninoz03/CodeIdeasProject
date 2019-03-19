package UdemyJavaCourse.Section8.ReverseArrayChallenge;

import java.util.ArrayList;
import java.util.Arrays;

public class Main {


    public static int[] reverse(int[] array) {
        int[] reversedArray = new int[array.length];
        int counter = 0;
        for (int i = array.length-1; i>=0; i--){
            reversedArray[counter] = array[i];
            counter++;
        }

        System.out.println("Value of array is "+ Arrays.toString(array));
        System.out.println("Value of reversed array is "+ Arrays.toString(reversedArray));

        return reversedArray;
    }

    public static void reverseNewApproachUsingOnlyThePassedArray(int[] array) {

        int counter = 1;
        for (int i = 0 ; i< array.length/2; i++){

            //New approach
            int temp = array[i];
            array[i] = array[array.length-counter];
            array[array.length-counter] = temp;

            counter++;
        }
    }

    public static void main(String[] args) {
        int[] array = new int[]{1,2,3,4,5,56,7};

        Main.reverse(array);

        System.out.println("Array is "+Arrays.toString(array));

        reverseNewApproachUsingOnlyThePassedArray(array);

        System.out.println("Reversed array is "+Arrays.toString(array));

        ArrayList<Integer> arrayList = new ArrayList<Integer>();
        arrayList.add(1);
        arrayList.add(1);
        arrayList.add(1);


    }
}
