package InterviewTypeQuestions.VerizonInterviewQuestions.ProposedInternAndGraduateExams.FindTheBug;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class BugFilled {


    private Map<Integer, Integer> convertListToMap(List<Integer> list) {
        Map<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i <= list.size(); i++) {
            System.out.println("Now at index " + i);
            map.put(i, list.get(i));
        }
        return map;
    }


    private int countTheOccurrencesWhileIgnoringTheCase(List<String> list, String stringToFind) {
        // The count should ignore the case
        // For example if "Hello", "hello" and "hELlO" are passed it should return a count of 3
        int count = 0;
        for (int i = 0; i< list.size();i++) {
            if (list.get(i).equals(stringToFind)) {
                count +=i;
            }
        }
        return count;

    }

    private void equalsKnowledge() {
        //basically use the wrong equals where the values look the same but it thinks they aren't equal because they're not the same object
    }


    public static void main(String[] args) {
        BugFilled bugFilled = new BugFilled();

        List<Integer> integerList = new ArrayList<>();
        integerList.add(2);
        integerList.add(7);
        integerList.add(123);

        List<String> stringList = new ArrayList<>();
        stringList.add("Hello");
        stringList.add("Hello");
        stringList.add("World");

        bugFilled.convertListToMap(integerList);

        System.out.println(bugFilled.countTheOccurrencesWhileIgnoringTheCase(stringList, "Hello"));
    }
}
