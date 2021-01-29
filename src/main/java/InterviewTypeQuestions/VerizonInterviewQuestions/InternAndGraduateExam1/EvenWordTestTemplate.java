package InterviewTypeQuestions.VerizonInterviewQuestions.InternAndGraduateExam1;

import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.JUnitCore;

public class EvenWordTestTemplate {

    private static int evenWord(String input){
        //write your implementation here please.
        return -1;
    }
    public static void main(String[] args) {
        JUnitCore.main("EvenWordDeleteAfter");
    }

    @Test
    public void shouldReturnZeroWhenAnEmptyStringIsPassed() {
        Assert.assertEquals(0, evenWord(""));
    }

    @Test
    public void shouldReturnZeroWhenAnEvenWordIsPassed() {
        Assert.assertEquals(0, evenWord("aaaa"));
    }

    @Test
    public void shouldReturnTheOddLetterCountWhenAnOddWordIsPassed() {
        Assert.assertEquals(2, evenWord("potato"));
    }

}
