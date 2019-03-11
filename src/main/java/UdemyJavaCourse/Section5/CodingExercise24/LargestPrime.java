package UdemyJavaCourse.Section5.CodingExercise24;

public class LargestPrime {

    public static int getLargestPrime(int number) {
        int largestPrime = 0;
        int valueForLoop = number;
        if (number<=1){
            return -1;
        }
            for (int i = valueForLoop-1; i>1; i--){
                if (number%i==0 && isPrime(i)){
                    largestPrime = i;
                    break;
                }
            }
        return largestPrime;
    }

    private static boolean isPrime(int number) {
        boolean isNumberAPrimeNumber = false;
        if (number==2 || number== 1){
            isNumberAPrimeNumber = true;
        }else{
            for (int i = number-1; i>1; i--){
                if (number%i==0){
                    isNumberAPrimeNumber = false;
                    break;
                }else {
                    isNumberAPrimeNumber = true;
                }
            }
        }

        return isNumberAPrimeNumber;
    }

    public static void main(String[] args) {
        System.out.println(getLargestPrime(16));
        System.out.println(getLargestPrime(21));
        System.out.println(getLargestPrime(217));
        System.out.println(getLargestPrime(0));
        System.out.println(getLargestPrime(45));

        System.out.println(isPrime(7));
        System.out.println(isPrime(36));
        System.out.println(isPrime(8));
        System.out.println(isPrime(31));
    }
}
