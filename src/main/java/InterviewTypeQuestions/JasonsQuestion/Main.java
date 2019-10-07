package InterviewTypeQuestions.JasonsQuestion;

import org.apache.commons.lang3.time.StopWatch;

import java.util.Arrays;
import java.util.concurrent.TimeUnit;

/**
 * Given an array of integers, return indices of the two numbers such that they add up to a specific target.
 *
 * You may assume that each input would have exactly one solution, and you may not use the same element twice.
 *
 * Example:
 *
 * Given nums = [2, 7, 11, 15], target = 9,
 *
 * Because nums[0] + nums[1] = 2 + 7 = 9,
 * return [0, 1].
 */

public class Main {


    public static int[] bruteForceMethod(int[] intArray, int target){

        for (int i=0; i<intArray.length-1;i++) {
            for (int j =i+1;j<intArray.length;j++){
                if (intArray[i] + intArray[j] == target){
                    return new int[]{i, j};
                }
            }
        }
        return new int[]{};
    }

    public static int[] orderingMethod(int[] intArray, int target) {
        // order array first
        Arrays.sort(intArray);
        for (int i=0; i<intArray.length;i++){
            for (int j=i+1;j<intArray.length;j++) {
                if (intArray[i] + intArray[j] > target) {
                    break;
                } else if(intArray[i] + intArray[j] == target) {
                    return new int[]{i, j};
                }
            }
        }
        return new int[]{};
    }

    public static int[] secretlyBrilliantMethod(int[] intArray, int target) {

        return null;
    }

    private static void calculateTimeTakenForEachMethod(int[] intArray, int target) {
        StopWatch timer = new StopWatch();
        timer.start();
        int[] bruteForceResult = bruteForceMethod(intArray,target);
        timer.stop();
        System.out.println("Time taken for brute force method: "+timer.getTime(TimeUnit.NANOSECONDS));
        timer.reset();

        timer.start();
        int[] orderingMethodResult = orderingMethod(intArray, target);
        timer.stop();
        System.out.println("Time taken for ordering method: "+timer.getTime(TimeUnit.NANOSECONDS));
    }


    public static void main(String[] args) {

        StopWatch timer = new StopWatch();

        int[] intArray = new int[]{2,7,11,15};
        int target = 9;

        calculateTimeTakenForEachMethod(new int[]{1,2,3,4,5,6,7,8,9,12,14,15},15);

        calculateTimeTakenForEachMethod(new int[]{15,7,3,8,10,3,2,1},15);

        System.out.println(bruteForceMethod(intArray,target));
    }

}
