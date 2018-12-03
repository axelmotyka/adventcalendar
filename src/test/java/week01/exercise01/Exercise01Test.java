package week01.exercise01;

import static org.junit.Assert.*;

import org.junit.Test;

import week01.exercise01.Exercise01;

public class Exercise01Test {

    @Test
    public void runIsReturningHelloDevAcademy() {
        Exercise01 tester = new Exercise01();

        assertEquals("Run method returns String 'Hello DevAcademy!'", tester.run(), "Hello DevAcademy!");
    }
}
