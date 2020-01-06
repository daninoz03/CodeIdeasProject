package LeetCode.Challenges;

import java.util.HashMap;
import java.util.Map;

/**
 * Given an array of integers, return indices of the two numbers such that they add up to a specific target.
 * <p>
 * You may assume that each input would have exactly one solution, and you may not use the same element twice.
 */
public class Challenge1TwoSum {

    // Brute Force
    public static int[] twoSum(int[] nums, int target) {
        int[] returnedIndices = new int[2];
        for (int i = 0; i < nums.length; i++) {
            for (int j = i + 1; j < nums.length ; j++) {
                if (nums[i] + nums[j] == target) {
                    returnedIndices[0] = i;
                    returnedIndices[1] = j;
                }
            }
        }
        return returnedIndices;
    }

    // Using A Map 2 pass
    public static int[] twoSumMapTwoPass(int[] nums, int target) {
        Map<Integer, Integer> map = new HashMap<>();
        for (int i =0; i < nums.length; i++) {
            map.put(nums[i], i);
        }
        for (int i = 0; i<nums.length; i++) {
            int difference = target - nums[i];
            if (map.containsKey(difference)){
                return new int[]{i,map.get(difference)};
            }
        }
        return new int[]{};
    }

    // Using a map 1 pass
    public static int[] twoSumMapOnePass(int[] nums, int target) {
        Map<Integer, Integer> map = new HashMap<>();
        for (int i =0; i < nums.length; i++) {
            int difference = target - nums[i];
            map.put(nums[i], i);
            if (map.containsKey(difference)){
                return new int[]{i,map.get(difference)};
            }
        }
        return new int[]{};
    }

    public static void main(String[] args) {
        int[] toSend = new int[]{11, 15,7,2};
        int[] array = twoSum(toSend,9);
        for (int item: array){
            System.out.println("Answer is "+item);
        }

        System.out.println("************************");

        int[] array2 = twoSumMapTwoPass(toSend,9);
        for (int item: array2){
            System.out.println("Answer is "+item);
        }

        System.out.println("************************");

        int[] array3 = twoSumMapOnePass(toSend,9);
        for (int item: array3){
            System.out.println("Answer is "+item);
        }

    }
}
