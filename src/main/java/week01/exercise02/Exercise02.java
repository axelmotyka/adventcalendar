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
        int splitLength = (text.split(" ",0).length);
        int i = 0;
        String newText = "";
        while (i < splitLength) {

            java.lang.String word = text.split(" ", 0)[i];

            String upperChar = (word.substring( 0, 1 ).toUpperCase());

            i++;
            if (i == splitLength){
                newText = newText + word.replaceFirst(word.substring( 0, 1 ), upperChar);
            }
            else {
                newText = newText + word.replaceFirst(word.substring( 0, 1 ), upperChar) + " ";
            }
            }

        text = newText;
        return (text);    }
}
