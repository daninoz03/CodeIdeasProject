package Top5Algorithms;

import Top5Algorithms.HelperClasses.CombinationSumListComparator;

import java.util.*;

public class CombinationSum {

    /*public List<List<Integer>> combinationSum(int[] candidates, int target) {
        int sum = 0;
        List<Integer> integerList = new ArrayList<>();

        List<List<Integer>> listOfList = new ArrayList<>();

        if (sum == target){
            break ;
        }
        // if the sum is greater than
        if (sum == target){
            break ;
        }

        //if the list
     }*/

    static ArrayList<ArrayList<Integer>> getCombinationSum(ArrayList<Integer> arr, int sum) {
        ArrayList<ArrayList<Integer>> ans = new ArrayList<>();
        ArrayList<Integer> temp = new ArrayList<>();

        // first do hashing since hashset does not always sort
        //  removing the duplicates using HashSet and Sorting the arrayList
        Set<Integer> set = new HashSet<>(arr);
        arr.clear();
        arr.addAll(set);
        Collections.sort(arr);

        findNumbers(ans, arr, sum, 0, temp);

        Collections.sort(ans,new CombinationSumListComparator<>());
        return ans;
    }

    static void findNumbers(ArrayList<ArrayList<Integer>> ans,
                            ArrayList<Integer> arr, int sum, int index,
                            ArrayList<Integer> temp) {

        if (sum == 0) {
            // Adding deep copy of list to ans
            ans.add(new ArrayList<>(temp));
            return;
        }

        for (int i = index; i < arr.size(); i++) {
            // checking that sum does not become negative
            if ((sum - arr.get(i)) >= 0) {
                // adding element which can contribute to sum
                temp.add(arr.get(i));
                findNumbers(ans, arr, sum - arr.get(i), i,
                        temp);
                // removing element from list (backtracking)
                temp.remove(arr.get(i));
            }
        }
    }
}
