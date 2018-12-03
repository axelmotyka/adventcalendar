package week01.exercise04;

import java.util.logging.Logger;

/**
 * Longest Word
 *
 * Take the _text_ parameter being passed and return the longest word in the string.
 * If there are two or more words that are the same length, return the first word from the string with that length.
 * Ignore punctuation and assume _text_ will not be empty.
 *
 */
public class Exercise04 {
    private static final Logger log = Logger.getLogger( Exercise04.class.getName() );

    public String run(String text) {
        log.info(String.format("Run(\"%s\")", text));

        //Clean the text from special characters
        text = text.replaceAll("[^\\w]"," ");
        //Split the text into array
        String textarray[] = text.split("\\s+");
        // need one variable to store the greatest element of the array.
        int greatestArray=0;


        for( int x = 0; x < textarray.length; x++ )
        {
            if (textarray[x].length() > textarray[greatestArray].length())
            {
                greatestArray=x;
            }

        }
        return textarray[greatestArray];

    }
}