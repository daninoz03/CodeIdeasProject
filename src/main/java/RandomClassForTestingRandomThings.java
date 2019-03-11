//package main.java;

import java.util.concurrent.ThreadLocalRandom;

public class RandomClassForTestingRandomThings {


    public void testRandomNumbers() {
        for (int i = 0; i<3; i++){
            int max = 100;
            int min = 1;
            int randomLong = min + (int)(Math.random() * ((max - min) + 1));
            int randomNum = ThreadLocalRandom.current().nextInt(min, max + 1);
            System.out.println(randomLong+"\t"+randomNum);
        }
    }


    public static void main(String [] args) {
        RandomClassForTestingRandomThings randomClassForTestingRandomThings = new RandomClassForTestingRandomThings();
        randomClassForTestingRandomThings.testRandomNumbers();
    }
}
