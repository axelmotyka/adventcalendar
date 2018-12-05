package week01.exercise09;

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
        // Change special characters with null also the spaces with null
        text = text.replaceAll("[^\\w]"," ");
        text = text.replaceAll("[ ]","");

        // Generating an sorted variable
        String charsSorted;

        // call the quicksort algorythum
        charsSorted=quicksort(text);

        return charsSorted;
    }

    public String quicksort(String text){

        // Generate an char array for sorting and high medium and low values
        char[] charsUnsorted = text.toCharArray();

        String pivot = Character.toString(charsUnsorted[0]);

        String middle="";
        String high="";
        String low="";

        // If only one value in the array return only the value
        if (charsUnsorted.length==1)
        {
            return pivot;
        }
        // need an pivot iteerator
        char pivotIterator= charsUnsorted[0];

        // These for loop seperates the hogh, low and the medium values .
        for (int i = 1; i < charsUnsorted.length ; i++)
        {
            if ( (int)pivotIterator == (int)charsUnsorted[i] )
            {
                middle += charsUnsorted[i];
            }
            if ( (int)pivotIterator < (int)charsUnsorted[i] )
            {
                high += charsUnsorted[i];
            }
            if ( (int)pivotIterator > (int)charsUnsorted[i] )
            {
                low += charsUnsorted[i];
            }
        }

        // if high is not empty make an recursion to sort the high array
        if (high.length()>0)
        {
            high = quicksort(high);
        }

        // if the low is not empty make an recursion to sort this
        if (low.length()>0)
        {
            low = quicksort(low);
        }

        // Return the values ... 
        System.out.println("Result complete:" + low + middle + pivot + high);

        return low + middle + pivot + high;


    }
}
