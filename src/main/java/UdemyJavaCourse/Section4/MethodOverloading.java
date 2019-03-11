package UdemyJavaCourse.Section4;

public class MethodOverloading {

    public double calcFeetAndInchesToCentimeters(double feet, double inches) {

        if ((feet<0) || (inches <0 || inches >12)){
            return -1;
        }
        return (feet*12*2.54)+ (inches*2.54);
    }

    public double calcFeetAndInchesToCentimeters(double feet) {
        if ((feet<0)){
            return -1;
        }
        double newFeet = Math.floor(feet);
        double inches = ((feet - newFeet))*12;
        return calcFeetAndInchesToCentimeters(newFeet, inches);
    }

    public static void main(String[] args) {
        MethodOverloading methodOverloading = new MethodOverloading();
        System.out.println(methodOverloading.calcFeetAndInchesToCentimeters(6.0));
    }
}
