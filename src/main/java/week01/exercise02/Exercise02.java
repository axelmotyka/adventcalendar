package week01.exercise02;


import java.util.logging.Logger;

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

        if (text.trim() != text)
            log.warning("Argument contains leading/trailing whitespace, may cause exception!");

        String result = "";

        for (int i=0; i<text.length(); i++) {
            if (text.charAt(i) == ' ') {
                result += " " + Character.toUpperCase(text.charAt(++i));
            } else {
                result += text.charAt(i);
            }
        }

        return result;
    }
}
