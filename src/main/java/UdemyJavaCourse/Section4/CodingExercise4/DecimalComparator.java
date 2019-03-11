package UdemyJavaCourse.Section4.CodingExercise4;

public class DecimalComparator {

    public static boolean areEqualByThreeDecimalPlaces(double val1, double val2) {
        if (val1 < 0){
            val1 = val1 * -1;
        } else if (val2 < 0) {
            val2 = val2 * -1;
        }
        val1 = Math.floor(val1 * 1000) / 1000;
        val2 = Math.floor(val2 * 1000) / 1000;

        return val1==val2;
    }

    public static boolean quicky(double val1, double val2){
        if (val1 < 0){
            val1 = val1 * -1;
        } else if (val2 < 0) {
            val2 = val2 * -1;
        }
        val1 = Math.floor(val1 * 1000) / 1000;
        val2 = Math.floor(val2 * 1000) / 1000;

        return val1==val2;

    }

    public static void main(String[] args) {

        boolean check1 = areEqualByThreeDecimalPlaces(1.2345, 1.2345);
        boolean check2 = areEqualByThreeDecimalPlaces(11.2345, 1.2345);
        boolean check3 = areEqualByThreeDecimalPlaces(12345, 2345);
        boolean check4 = areEqualByThreeDecimalPlaces(1, 0.2);
        boolean check5 = areEqualByThreeDecimalPlaces(0.8, 0.8);
        boolean check6 = areEqualByThreeDecimalPlaces(3.1756, -3.1757);
        boolean check7 = areEqualByThreeDecimalPlaces(3.1756, 3.175);

        double testMult  = 3.1756*1000;
        double testMultFloor = Math.floor(testMult);
        double testDivide = testMultFloor/1000;

    }
}
