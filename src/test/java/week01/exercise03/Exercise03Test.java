package week01.exercise03;

import static org.junit.Assert.*;

import org.junit.Test;

public class Exercise03Test {

    @Test
    public void runMethodTest126() {
        Exercise03 tester = new Exercise03();

        assertEquals("Not correctly converted!", "2:6", tester.run("126"));
    }

    @Test
    public void runMethodTest45() {
        Exercise03 tester = new Exercise03();

        assertEquals("Not correctly converted!", "0:45", tester.run("45"));

    }

    @Test
    public void runMethodTest0() {
        Exercise03 tester = new Exercise03();

        assertEquals("Not correctly converted!", "0", tester.run("0"));
    }

    @Test
    public void runMethodTest60() {
        Exercise03 tester = new Exercise03();

        assertEquals("Not correctly converted!", "1:0", tester.run("60"));
    }

    @Test
    public void runMethodTest63() {
        Exercise03 tester = new Exercise03();

        assertEquals("Not correctly converted!", "1:3", tester.run("63"));
    }
}
