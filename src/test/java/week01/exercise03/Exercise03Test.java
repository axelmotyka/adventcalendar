package week01.exercise03;

import static org.junit.Assert.*;

import org.junit.Test;

public class Exercise03Test {

    @Test
    public void runMethodTest1() {
        Exercise03 tester = new Exercise03();

        assertEquals("Not correctly converted!", "1:3", tester.run("63"));
    }

    @Test
    public void runMethodTest2() {
        Exercise03 tester = new Exercise03();

        assertEquals("Not correctly converted!", "0:45", tester.run("45"));

    }

    @Test
    public void runMethodTest3() {
        Exercise03 tester = new Exercise03();

        assertEquals("Not correctly converted!", "0", tester.run("0"));
    }

    @Test
    public void runMethodTest4() {
        Exercise03 tester = new Exercise03();

        assertEquals("Not correctly converted!", "1", tester.run("60"));
    }


}
