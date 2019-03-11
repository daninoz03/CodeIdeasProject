package DefaultAndStaticInterfaceMethods.StaticInterfaceMethod;

public class Car {

    private static final int rpm = 5000;
    private static final int torque = 500;

    public static void main(String[] args) {

        int horsePower = Vehicle.getHorsepower(rpm, torque);
        System.out.println(horsePower);
    }
}
