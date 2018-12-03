package week01.exercise06;

import org.junit.Test;

import static org.junit.Assert.*;

public class Exercise06Test {


    // test with 5 dimension array
    @Test
    public void runMethodTest01() {
        Exercise06 tester = new Exercise06();


        int[][] x = new int[][]{
                {1, 2, 3, 4, 5},
                {5, 4, 3, 2, 1},
                {4, 3, 2, 1, 5},
                {3, 2, 1, 5, 4},
                {2, 1, 5, 4, 3}
        };

        int[][] y = new int[][]{
                {6, 7, 8, 9, 10},
                {10, 6, 7, 8, 9},
                {9, 10, 6, 7, 8},
                {8, 9, 10, 6, 7},
                {7, 8, 9, 10, 6}
        };

        int[][] expected = new int[][]{
                {6, 14, 24, 36, 50},
                {50, 24, 21, 16, 9},
                {36, 30, 12, 7, 40},
                {24, 18, 10, 30, 28},
                {14, 8, 45, 40, 18}
        };





        int[][] result = tester.run(x, y);

        assertEquals("Wrong length in y-axis!", 5, result.length);
        for (int i = 0; i < expected.length; i++) {
            assertEquals("Wrong length in x-axis!", 5, result[i].length);
            /*System.out.println(expected.length);
            System.out.println(expected[i].length);
            System.out.println(result[i]);*/
            assertArrayEquals("Wrong value in y-axis[" + i + "]:", expected[i], result[i]);
        }


    }

    // test with 6 Dimension array
    @Test
    public void runMethodTest02() {
        Exercise06 tester = new Exercise06();


        int[][] c = new int[][]{
                {1, 2, 3, 4, 5, 1},
                {5, 4, 3, 2, 1, 1},
                {4, 3, 2, 1, 5, 1},
                {3, 2, 1, 5, 4, 1},
                {2, 1, 5, 4, 3, 1},
                {2, 1, 5, 4, 3, 1},
        };

        int[][] d = new int[][]{
                {6, 7, 8, 9, 10, 5},
                {10, 6, 7, 8, 9, 5},
                {9, 10, 6, 7, 8, 10},
                {8, 9, 10, 6, 7, 10},
                {7, 8, 9, 10, 6, 5},
                {7, 8, 9, 10, 6, 5},
        };

        int[][] expectedthree = new int[][]{
                {6, 14, 24, 36, 50, 5},
                {50, 24, 21, 16, 9, 5},
                {36, 30, 12, 7, 40, 10},
                {24, 18, 10, 30, 28, 10},
                {14, 8, 45, 40, 18, 5},
                {14, 8, 45, 40, 18, 5}
        };


        int[][] resultthree = tester.run(c, d);

        assertEquals("Wrong length in y-axis!", 6, resultthree.length);
        for(int i=0; i<expectedthree.length; i++) {
            assertEquals("Wrong length in x-axis!", 6, resultthree[i].length);
            /*System.out.println(expected.length);
            System.out.println(expected[i].length);
            System.out.println(result[i]);*/
            assertArrayEquals("Wrong value in y-axis[" + i + "]:", expectedthree[i], resultthree[i]);
        }

    }


    // test with 3  Dimensions array
    @Test
    public void runMethodTest03() {
        Exercise06 tester = new Exercise06();



        int[][] a = new int[][]{
                {1, 2, 3},
                {5, 4, 3},
                {4, 3, 2}
        };

        int[][] b = new int[][]{
                {6, 7, 8},
                {10, 6, 7},
                {9, 100, 60}
        };

        int[][] expectedtwo = new int[][]{
                {6, 14, 24},
                {50, 24, 21},
                {36, 300, 120}
        };



        int[][] resulttwo = tester.run(a, b);

        assertEquals("Wrong length in y-axis!", 3, resulttwo.length);
        for (int i = 0; i < expectedtwo.length; i++) {
            assertEquals("Wrong length in x-axis!", 3, resulttwo[i].length);
            /*System.out.println(expected.length);
            System.out.println(expected[i].length);
            System.out.println(result[i]);*/
            assertArrayEquals("Wrong value in y-axis[" + i + "]:", expectedtwo[i], resulttwo[i]);
        }


    }
}