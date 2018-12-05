package week01.exercise01;

import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;

public class Exercise01Test {

    @Test
    public void runIsReturningHelloDevAcademy() {
        Exercise01 exercise01 = new Exercise01();

        String expected = "HelloDevAcademy";
        String actual = exercise01.run();

        assertEquals(expected, actual);
    }
}