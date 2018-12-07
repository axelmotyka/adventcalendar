package week01.exercise04;

import java.util.concurrent.SynchronousQueue;
import java.util.logging.Logger;

/**
 * Longest Word
 * <p>
 * Take the _text_ parameter being passed and return the longest word in the string.
 * If there are two or more words that are the same length, return the first word from the string with that length.
 * Ignore punctuation and assume _text_ will not be empty.
 */
public class Exercise04 {

    private static final Logger log = Logger.getLogger(Exercise04.class.getName());

    public String run(String text) {
        log.info(String.format("Run(\"%s\")", text));
        int i = 0;
        int y = 0;
        String longestWord = "";
        String[] punct = {"!", "#", "$", "%", "&", ",", "-", ".", "/", ":", ";", "<", "=", ">", "@", "]", "_", "`", "}", "~"};

        int wordAmmount = text.split(" ").length;
        String[] wordStrings = text.split(" ");

        while (i < wordAmmount) {
            int x = 0;

            while (x < punct.length) {
                wordStrings[i] = wordStrings[i].replace(punct[x], "");
                x++;
            }
            i++;
        }

        while (y < wordAmmount) {

            if (longestWord.length() < wordStrings[y].length()) {
                longestWord = wordStrings[y];
                text = longestWord;
                y++;
            } else {
                y++;
                continue;
            }
        }

        return text;
    }

}
