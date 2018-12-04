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

        if(x.length == 0 || y.length == 0 || x[0].length == 0 || y[0].length == 0)
            return null;

        int xAxisLen = x[0].length;
        int yAxisLen = x.length;

        int[][] result = new int[yAxisLen][xAxisLen];

        for(int yIndex = 0; yIndex < yAxisLen; yIndex++) {
            for(int xIndex = 0; xIndex < xAxisLen; xIndex++) {
                result[yIndex][xIndex] = x[yIndex][xIndex] * y[yIndex][xIndex];
            }
        }

        return result;
    }
}
