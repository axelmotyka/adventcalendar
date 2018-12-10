package week01.exercise09;

import java.util.Arrays; 
import java.util.logging.Logger;

/**
 * Quicksort
 * Take the _str_ string parameter being passed and return the string with the letters in 
 * alphabetical order (ie. `hello` becomes `ehllo`). Spaces, numbers and punctuation symbols 
 * will not be included in the sorted string. 
 * Implement your own QuickSort.
 */
public class Exercise09 {
    private static final Logger log = Logger.getLogger( Exercise09.class.getName() );

    public String run(String text) {
        log.info(String.format("Run(\"%s\")", text));

        public char[] charArray = {};
        for (int i=0; i<text.length(); i++)
            charArray[i] = text.charAt(i);

        return QuickSort(charArray).toString();
    }

    char[] QuickSort(char[] charArray) {
        int L = 0;
        int R = charArray.length - 1;


        while (true) {
            char trenner = charArray[R];
            if (charArray[L] > charArray[R--]) charArray = swapLR(charArray,L,R);

        }

        return charArray;
    }

    char[] swapLR(char[] chain, int L, int R) {
        char temp;
        temp = chain[R];
        chain[R] = chain[L];
        chain[L] = temp;
        return chain;
    }
}
