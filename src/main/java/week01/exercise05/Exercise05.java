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

        String result = "";

        for (char letter : text.toCharArray()){
            // Prüfung nach Bustabenwerten
            if (Character.isAlphabetic(letter)) {
                // Zeichencode zu subtrahieren (Wert 0-25) um 1 zu erhöhen / Modulus 26 + a für Z -> a
                result += Character.toString((char) (((letter - 'a' + 1) % 26) + 'a'));
            } else {
                result += Character.toString(letter);
            }
        }

        int counter = 0;
        StringBuilder string = new StringBuilder(result);

        for (int i = 0; i < result.length(); i++){
            // i loopt für die Vokal Buchstaben
            char vowels = result.charAt(i);
            switch (vowels) {

                case 'a':
                case 'e':
                case 'i':
                case 'o':
                case 'u':
                    string.setCharAt(i, Character.toUpperCase(vowels));
                    counter++;
                    break;
            }
        }

        result = string.toString();

        return result;
    }
}
