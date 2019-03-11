package DefaultAndStaticInterfaceMethods.StaticInterfaceMethod;

/**
 * The idea behind static interface methods is to provide a simple mechanism that allows us to increase the degree
 * of cohesion of a design by putting together related methods in one single place without having to create an object.
 */
public interface Vehicle {
    static int getHorsepower(int rpm, int torque){
        return (rpm * torque) / 5252;
    }
}
