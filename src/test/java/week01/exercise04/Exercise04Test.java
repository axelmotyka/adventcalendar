package week01.exercise04;

import org.junit.Test;

import static org.junit.Assert.*;

public class Exercise04Test {

    @Test
    public void runMethodTest01() {
        Exercise04 tester = new Exercise04();

        String text = "long& longer!!! thelongest";

        assertEquals("Wrong result!", "thelongest", tester.run(text));
    }

    @Test
    public void runMethodTest02() {
        Exercise04 tester = new Exercise04();

        String text = "Hey! Oh! Lets go DevAcademy!!!!!";

        assertEquals("Wrong result!", "DevAcademy", tester.run(text));
    }

    @Test
    public void runMethodTest03() {
        Exercise04 tester = new Exercise04();

        String text = "Jimmy is crazy for pizza!";

        assertEquals("Wrong result!", "Jimmy", tester.run(text));
    }

}