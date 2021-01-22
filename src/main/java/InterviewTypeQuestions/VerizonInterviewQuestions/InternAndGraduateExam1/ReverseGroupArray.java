package InterviewTypeQuestions.VerizonInterviewQuestions.InternAndGraduateExam1;


import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.JUnitCore;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.stream.Collectors;

/*
Given an integer array, reverse it in groups of consecutive numElements.

Given an integer array, reverse it in groups of consecutive numElements.

EXAMPLE:
Input array: [2, 4, 6, 8]
numElements: 2 (per group)
First group: [2, 4] Second group: [6, 8]
Result: [4, 2, 8, 6]

Input array: [2, 4, 6, 8]
numElements: 3 (per group)
First group: [2, 4, 6] Second group: [8]
Result: [6, 4, 2, 8]

Input array: [1, 2, 3]
numElements: 1 (per group)
First group: [1] Second group: [2] Third group: [3]
Result: [1, 2, 3]

HOW TO RUN:
1) Click the green Run button in the top left of Coderpad
2) The main function invokes the tests specified in the class

TIPS:
Write as many methods and tests as you deemed necessary to solve this task.
Please focus on code quality and not only hacking something together to make it work. You will be asked to explain & comment your solution.
It would also help us if you could use this screen for the entire task, so that we can see how you got to the solution of this problem.
Feel free to ask questions if you need clarification.
*/

public class ReverseGroupArray {

    public static int[] reverseGroup(int[] array, int numElements) {
        ArrayList<Integer> finalArrayList = new ArrayList<>();
        int[] miniArray = new int[numElements];
        for (int j = 0; j < array.length; j = j + numElements) {
            for (int i = 0; i < numElements; i++) {
                if (array.length - j < numElements) {
                    // dont' reverse and add to final array
                    finalArrayList.add(array[j]);

                    // if you're at the end of the array then break
                    if (j == array.length - 1) {
                        break;
                    }
                } else {
                    // reverse
                    miniArray[i] = array[i + j];
                }
            }
            if (j == array.length - 1) {
                break;
            }
            finalArrayList.addAll(reverseArray(miniArray));
        }
        return finalArrayList.stream().mapToInt(e -> e).toArray();
    }

    private static ArrayList<Integer> reverseArray(int[] arrayToReverse) {
        int[] arrayToReturn = new int[arrayToReverse.length];
        int count = 0;
        for (int i = arrayToReverse.length - 1; i >= 0; i--) {
            arrayToReturn[count] = arrayToReverse[i];
            count++;
        }
        return (ArrayList<Integer>) Arrays.stream(arrayToReturn).boxed().collect(Collectors.toList());
    }

    @Test
    public void testRowGeneration() {
        int[] inputArray = {2, 4, 6, 8};
        Assert.assertArrayEquals(new int[]{4, 2, 8, 6}, reverseGroup(inputArray, 2));
        Assert.assertArrayEquals(new int[]{6, 4, 2, 8}, reverseGroup(inputArray, 3));
        Assert.assertArrayEquals(new int[]{8, 6, 4, 2}, reverseGroup(inputArray, 4));
    }

    public static void main(String[] args) {
        JUnitCore.main("ReverseGroupArray");
    }

}
