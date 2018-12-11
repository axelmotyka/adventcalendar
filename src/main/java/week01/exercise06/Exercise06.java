package week01.exercise06;

import java.util.logging.Logger;

/**
 * Multiply matrixes
 * <p>
 * Multiply two matrixes as 2-dimensional-array and save the result in an additional 2-dimensional-array.
 * Additionally you must implement the unit test!
 */
public class Exercise06 {

    private static final Logger log = Logger.getLogger(Exercise06.class.getName());

    public int[][] run(int[][] x, int[][] y) {

        log.info("Run()");

        int[][] result = new int[x.length][y.length];

        for (int xPos = 0; xPos < x.length; xPos++) { //Schleife in Schleife um die einzelnen Pos. miteiander beechnen zu können
            System.out.print(xPos);
            for (int yPos = 0; yPos < y.length; yPos++) {
                System.out.println(yPos);
                result[xPos][yPos] = x[xPos][yPos] * y[xPos][yPos];
            }
        }
        return result;
    }
}