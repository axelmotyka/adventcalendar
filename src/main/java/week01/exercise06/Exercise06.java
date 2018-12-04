package week01.exercise06;

import java.util.logging.Logger;

/**
 * Multiply matrixes
 *
 * Multiply two matrixes as 2-dimensional-array and save the result in an additional 2-dimensional-array.
 * Additionally you must implement the unit test!
 */
public class Exercise06 {

    private static final Logger log = Logger.getLogger( Exercise06.class.getName() );

    public int[][] run(int[][] x, int[][] y) {
        log.info("Run()");

        int xRows = x.length;
        int xCols = x[0].length;
        int[][] result = new int[xRows][xCols];

        if (y.length != xRows || y[0].length != xCols)
            throw new IllegalArgumentException("Matrix sizes do not match");

        for (int row = 0; row < xRows; row++) {

            if (y[row].length != x[row].length)
                throw new IllegalArgumentException("Matrix sizes do not match");

            for (int col = 0; col < xCols; col++) {
                result[row][col] = x[row][col] * y[row][col];
            }
        }

        return result;
    }
}
