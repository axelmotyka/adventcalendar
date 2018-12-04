package week01.exercise06;

import org.junit.Test;

import static org.junit.Assert.*;
import static org.junit.Assert.assertArrayEquals;

public class Exercise06Test {

    @Test
    public void emptyOuterArraysTest() {
        Exercise06 tester = new Exercise06();
        int[][] x = new int[][]{};
        int[][] y = new int[][]{};

        assertNull(tester.run(x, y));
    }

    @Test
    public void emptyInnerArraysTest() {
        Exercise06 tester = new Exercise06();
        int[][] x = new int[][]{{}};
        int[][] y = new int[][]{{}};

        assertNull(tester.run(x, y));
    }

    @Test
    public void oneLineTest() {
        Exercise06 tester = new Exercise06();
        int[][] x = new int[][]{
                {0, 1}
        };
        int[][] y = new int[][]{
                {2, 3}
        };

        int[][] expected = new int[][]{
                {0, 3}
        };
        assertArrayEquals(expected, tester.run(x, y));
    }

    @Test
    public void smallArrayTest() {
        Exercise06 tester = new Exercise06();
        int[][] x = new int[][]{
                {0, 1},
                {2, 3}
        };
        int[][] y = new int[][]{
                {4, 5},
                {6, 7}
        };

        int[][] expected = new int[][]{
                {0, 5},
                {12, 21}
        };
        assertArrayEquals(expected, tester.run(x, y));
    }

    @Test
    public void runMethodTest() {
        Exercise06 tester = new Exercise06();

        int[][] x = new int[][]{
                { 1, 2, 3, 4, 5 },
                { 5, 4, 3, 2, 1 },
                { 4, 3, 2, 1, 5 },
                { 3, 2, 1, 5, 4 },
                { 2, 1, 5, 4, 3 }
        };

        int[][] y = new int[][]{
                { 6, 7, 8, 9, 10 },
                { 10, 6, 7, 8, 9 },
                { 9, 10, 6, 7, 8 },
                { 8, 9, 10, 6, 7 },
                { 7, 8, 9, 10, 6 }
        };

        int[][] expected = new int[][]{
                { 6, 14, 24, 36, 50 },
                { 50, 24, 21, 16, 9 },
                { 36, 30, 12, 7, 40 },
                { 24, 18, 10, 30, 28 },
                { 14, 8, 45, 40, 18 }
        };

        int[][] result = tester.run(x, y);

        assertEquals("Wrong length in y-axis!", 5, result.length);
        for(int i=0; i<expected.length; i++) {
            assertEquals("Wrong length in x-axis!", 5, result[i].length);
            assertArrayEquals("Wrong value in y-axis[" + i + "]:", expected[i], result[i]);
        }

    }

}