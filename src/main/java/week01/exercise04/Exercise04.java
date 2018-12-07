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
/*
1) Slice the string "test" into words, delimiter is a blank space.
2) Put the words in a new string variable with a list of words.
3) Delete punctuation like !, ., , ? etc.
4) Iterate through the list of words, take each word and ...
4) ... determine its length.
5) Create a new string variable "longestWord" and put in each iteration the word in it, if it is longer
than the length of the  current "longestWord".
6) Print out and return the result.
 */

        return text;
    }
}
