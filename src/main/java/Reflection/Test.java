package Reflection;

import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

public class Test {

    public static void main(String[] args) {
        Reflection reflection = new Reflection();

        try {
            Method privateMethod = reflection.getClass().getDeclaredMethod("privateMethodPrintingPrivateFields");
            privateMethod.setAccessible(true);
            privateMethod.invoke(reflection);
        } catch (NoSuchMethodException | IllegalAccessException | InvocationTargetException e) {
            e.printStackTrace();
        }

        try {
            Field privateNameField = reflection.getClass().getDeclaredField("privateName");
            privateNameField.setAccessible(true);
            privateNameField.set(reflection, "Dan");

            Field privateAgeField = reflection.getClass().getDeclaredField("privateAge");
            privateAgeField.setAccessible(true);
            privateAgeField.set(reflection, 34);

            Method privateMethod = reflection.getClass().getDeclaredMethod("privateMethodPrintingPrivateFields");
            privateMethod.setAccessible(true);
            privateMethod.invoke(reflection);
        } catch (NoSuchFieldException | IllegalAccessException | NoSuchMethodException | InvocationTargetException e) {
            e.printStackTrace();
        }
    }
}
