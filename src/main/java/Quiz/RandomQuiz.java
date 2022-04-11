package Quiz;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Random;
import java.util.Set;

public class RandomQuiz {

    public static void main(String[] args) {


        List<String> forfeits = new ArrayList<>();
        forfeits.add("Shot");
        forfeits.add("Shot");
        forfeits.add("Shot");

        forfeits.add("Heat");
        forfeits.add("Heat");
        forfeits.add("Heat");

        forfeits.add("Something else");
        forfeits.add("Something else");

        forfeits.add("La bogue");


        Random random = new Random();
        int choice;

        Set<Integer> alreadyUsedIndexes = new HashSet<>();


        for (int i = 0; i <= forfeits.size() - 1; i++) {
            choice = random.nextInt(9);

            // First iteration
            if (i == 0) {
                System.out.println(forfeits.get(choice));
                alreadyUsedIndexes.add(choice);
                continue;
            }
            if (choiceIsAvailable(choice, alreadyUsedIndexes)) {
                System.out.println(forfeits.get(choice));
                alreadyUsedIndexes.add(choice);
            } else {
                choice = getNewChoice(alreadyUsedIndexes);
                System.out.println(forfeits.get(choice));
                alreadyUsedIndexes.add(choice);
            }
        }
    }

    private static boolean choiceIsAvailable(int choice, Set<Integer> alreadyUsedIndexes) {
        return !alreadyUsedIndexes.contains(choice);
    }

    private static int getNewChoice(Set<Integer> alreadyUsedIndexes) {
        Random random = new Random();
        int choice = random.nextInt(9);
        if (choiceIsAvailable(choice, alreadyUsedIndexes)) {
            return choice;
        } else {
            return getNewChoice(alreadyUsedIndexes);
        }
    }
}
