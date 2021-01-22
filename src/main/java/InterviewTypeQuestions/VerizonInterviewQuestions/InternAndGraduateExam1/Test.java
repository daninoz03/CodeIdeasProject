package InterviewTypeQuestions.VerizonInterviewQuestions.InternAndGraduateExam1;


import org.junit.Assert;

public class Test {
    private static int evenWord(String input)
    {
    /*
    for it to be an even word each letter %2 has to return 0
    two loops to count each time a letter appears in the string
    one temp count to for letter appearences if the letter apears an
    uneven ammount of times then its added to the remove count
    which is returned for the total ammount of letters to be removed
    */
        int remove=0;
        for(int i =0; i<input.length();i++)
        {
            int check=0;
            for(int j =0; j<input.length();j++)
            {
                if(input.charAt(i)==input.charAt(j))
                {
                    check++;
                }

            }
            if(check%2!=0)
            {
                remove+=check;
            }
        }
        return remove;
    }

    public static void main(String[] args) {
        Assert.assertEquals(0, evenWord(""));
        Assert.assertEquals(0, evenWord("aaaa"));
        Assert.assertEquals(1, evenWord("aaaaa"));
        Assert.assertEquals(2, evenWord("potato"));
        Assert.assertEquals(3, evenWord("apple"));
    }
}

