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
    private static final Logger log = Logger.getLogger(Exercise09.class.getName());

    public String run(String text) {
        log.info(String.format("Run(\"%s\")", text));

        text = text.replaceAll("[^A-Za-z0-9]", "");
        char charArray [] = text.toCharArray();
        quickSort(charArray,0, charArray.length-1);
        return String.valueOf(charArray);
    }

    // Lösung ab hier im Wesentlichen kopiert von https://www.baeldung.com/java-quicksort
    // Hab's zwar kapiert, kann es aber nicht freihändig programmieren

    private char [] quickSort(char charArray [], int begin, int end) {
        if (begin < end) {
            int partitionIndex = partition(charArray, begin, end);
            quickSort(charArray, begin, partitionIndex-1);
            quickSort(charArray, partitionIndex+1, end);
            }
        return charArray;
        }

    private int partition(char charArray [], int begin, int end) {
        int pivot = charArray[end];
        int i = (begin-1);
        for (int j = begin; j < end; j++) {
            if (charArray[j] <= pivot) {
                i++;

                char swapTemp = charArray[i];
                charArray[i] = charArray[j];
                charArray[j] = swapTemp;
            }
        }
        char swapTemp = charArray[i+1];
        charArray[i+1] = charArray[end];
        charArray[end] = swapTemp;
        return i+1;
    }
}
