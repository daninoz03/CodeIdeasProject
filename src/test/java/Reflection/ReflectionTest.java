package Reflection;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

import static org.junit.Assert.assertEquals;

public class ReflectionTest {

    private final ByteArrayOutputStream outContent = new ByteArrayOutputStream();
    private final ByteArrayOutputStream errContent = new ByteArrayOutputStream();
    private final PrintStream originalOut = System.out;
    private final PrintStream originalErr = System.err;

    @Before
    public void setUpStreams() {
        System.setOut(new PrintStream(outContent));
        System.setErr(new PrintStream(errContent));
    }

    @After
    public void restoreStreams() {
        System.setOut(originalOut);
        System.setErr(originalErr);
    }

    @Test
    public void shouldAccessPrivateMethod() {
        // given
        Reflection reflection = new Reflection();

        // when
        try {
            Method privateMethod = reflection.getClass().getDeclaredMethod("privateMethodPrintingPrivateFields");
            privateMethod.setAccessible(true);
            privateMethod.invoke(reflection);
        } catch (NoSuchMethodException | IllegalAccessException | InvocationTargetException e) {
            e.printStackTrace();
        }

        // then
        assertEquals("Private age is 30 and private name is Tom\n", outContent.toString());
    }

    @Test
    public void shouldAccessPrivateFields() {
        // given
        Reflection reflection = new Reflection();

        // when
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

        // then
        assertEquals("Private age is 34 and private name is Dan\n", outContent.toString());
    }
}
