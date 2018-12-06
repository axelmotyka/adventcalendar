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


    public String run(String text) {

        //remove whitespaces
        text = text.replaceAll("\\s", "");

        char[] charArray = text.toCharArray();
        charArray = quickSort(charArray, 0, charArray.length - 1);

        return new String(charArray);
    }

    private char[] quickSort(char[] charArray, int left, int right) {
        printCharArray("START\t", charArray);

        int i = left;
        int j = right;
        // calculate pivot character, I assume its the middle
        int pivot = charArray[left + (right - left) / 2];
        char tmp;
        while (i <= j) {
            /**
             * In each iteration, we will identify a number from left side which
             * is greater then the pivot value, and also we will identify a number
             * from right side which is less then the pivot value. Once the search
             * is done, then we exchange both numbers.
             */
            while (charArray[i] < pivot) {
                i++;
            };
            while(charArray[j] > pivot) {
                j--;
            }
            // now swap 'em
            if(i <= j) {
                // Don't swap if we found the same index
                if(i != j) {
                    tmp = charArray[i];
                    charArray[i] = charArray[j];
                    charArray[j] = tmp;
                    printCharArray("\tSWAP\t", charArray);
                }
                i++;
                j--;
            }
        }
        printCharArray("END\t\t", charArray);
        if (left < j)
            charArray = quickSort(charArray, left, j);
        if (i < right)
            charArray = quickSort(charArray, i, right);

        return charArray;
    }

    private void printCharArray(String message, char[] charArray) {
        StringBuilder builder = new StringBuilder();
        if (charArray != null) {
            builder.append(message + " " + String.valueOf(charArray));
        }
        System.out.println(builder);
    }
}
