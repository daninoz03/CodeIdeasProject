package UdemyJavaCourse.Section11.PackagesChallenge;

import java.util.ArrayList;

public class Series {

    public static int nSum(int n) {
        int returnValue = 0;
        for (int i = 0; i<=n; i++){
            returnValue = returnValue + i;
        }
        return returnValue;
    }

    public static int factorial(int n) {
        int returnValue = n;
        if (n ==0) {
            return 1;
        }
        for (int i=n-1; i>0; i--) {
            returnValue = returnValue * i;
        }
        return returnValue;
    }

    public static int fibonacci(int n) {
        ArrayList<Integer> fibonacciSequence = new ArrayList<>();
        fibonacciSequence.add(0);
        fibonacciSequence.add(1);

        for (int i=2; i<=n;i++) {
            fibonacciSequence.add(fibonacciSequence.get(i-1) + fibonacciSequence.get(i-2));
        }

        return fibonacciSequence.get(n);
    }

    public static void main(String[] args) {

        System.out.println(nSum(9));
        System.out.println(factorial(9));
        System.out.println(fibonacci(9));
    }
}
