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
        log.info(String.format("Run(\"%s\")", text));
        //String[] letters= text.split("");
        int textLength = text.length();

        String result = "";

        for (int i = 0; i < textLength; i++) {
            if (((Character) (text.charAt(i))).toString().matches("[a-z]")
            ||((Character) (text.charAt(i))).toString().matches("[\\p{Punct}]")
            ||(text.charAt(i)== ' ')) {

                if (text.charAt(i) == 'z') {
                    result = result + 'A';

                } else if (text.charAt(i) + 1 == 'e') {
                    result = result + 'E';

                } else if (text.charAt(i) + 1 == 'i') {
                    result = result + 'I';

                } else if (text.charAt(i) + 1 == 'o') {
                    result = result + 'O';

                } else if (text.charAt(i) + 1 == 'u') {
                    result = result + 'U';

                }
                else if (((Character) (text.charAt(i))).toString().matches("[\\p{Punct}]")) {
                    result = result + text.charAt(i);

                }
                else if (text.charAt(i)== ' ') {
                    result = result + ' ';

                }
                else {
                    result = result + ((char)(text.charAt(i) + 1));

                }
            }

            //result = result + text.charAt(i);

        }

        text = result;
        return text;
    }


}

