package de.tub.annotationsdemo;

import org.junit.jupiter.api.Test;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.PrintStream;
import java.lang.reflect.Method;

import static org.junit.jupiter.api.Assertions.*;

class RunnerTest {

    @Test
    void invokeAllAnnotated()throws  Exception {
        Method greet=Service.class.getDeclaredMethod("greet", String.class);

        assertTrue(greet.isAnnotationPresent(LogCall.class));
        assertEquals("greeting sent", greet.getAnnotation(LogCall.class).value());
    }
    @Test
    void farewellIsAnnotated()throws Exception{
        Method farewell=Service.class.getDeclaredMethod("farewell", String.class);
        assertFalse(farewell.isAnnotationPresent(LogCall.class));

    }
    @Test
    void invokeAllAnnotatedPrintsExpectedOutput() throws Exception{
        PrintStream originalOut=System.out;
        ByteArrayOutputStream captured=new ByteArrayOutputStream();
        System.setOut(new PrintStream(captured));
        Runner.invokeAllAnnotated(new Service());
        System.setOut(originalOut);
        String expected="[greeting sent] greet"+ System.lineSeparator()+ "Hello, Ana"+ System.lineSeparator();
        assertEquals(expected, captured.toString());
    }

}