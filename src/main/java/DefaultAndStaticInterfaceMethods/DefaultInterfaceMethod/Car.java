package DefaultAndStaticInterfaceMethods.DefaultInterfaceMethod;

/**
 * To solve the inheritance problem of a class implementing multiple
 * interfaces where the same method is inherited the 'default' method is used (to avoid the diamond probkem)
 */
public class Car implements Vehicle, Alarm {
    @Override
    public String getBrand() {
        return null;
    }

    @Override
    public String speedUp() {
        return null;
    }

    @Override
    public String slowDown() {
        return null;
    }

    @Override
    public String turnAlarmOn() {
        return Alarm.super.turnAlarmOn();
    }

    @Override
    public String turnAlarmOff() {
        return Alarm.super.turnAlarmOff();
    }

    public static void main(String[] args) {
        Car car = new Car();
        System.out.println(car.turnAlarmOn());
        System.out.println(car.turnAlarmOff());
    }
}
