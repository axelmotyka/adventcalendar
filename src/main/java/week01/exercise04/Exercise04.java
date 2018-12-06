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

        String words [] = text.split(" ");
        String longest ="";
        for (int i = 0; i < words.length; i++) {
            String word = words[i].replaceAll("[\\W]", "");
            if (word.length() > longest.length()) {
                longest = word;
            }
        }
    return longest;
    }
}
