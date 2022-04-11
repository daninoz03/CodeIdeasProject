package LeetCode.Challenges;

import java.util.ArrayList;
import java.util.List;

public class AddTwoNumbers {

    private String anything = "";




    public List<Integer> addTwoNumbers(List<Integer> l1, List<Integer> l2) {

        List<Integer> returnedList = new ArrayList<>();
        int iterations = Math.max(l1.size(),l2.size());
        boolean carryTheOne = false;
        for (int i = 0; i<iterations;i++) {
            int l1Item = i>=l1.size() ? 0:l1.get(i);
            int l2Item = i>=l2.size() ? 0:l2.get(i);


            int numToAddToReturnedList = l1Item +l2Item;

            // if numbers add up to over 10
            if (numToAddToReturnedList >9) {
                // If the carryTheOne is already set
                if (carryTheOne){
                    numToAddToReturnedList++;
                    carryTheOne = false;
                    if (numToAddToReturnedList>9){
                        carryTheOne = true;
                        continue;
                    }
                }
                carryTheOne = true;
                numToAddToReturnedList = numToAddToReturnedList - 10;
                returnedList.add(numToAddToReturnedList);

                // if carryTheOne is still set then we're at the end of the list and we need to add 1 to the end of the list
                if (i==iterations-1){
                    returnedList.add(1);
                    carryTheOne = false;
                    break;
                }else {
                    continue;
                }

            }else if (carryTheOne){
                numToAddToReturnedList++;
                carryTheOne = false;
            }
            returnedList.add(numToAddToReturnedList);
        }

        return returnedList;
    }

    // TODO: Implement Michael's string solution
    public void stringSolution() {

    }


    public static void main(String[] args) {

        AddTwoNumbers addTwoNumbers = new AddTwoNumbers();


        List<Integer> list1 = new ArrayList<>();
        list1.add(1);
        list1.add(2);
        list1.add(9);
        list1.add(2);

        List<Integer> list2 = new ArrayList<>();
        list2.add(9);
        list2.add(3);
        list2.add(4);

        List<Integer> returnedList = addTwoNumbers.addTwoNumbers(list1, list2);
        System.out.println(returnedList);

        addTwoNumbers.stringBuilderHelp();
    }

    public void stringBuilderHelp() {
        StringBuilder sb = new StringBuilder("..fedcba");
        sb.delete(3,6);
        sb.insert(3, "az");
        System.out.println(sb);

    }
}

