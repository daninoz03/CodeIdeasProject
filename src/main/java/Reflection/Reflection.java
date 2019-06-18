package Reflection;

/**
 * Reflection is the ability to access private methods and fields
 */
public class Reflection {

    private int privateAge = 30;
    private String privateName = "Tom";

    private void privateMethodPrintingPrivateFields() {
        System.out.println("Private age is " + privateAge + " and private name is " + privateName);
    }
}
