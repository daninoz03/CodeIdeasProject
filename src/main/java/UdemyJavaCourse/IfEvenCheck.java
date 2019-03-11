package UdemyJavaCourse;

public class IfEvenCheck {

    public boolean isEvenNumber(int number) {
        if (number % 2 == 0) {
            return true;
        }else{
            return false;
        }
    }

    public static void main(String[] args) {
        IfEvenCheck ifEvenCheck = new IfEvenCheck();
        System.out.println("");
        ifEvenCheck.isEvenNumber(10);
        ifEvenCheck.isEvenNumber(11);
        int startNumber = 4;
        int endNumber = 20;


        while (startNumber <= endNumber) {
            ifEvenCheck.isEvenNumber(startNumber);
            if (ifEvenCheck.isEvenNumber(startNumber)){
                System.out.println(startNumber+" is even");
            }else if (!ifEvenCheck.isEvenNumber(startNumber)){
                continue;
            }
            startNumber++;

        }
    }
}
