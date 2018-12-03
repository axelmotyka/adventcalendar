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

        // Changes text in char array
        char[] chars = text.toCharArray();

        // Go in a loop and increment every ascii value from 98 to 123 (a until z)
        // only the vocals should be changes to the upper ascii code
        // ascii = ascii - 32 change from e to E intervall between ascii low and upper
        // is -32.
        for( int x = 0; x < chars.length; x++ )
        {

            int ascii = (int) chars[x] + 1 ;

            if (ascii >= 98 && ascii <= 123)
            {
                if (ascii == 101 || ascii == 105 || ascii == 111 || ascii == 117 )
                    ascii -= 32;
                chars[x]=(char)ascii;
            }
        }

        // modify char array to string value .
        text = new String(chars);
        return text;
    }
}

