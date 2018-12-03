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
    private static final Logger log = Logger.getLogger( Exercise05.class.getName() );

    public String run(String text) {
        log.info(String.format("Run(\"%s\")", text));

        String vowels = "aeiou";
        StringBuilder result = new StringBuilder();

        for (int i = 0; i < text.length(); i++) {
            int code = text.charAt(i);
            if (code >= 65 && code <= 90 || code >= 97 && code <= 122) {
                code++;
                if (code == 123 || code == 91)
                    code -= 26;
                if (vowels.indexOf((char)code)>-1)
                    code -= 32;
            }
            result.append((char)code);
        }

        return result.toString();
    }
}
