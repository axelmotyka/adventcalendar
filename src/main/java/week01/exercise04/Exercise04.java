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

        int maxLengthSoFar = -1;
        int lastWordStartIndex = 0;
        int len = text.length();
        int currentWordLength = 0;
        String longestWordSoFar = "";

        for (int pos = 0; pos < len; pos++) {
            char c = text.charAt(pos);
            if (Character.isLetter(c))
                currentWordLength++;
            if (Character.isWhitespace(c) || (pos == len-1)) {
                if (currentWordLength > maxLengthSoFar) {
                    longestWordSoFar = text.substring(lastWordStartIndex, lastWordStartIndex + currentWordLength);
                    maxLengthSoFar = currentWordLength;
                }
                lastWordStartIndex = pos+1;
                currentWordLength = 0;
            }
        }

        return longestWordSoFar;
    }
}
