package CodeExercisesWebsite.Moderate;

import java.util.ArrayList;

/**
 * All exercises were taken from https://code-exercises.com/programming/
 */
public class FibonacciNumber {

    public Integer fibonacci(Integer n) {
        ArrayList<Integer> fibonacciList = new ArrayList<>();
        fibonacciList.add(0);
        fibonacciList.add(1);

        for (int i = 2; i <= n; i++) {
            fibonacciList.add(fibonacciList.get(i - 2) + fibonacciList.get(i - 1));
        }
        return fibonacciList.get(n);
    }
}
