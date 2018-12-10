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
    public void run1() {
        Exercise08 tester = new Exercise08();
        int[] actual = new int[] {12, 9, 6, 18, 9, 9, 3, 15, 21, 9};
        int[] expected = new int[] {3, 6, 9, 9, 9, 9, 12, 15, 18, 21};

        assertArrayEquals("Wrong sorting!", expected, tester.run(actual));
    }
}