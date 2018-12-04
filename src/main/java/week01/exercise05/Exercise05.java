package week01.exercise05;

import java.util.logging.Logger;

/**
 * Exercise05
 * <p>
 * Take the _text_ parameter being passed and modify it using the following algorithm.
 * Replace every letter in the string with the letter following it in the alphabet (ie. c becomes d, z becomes a).
 * Then capitalize every vowel in this new string (a, e, i, o, u) and finally return this modified string.
 */
public class Exercise05 {
    private static final Logger log = Logger.getLogger(Exercise05.class.getName());

    public String run(String text) {
        char[] chars = text.toCharArray();

        for (int i = 0; i < chars.length; i++) {
            int charValue = text.charAt(i);
            //There is now letter next to z - so what should happen?
            if (Character.isAlphabetic(chars[i]) && Character.toLowerCase(chars[i]) != 'z') {
                chars[i] = String.valueOf((char) (charValue + 1)).charAt(0);
                switch (chars[i]) {
                    case 'a':
                    case 'e':
                    case 'i':
                    case 'o':
                    case 'u':
                        chars[i] = Character.toUpperCase(chars[i]);
                }
            }

        }

        return new String(chars);
    }
}
