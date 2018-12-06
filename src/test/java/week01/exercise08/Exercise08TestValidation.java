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
}