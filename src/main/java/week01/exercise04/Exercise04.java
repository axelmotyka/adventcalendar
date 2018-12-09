package week01.exercise04;

import com.sun.istack.internal.Nullable;

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
    private static final Logger log = Logger.getLogger(Exercise04.class.getName() );

    public String run(String text) {
        log.info(String.format("Run(\"%s\")", text));

        // Define the variables we need to process through the string in order to find the longest word.
        int i = 0;
        int y = 0;
        String longestWord = "";
        String[] punctuation = {"!", "#", "$", "%", "&", ",", "-", ".", "/", ":", ";", "<", "=", ">", "@", "]", "_", "`", "}", "~"};

        String[] wordsText = text.split(" ");
        int wordNumber = wordsText.length;

        // Iterate through the list of words in the variable "wordsText".
        for (i=0; i < wordNumber; i++) {
            int x = 0;

            // Replace (delete) all punctuation in the word.
            for (x = 0; x < punctuation.length; x++) {
                wordsText[i] = wordsText[i].replace(punctuation[x], "");
                //x++;
            }
            //i++;
        }

        // Find the longest word in the list of words, where words are cleaned up from punctuation.
        for (y = 0; y < wordNumber; y++) {

            if (longestWord.length() < wordsText[y].length()) {
                longestWord = wordsText[y];
                text = longestWord;
            } else {
                continue;
            }
        }

        return text;
    }
}
