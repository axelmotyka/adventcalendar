package week01.exercise06;

import org.junit.Test;

import static org.junit.Assert.*;

public class Exercise06Test {

    @Test
    public void runMethodTest5times5() {
        Exercise06 tester = new Exercise06();

        // Matrix x:
        int[][] x = new int[][]{
                { 1, 2, 3, 4, 5 },
                { 5, 4, 3, 2, 1 },
                { 4, 3, 2, 1, 5 },
                { 3, 2, 1, 5, 4 },
                { 2, 1, 5, 4, 3 }
        };

        // Matrix y:
        int[][] y = new int[][]{
                { 6, 7, 8, 9, 10 },
                { 10, 6, 7, 8, 9 },
                { 9, 10, 6, 7, 8 },
                { 8, 9, 10, 6, 7 },
                { 7, 8, 9, 10, 6 }
        };

        // Result, matrix expected:
        int[][] expected = new int[][]{
                { 6, 14, 24, 36, 50 },
                { 50, 24, 21, 16, 9 },
                { 36, 30, 12, 7, 40 },
                { 24, 18, 10, 30, 28 },
                { 14, 8, 45, 40, 18 }
        };

        assertEquals("Wrong length in y-axis!", 5, tester.run(x, y).length);
        for(int i=0; i<expected.length; i++) {
            assertEquals("Wrong length in x-axis!", 5, tester.run(x, y)[i].length);
            assertArrayEquals("Wrong value in y-axis[" + i + "]:", expected[i], tester.run(x, y)[i]);

        }

    }

    @Test
    public void runMethodTest3times3() {
        Exercise06 tester = new Exercise06();

        // Matrix x:
        int[][] x = new int[][]{
                { 7, 2, 3 },
                { 5, 6, 11 },
                { 93, 4, 8 },
        };

        // Matrix y:
        int[][] y = new int[][]{
                { 6, 5, 12 },
                { 13, 6, 7 },
                { 1, 10, 6 },
        };

        // Result, matrix expected:
        int[][] expected = new int[][]{
                { 42, 10, 36 },
                { 65, 36, 77 },
                { 93, 40, 48 },
        };

        assertEquals("Wrong length in y-axis!", 3, tester.run(x, y).length);
        for(int i=0; i<expected.length; i++) {
            assertEquals("Wrong length in x-axis!", 3, tester.run(x, y)[i].length);
            assertArrayEquals("Wrong value in y-axis[" + i + "]:", expected[i], tester.run(x, y)[i]);

        }

    }


}