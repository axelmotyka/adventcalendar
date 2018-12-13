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

        int[][] result = new int[x.length][x[0].length]; // x.length (Anzahl Reihen in Matrix) soll die Anzahl Reihen der neuen Liste sein.
        //x[0].length (Anzahl der Spalten in der ersten Reihe) soll die Anzahl der Spalten sein.

        for (int i = 0; i < x.length; i++) {
            for (int j = 0; j < x.length; j++) {
                result[i][j] = x[i][j] * y[i][j];
            }
        }
        return result;
    }
}