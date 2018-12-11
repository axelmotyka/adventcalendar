package week01.exercise05;

import java.lang.reflect.Array;
import java.util.logging.Logger;

/**
 * Exercise05
 * <p>
 * Take the _text_ parameter being passed and modify it using the following algorithm.
 * Replace every letter in the string with the letter following it in the alphabet (ie. c becomes d, z becomes a).
 * Then capitalize every vowel in this new string (a, e, i, o, u) and finally return this modified string.
 */
public class Exercise05 {
    //private static final Logger log = Logger.getLogger( Exercise05.class.getName() );
    //log.info(String.format("Run(\"%s\")", text));

    // wandle um : hello in Ifmmp

    public char sonderZeichenAnpassen(char character) {
        //System.out.println(character);
        char neuesZeichen = character;

        if (character >= 'a' && character <= 'z' || character >= 'A' && character <= 'Z') {
            //System.out.println("gefunden");
            neuesZeichen = (char) (character + 1);
            if (character == 'z') {
                neuesZeichen = 'a';
            } else if (character == 'Z') {
                neuesZeichen = 'A';
            }
            if (neuesZeichen == 'a') {
                neuesZeichen = 'A';
            } else if (neuesZeichen == 'e') {
                neuesZeichen = 'E';
            } else if (neuesZeichen == 'i') {
                neuesZeichen = 'I';
            } else if (neuesZeichen == 'o') {
                neuesZeichen = 'O';
            } else if (neuesZeichen == 'u') {
                neuesZeichen = 'U';
            }
        }
        return neuesZeichen;
    }
    public String run(String text) {
        char[] textArray = text.toCharArray();
        char[] result = new char[textArray.length];

        for (int i = 0; i < textArray.length; i++) {
            char currentCharacter = textArray[i];
            result[i] = sonderZeichenAnpassen(currentCharacter);
        }
        //System.out.println(result);
        return new String(result);
    }
}
