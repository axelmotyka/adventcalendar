package week01.exercise02;


import java.util.logging.Logger;
import java.lang.*;


/**
 * Letter Capitalize
 *
 * Take the _text_ parameter being passed and capitalize the first letter of each word.
 * Words will be separated by only one space.
 */
public class Exercise02 {
    private static final Logger log = Logger.getLogger( Exercise02.class.getName() );

    public String run(String text) {
        log.info(String.format("Run(\"%s\")", text));

        // Change it in a char array
        char[] chars = text.toCharArray();
        int foundspaces= 0;
        // Search in a for loop for spaces and Replace the characters that comes after that
        for( int x = 0; x < chars.length; x++ )
        {
            if (foundspaces == 1)
            {
                foundspaces = 0;
                chars[x]=Character.toUpperCase(chars[x]);
            }
            if (chars[x] ==  ' ')
            {
                foundspaces = 1;
            }
        }
        //Change the char array into string ...
        // I KNOW REGEX is also possible ... but that would be copying :)
        text = new String(chars);
        System.out.println(text);
        return text;
    }
}
