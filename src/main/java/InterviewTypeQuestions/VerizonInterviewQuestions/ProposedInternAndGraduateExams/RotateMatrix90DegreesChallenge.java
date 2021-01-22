package InterviewTypeQuestions.VerizonInterviewQuestions.ProposedInternAndGraduateExams;

import java.util.Arrays;

public class RotateMatrix90DegreesChallenge {

    static void rotate90ClockwiseWorkingMethod(int m[][] )
    {
        int matSize = m[0].length;
        for (int i = 0; i < matSize / 2; i++) {
            for (int j = i; j < matSize - i - 1; j++) {
                int temp                            = m[i][j];
                m[i][j]                             = m[matSize - 1 - j][i];

                m[matSize - 1 - j][i]               = m[matSize - 1 - i][matSize - 1 - j];
                m[matSize - 1 - i][matSize - 1 - j] = m[j][matSize - 1 - i];

                m[j][matSize - 1 - i]               = temp;

                System.out.println(Arrays.deepToString(m));
            }
        }
    }

    // Copy this one for a test
    static void rotate90ClockwiseNotWorkingMethod(int m[][] )
    {
        int matSize = m[0].length;
        for (int i = 0; i < matSize / 2; i++) {
            for (int j = i; j < matSize - i - 1; j++) {
                int temp                            = m[i][j];
                m[i][j]                             = m[matSize - 1 - j][i];
                m[matSize - 1 - i][matSize - 1 - j] = m[j][matSize - 1 - i];
                m[matSize - 1 - j][i]               = m[matSize - 1 - i][matSize - 1 - j];
                m[j][matSize - 1 - i]               = temp;

                System.out.println(Arrays.deepToString(m));
            }
        }
    }

    public static void main(String[] args) {
        int[][] newArray = new int[][]{{1,2},{3,4}};
        rotate90ClockwiseWorkingMethod(newArray);
    }
}
