package CodeExercisesWebsite.Moderate;

import java.util.ArrayList;

/**
 * All exercises were taken from https://code-exercises.com/programming/
 */
public class EvenFibonacciSum {

    public Integer evenFibonacciSum(Integer n) {
        ArrayList<Integer> fibonacciList = new ArrayList<>();
        // It starts on 1 here for some reason
        fibonacciList.add(1);
        fibonacciList.add(2);

        Integer evenSum = 2;

        while (true) {
            fibonacciList.add(fibonacciList.get(fibonacciList.size() - 1) + fibonacciList.get(fibonacciList.size() - 2));
            if (fibonacciList.get(fibonacciList.size() - 1) >= n) {
                break;
            }
            if (fibonacciList.get(fibonacciList.size() - 1) % 2 == 0) {
                evenSum = evenSum + fibonacciList.get(fibonacciList.size() - 1);
            }
        }
        return evenSum;
    }

    public static void main(String[] args) {
        EvenFibonacciSum evenFibonacciSum = new EvenFibonacciSum();

        System.out.println(evenFibonacciSum.evenFibonacciSum(450));
    }
}
