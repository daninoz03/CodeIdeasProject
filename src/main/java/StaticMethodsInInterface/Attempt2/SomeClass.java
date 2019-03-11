package StaticMethodsInInterface.Attempt2;

public class SomeClass implements Interface1, Interface2{
    /*@Override
    public void print() {

        System.out.println("We are in someclass");
    }*/

    public static void main(String[] args) {
        SomeClass someClass = new SomeClass();
        someClass.print();

        Interface2.print();

    }
}
