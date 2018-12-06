package week01.exercise08;

import org.junit.Test;

import static org.junit.Assert.*;

public class Exercise08TestValidation {

    @Test
    public void run() {
        Exercise08 tester = new Exercise08();
        int[] actual = new int[] {400, 33, 200, 66, 100, 99, 300};
        int[] expected = new int[] {33, 66, 99, 100, 200, 300, 400};

        assertArrayEquals("Wrong sorting!", expected, tester.run(actual));
    }

    @Test
    public void runSorted() {
        Exercise08 tester = new Exercise08();
        int[] actual = new int[] {33, 66, 99, 100, 200, 300, 400};
        int[] expected = new int[] {33, 66, 99, 100, 200, 300, 400};

        assertArrayEquals("Wrong sorting!", expected, tester.run(actual));
    }

    @Test
    public void runMirrored() {
        Exercise08 tester = new Exercise08();
        int[] actual = new int[] {400, 300, 200, 100, 99, 66, 33};
        int[] expected = new int[] {33, 66, 99, 100, 200, 300, 400};

        assertArrayEquals("Wrong sorting!", expected, tester.run(actual));
    }

    @Test
    public void runEqualValues() {
        Exercise08 tester = new Exercise08();
        int[] actual = new int[] {1, 1, 1, 1, 1, 1, 1};
        int[] expected = new int[] {1, 1, 1, 1, 1, 1, 1};

        assertArrayEquals("Wrong sorting!", expected, tester.run(actual));
    }

    @Test
    public void runDifferentValues() {
        Exercise08 tester = new Exercise08();
        int[] actual = new int[] {1, 3, 2, 7, 5, 4, 6};
        int[] expected = new int[] {1, 2, 3, 4, 5, 6, 7};

        assertArrayEquals("Wrong sorting!", expected, tester.run(actual));
    }

}