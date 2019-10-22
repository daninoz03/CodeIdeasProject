package LeetCode.Challenges;

/**
 * Given an array of integers, return indices of the two numbers such that they add up to a specific target.
 * <p>
 * You may assume that each input would have exactly one solution, and you may not use the same element twice.
 */
public class Challenge1TwoSum {

    public static int[] twoSum(int[] nums, int target) {
        int[] returnedIndices = new int[2];
        for (int i = 0; i < nums.length; i++) {
            for (int j = i + 1; j < nums.length ; j++) {
                if (nums[i] + nums[j] == target) {
                    returnedIndices[0] = nums[i];
                    returnedIndices[1] = nums[j];
                    //Array.set(returnedIndices, 0, sums[i]);
                    //Array.set(returnedIndices, 1, sums[j]);
                }
            }
        }
        return returnedIndices;
    }

    public static void main(String[] args) {
        int[] toSend = new int[]{11, 15,7,2};
        int[] array = twoSum(toSend,9);
        for (int item: array){
            System.out.println("Answer is "+item);
        }

        System.out.println("************************");
    }
}
