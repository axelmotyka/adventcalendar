package week01.exercise08;

import org.junit.Test;

import static org.junit.Assert.*;

public class Exercise08Test {

    @Test
    public void run() {
        Exercise08 tester = new Exercise08();
        int[] actual = new int[] {400, 33, 200, 66, 100, 99, 300};
        int[] expected = new int[] {33, 66, 99, 100, 200, 300, 400};

        assertArrayEquals("Wrong sorting!", expected, tester.run(actual));
    }

    @Test
    public void runtwo() {
        Exercise08 tester = new Exercise08();
        int[] actual = new int[] {400, 33, 900, 700, 2000,  200, 66, 100, 99, 300,700,900};
        int[] expected = new int[] {33, 66, 99, 100, 200, 300, 400, 700, 700, 900,900,2000};

        assertArrayEquals("Wrong sorting!", expected, tester.run(actual));
    }

    @Test
    public void runthree() {
        Exercise08 tester = new Exercise08();
        int[] actual = new int[] {400, 33, 900, 700, -2000,  200, 66, 100, 99, 300,700,900};
        int[] expected = new int[] {-2000, 33, 66, 99, 100, 200, 300, 400, 700, 700, 900,900};

        assertArrayEquals("Wrong sorting!", expected, tester.run(actual));
    }
}