package week01.exercise01;

import static org.junit.Assert.*;

import org.junit.Test;

public class Exercise01Test {

    @Test
    public void runIsReturningHelloDevAcademy() {
        Exercise01 tester = new Exercise01();

        String expected = "HelloDevAcademy";
        String actual = tester.run();

        assertEquals(expected, actual);
    }
}
