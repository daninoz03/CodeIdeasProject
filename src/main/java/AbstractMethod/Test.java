package AbstractMethod;

public class Test {

    public double calcFeetAndInchesToCentimetres(double feet, int inches) {
        if (feet < 0) {
            System.out.println("The amount for feet needs to be positive");
            return -1;
        } else if (inches < 0 || inches > 11) {
            System.out.println("The amount of inches needs to be between 0 and 12");
            return -1;
        } else {
            return ((feet * 12) + inches) * 2.54;
        }
    }

    public double calcFeetAndInchesToCentimetres(int inches) {
        if (inches < 0) {
            System.out.println("Inches needs to be positive");
            return -1;
        } else {
            double numberOfFeet = inches / 12;
            return calcFeetAndInchesToCentimetres(numberOfFeet, inches % 12);
        }
    }

    public static void main(String[] args) {
        Test test = new Test();
        System.out.println(test.calcFeetAndInchesToCentimetres(6, 2));
        System.out.println(test.calcFeetAndInchesToCentimetres(157));

        char character = 'A';

        switch (character) {
            case 'A':
                System.out.println("Character is A");
                break;
            case 'B':
                System.out.println("Character is B");
                break;
            case 'C':
                System.out.println("Character is C");
                break;
            case 'D':
                System.out.println("Character is D");
                break;
            case 'E':
                System.out.println("Character is E");
                break;
            default:
                System.out.println("Character was neither A, B, C, D, or E");
                break;


        }
    }
}
