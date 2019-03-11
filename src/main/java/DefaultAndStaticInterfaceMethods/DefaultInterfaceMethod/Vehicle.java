package DefaultAndStaticInterfaceMethods.DefaultInterfaceMethod;

public interface Vehicle {

    String getBrand();

    String speedUp();

    String slowDown();

    String turnAlarmOn();

    String turnAlarmOff();

    /*default String turnAlarmOn(){
        return "Turning the vehicle alarm on!";
    }

    default String turnAlarmOff(){
        return "Turing the vehicle alarm off!";
    }*/
}
