package Quiz;

import java.util.HashMap;
import java.util.Random;

public class RandomQuizWithTinyChanceOfTerribleResult {

    HashMap<String, Integer> choicesPicked = new HashMap<>();

    Random random = new Random();
    int choice;

    static final String OPTION_1 = "Shot";
    static final String OPTION_2 = "Chilli";
    static final String OPTION_3 = "Peashooter";
    static final String OPTION_4 = "Taser";

    static final int OPTION_1_MAX = 4;
    static final int OPTION_2_MAX = 3;
    static final int OPTION_3_MAX = 3;
    static final int OPTION_4_MAX = 1;


    public static void main(String[] args) {

        /*String hello = "hello";
        String hi = hello+"anything";
        hello = hello+"double";
        System.out.println(hi);
        System.out.println(hello);*/
        RandomQuizWithTinyChanceOfTerribleResult randomQuizWithTinyChanceOfTerribleResult = new RandomQuizWithTinyChanceOfTerribleResult();
        randomQuizWithTinyChanceOfTerribleResult.runQuiz();
    }

    /**
     * We have 4 options
     *  - Shot: 32% chance
     *  - Spice: 32% chance
     *  - Peashooter: 32% chance
     *  - Something really bad (taser, rasher across the ass etc): 5% chance
     */
    public void runQuiz() {
        int count = 0;

        // Change the loop for the amount of questions we have
        while (count < 10) {
            choice = random.nextInt(100) + 1;

            // Option 1
            if (choice <= 32) {
                if (maximumReachedAllowedForCurrentChoice(choicesPicked, OPTION_1_MAX, OPTION_1)) {
                    continue;
                }
                addChoiceToMapAndPrintChoice(choicesPicked, OPTION_1);

                // Option 2
            } else if (choice > 32 && choice <= 64) {
                if (maximumReachedAllowedForCurrentChoice(choicesPicked, OPTION_2_MAX, OPTION_2)) {
                    continue;
                }
                addChoiceToMapAndPrintChoice(choicesPicked, OPTION_2);

                // Option 3
            } else if (choice > 64 && choice <= 94) {
                if (maximumReachedAllowedForCurrentChoice(choicesPicked, OPTION_3_MAX, OPTION_3)) {
                    continue;
                }
                addChoiceToMapAndPrintChoice(choicesPicked, OPTION_3);

                // Option 4
            } else {
                if (maximumReachedAllowedForCurrentChoice(choicesPicked, OPTION_4_MAX, OPTION_4)) {
                    continue;
                }
                addChoiceToMapAndPrintChoice(choicesPicked, OPTION_4);
            }
            count++;
        }
    }

    private static void addChoiceToMapAndPrintChoice(HashMap<String, Integer> choicesPicked, String option) {

        if (choicesPicked.get(option) == null) {
            choicesPicked.put(option, 1);
            System.out.println(option);
        } else {
            choicesPicked.put(option, choicesPicked.get(option) + 1);
            System.out.println(option);
        }


    }

    private static boolean maximumReachedAllowedForCurrentChoice(HashMap<String, Integer> choicesPicked, int maxAmount, String option) {
        if (choicesPicked.get(option) != null && choicesPicked.get(option) == maxAmount) {
            return true;
        }
        return false;
    }
}
