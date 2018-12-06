package week01.exercise02;


import java.util.logging.Logger;

/**
 * Letter Capitalize
 *
 * Take the _text_ parameter being passed and capitalize the first letter of each word. 
 * Words will be separated by only one space.
 */
public class Exercise02 {
    private static final Logger log = Logger.getLogger(Exercise02.class.getName());

    public String run(String text) {
        log.info(String.format("Run(\"%s\")", text));

        String capText = "" + Character.toUpperCase(text.charAt(0));
        for (int i = 1; i < text.length(); i++) {
            if (text.charAt(i-1) == (' ')) {
                capText += Character.toUpperCase(text.charAt(i));
            } else {
                capText += text.charAt(i);
            }
        }
        return capText;
        }
    }

