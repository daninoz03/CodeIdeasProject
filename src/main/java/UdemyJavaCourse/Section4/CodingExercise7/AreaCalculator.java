package UdemyJavaCourse.Section4.CodingExercise7;

public class AreaCalculator {

    private static final double PI = 3.14159;
    public static double area (double radius) {
        if (radius < 0 ){
            return -1.0d;
        }
        return radius * radius * PI;

    }

    public static double area (double x, double y) {

        if (x < 0 || y < 0){
            return -1.0d;
        }
        return x * y;
    }

    public static void main(String[] args) {

    }
}
