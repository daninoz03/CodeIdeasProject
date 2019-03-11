package StaticMethodsInInterface.Attempt2;

public interface Interface1 {

    default void print(){
        System.out.println("We are in interface1");
    }
}
