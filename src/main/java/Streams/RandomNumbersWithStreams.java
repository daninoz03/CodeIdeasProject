package Streams;

import java.util.List;
import java.util.Random;
import java.util.stream.Collectors;

public class RandomNumbersWithStreams {

    public List<Double> generateRandomDoubleList(int lowerBound, int upperBound, int limit) {
        return new Random().doubles(lowerBound,upperBound)
                .limit(limit)
                .boxed()
                .collect(Collectors.toList());
    }

    public List<Integer> generateRandomIntegerList(int lowerBound, int upperBound, int limit) {
        return new Random().ints(lowerBound,upperBound)
                .limit(limit)
                .boxed()
                .collect(Collectors.toList());
    }


    public static void main(String[] args) {


    }
}
