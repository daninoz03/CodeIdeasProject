package DefaultAndStaticInterfaceMethods.DefaultInterfaceMethod;

public interface Alarm {

    default String turnAlarmOn(){
        return "Turning the vehicle alarm on!";
    }

    default String turnAlarmOff(){
        return "Turing the vehicle alarm off!";
    }

}
