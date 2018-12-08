package week01.exercise10;

import org.junit.Test;

import static org.junit.Assert.*;

public class Exercise10Test {

    @Test
    public void calculateTest01() {
        Exercise10 tester = new Exercise10();

        String calculate = "1+1";

        assertEquals("Wrong result!", 2, tester.run(calculate));
    }

    @Test
    public void calculateTest02() {
        Exercise10 tester = new Exercise10();

        String calculate = "10 * 20 + 30";

        assertEquals("Wrong result!", 230, tester.run(calculate));
    }

    @Test
    public void calculateTest03() {
        Exercise10 tester = new Exercise10();

        String calculate = "10 * (20 + 30)";

        assertEquals("Wrong result!", 500, tester.run(calculate));
    }

    @Test
    public void calculateTest04() {
        Exercise10 tester = new Exercise10();

        String calculate = "(10 * 19) * (20 + 30)";

        assertEquals("Wrong result!", 9500, tester.run(calculate));
    }

    @Test
    public void calculateTest06() {
        Exercise10 tester = new Exercise10();

        String calculate = "(10*19)*666";

        assertEquals("Wrong result!", 126540, tester.run(calculate));
    }


    @Test
    public void calculateTest07() {
        Exercise10 tester = new Exercise10();

        String calculate = "10*19*666";

        assertEquals("Wrong result!", 126540, tester.run(calculate));
    }


    @Test
    public void calculateTest08() {
        Exercise10 tester = new Exercise10();

        String calculate = "10*19+55*3";

        assertEquals("Wrong result!", 355, tester.run(calculate));
    }
}