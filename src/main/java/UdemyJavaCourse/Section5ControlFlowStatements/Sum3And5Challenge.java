package UdemyJavaCourse.Section5ControlFlowStatements;

public class Sum3And5Challenge {


    public static void main(String[] args) {

        //List<Integer> arrayList = new ArrayList<>();
        int count = 0;
        int sum = 0;
        for (int i = 1; i<=1000; i++) {
            if (i%3 == 0 && i%5 == 0) {

                //arrayList.add(i);
                count++;
                sum += i;
            }
            if (count == 5) {

                break;
            }

        }

        System.out.println("Sum is "+sum);
    }
}
