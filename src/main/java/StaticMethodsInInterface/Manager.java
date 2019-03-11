package StaticMethodsInInterface;


/**
 * Why have static methods in interface?
 * - It allows keeping utility methods in interfaces (i.e. Collections utility class)
 * - it avoid creating separate class for static methods
 *
 * Note: static methods in interfaces are not related to methods in classes implementing that interface.
 * As such they neither hide nor override the static method defined in the interface
 */
public class Manager implements Interviewer {

    @Override
    public void interview() {
        System.out.println("I am a manager and I am hiring for my team");
    }


    public static void bookRoom(int hours){
        System.out.println("Now we're in the manager class");
    }

    public static void main(String[] args) {

        Interviewer interviewer = new Manager();

        //Not using an instantiated object

        Interviewer.bookRoom(3);

        interviewer.interview();

        TestingStaticMethods testingStaticMethods =  new DerivedTestingStaticMethods();

        testingStaticMethods.printLine();




    }
}
