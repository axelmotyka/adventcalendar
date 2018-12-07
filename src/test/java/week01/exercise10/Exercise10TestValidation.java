package week01.exercise10;

import org.junit.Test;

import static org.junit.Assert.*;

public class Exercise10TestValidation {

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
    public void calculateTest021() {
        Exercise10 tester = new Exercise10();

        String calculate = "30 + 10 * 20";

        assertEquals("Wrong result!", 230, tester.run(calculate));
    }

    @Test
    public void calculateTest022() {
        Exercise10 tester = new Exercise10();

        String calculate = "30 + 10 * 20 + 20";

        assertEquals("Wrong result!", 250, tester.run(calculate));
    }

    @Test
    public void parenthesis01() {
        Exercise10 tester = new Exercise10();

        String calculate = "10 * (20 + 30)";

        assertEquals("Wrong result!", 500, tester.run(calculate));
    }

    @Test
    public void parenthesis03() {
        Exercise10 tester = new Exercise10();

        String calculate = "(10 * (20 + 30))";

        assertEquals("Wrong result!", 500, tester.run(calculate));
    }

    @Test
    public void parenthesis04() {
        Exercise10 tester = new Exercise10();

        String calculate = "(10 * (20 + 30)) / 2";

        assertEquals("Wrong result!", 250, tester.run(calculate));
    }
}