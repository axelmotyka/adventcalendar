package week02.exercise15;

import org.junit.Test;
import week01.exercise05.Exercise05;

import static org.junit.Assert.assertEquals;

public class Exercise15Test {

    @Test
    public void runMethodTest01() {
        Exercise05 tester = new Exercise05();

        String text = "hello";

        assertEquals("Letters are wrong!", "Ifmmp", tester.run(text));
    }

    @Test
    public void runMethodTest02() {
        Exercise05 tester = new Exercise05();

        String text = "fun times!";

        assertEquals("Letters are wrong!", "gvO Ujnft!", tester.run(text));

    }
    @Test
    public void runMethodTest03() {
        Exercise05 tester = new Exercise05();

        String text = "zzz!";

        assertEquals("Letters are wrong!", "AAA!", tester.run(text));

    }
    @Test
    public void runMethodTest04() {
        Exercise05 tester = new Exercise05();

        String text = "ddd!";

        assertEquals("Letters are wrong!", "EEE!", tester.run(text));

    }
}