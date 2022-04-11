package KrisKindle;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Random;
import java.util.Set;

public class KrisKindle {

    String[] names = {"Dan", "Dad", "Mam", "Becky", "Lorna", "Lucie"};

    private void calculateAndPrintKrisKindle() {
        int namesLength = names.length;
        HashMap<String, String> krisKindleList = new HashMap<>();
        Set<String> alreadyChosenNames = new HashSet<>();
        Random rn = new Random();
        int randomNumber;
        for (int i = 0; i < names.length; i++) {
            randomNumber = rn.nextInt(namesLength);
            while (randomNumber == i || alreadyChosenNames.contains(names[randomNumber])) {
                randomNumber = rn.nextInt(namesLength);
            }
            krisKindleList.put(names[i], names[randomNumber]);
            alreadyChosenNames.add(names[randomNumber]);
        }
        System.out.println(krisKindleList);
    }

    public static void main(String[] args) {
        KrisKindle krisKindle = new KrisKindle();
        krisKindle.calculateAndPrintKrisKindle();
    }
}
