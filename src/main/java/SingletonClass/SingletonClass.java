package SingletonClass;

/**
 * Variables defined in the single class will change across other instances of the same class
 */

public class SingletonClass {

    public static SingletonClass singleInstance = null;
    public String speech;
    private SingletonClass() {
        speech = "Hello there. I see you!";
    }


    public static SingletonClass getInstance() {
        if (singleInstance == null) {
            singleInstance = new SingletonClass();
        }
        return singleInstance;
    }
}
