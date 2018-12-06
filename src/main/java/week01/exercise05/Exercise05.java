package week01.exercise05;

import java.util.logging.Logger;

/**
 *Exercise05
 *
 * Take the _text_ parameter being passed and modify it using the following algorithm.
 * Replace every letter in the string with the letter following it in the alphabet (ie. c becomes d, z becomes a).
 * Then capitalize every vowel in this new string (a, e, i, o, u) and finally return this modified string.
 */
public class Exercise05 {
    private static final Logger log = Logger.getLogger(Exercise05.class.getName());

    public String run(String text) {
        log.info(String.format("Run(\"%s\")", text));

        char[] characters = text.toCharArray();
        String newString = "";
        for (int i = 0; i < characters.length; i++) {
            if (String.valueOf(characters[i]).matches("[A-Za-z]")) {
                characters[i] += 1;
                if (String.valueOf(characters[i]).matches("[aAeEiIoOuU]")) {
                    characters[i] = Character.toUpperCase(characters[i]);
                }
            }
            newString += characters[i];
        }
        return newString;
    }
}
