package InterviewTypeQuestions.VerizonInterviewQuestions.ProposedInternAndGraduateExams.FindTheBug;

import org.junit.Test;
import org.junit.runner.JUnitCore;

import java.util.ArrayList;
import java.util.List;

/**
 *
 *
 * Note: Please do not edit the unit test at the bottom of the class marked with the "Test" annotation
 */
public class FindTheBug2 {
    private static int i = 3;
    private static int j = 4;

    // Out of scope test
    public static List<String> addItemsToList(String item1, String item2, String item3) {
        List<String> list = new ArrayList<>();

        for (int i=0; i<3;i++){

        }
        System.out.println("There are "+i +" items in the list");
        return list;
    }

    // NPE exception


    //

    public static void main(String[] args) {
        JUnitCore.main("FindTheBug2");
    }

    @Test
    public void shouldReturnSomethingOrOther() {
        // given

        // when

        // then

    }

}
