package UdemyJavaCourse.Section5ControlFlowStatements;

public class SumOdd {

    private boolean isOdd(int number) {

        if (number < 0) {
            return false;
        } else if (number % 2 != 0){
            return true;
        }else {
            return false;
        }

    }

    public int sumOdd(int start, int end) {

        int sum = 0;
        if (end >= start && start > 0 && end > 0) {
            for (int i = start; i <= end; i++) {

                if (isOdd(i)) {
                    sum = sum + i;
                }
            }
            return sum;
        } else {
            return -1;
        }

    }

    public static void main(String[] args) {
        SumOdd sumOdd = new SumOdd();
        System.out.println(sumOdd.sumOdd(1, 100));
        System.out.println(sumOdd.sumOdd(-1, 100));
        System.out.println(sumOdd.sumOdd(100, 100));
        System.out.println(sumOdd.sumOdd(100, -100));
        System.out.println(sumOdd.sumOdd(100, 1000));


    }

}
