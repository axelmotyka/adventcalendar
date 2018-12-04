package week01.exercise02;

import org.apache.commons.lang3.StringUtils;
import org.apache.commons.lang3.text.WordUtils;

import java.util.ArrayList;
import java.util.List;
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

        String[] array = text.split(" ");
        List<String> list = new ArrayList<>();

        for (String word : array) {
            char[] wordArrayCapitalize = word.toCharArray();
            wordArrayCapitalize[0] = Character.toUpperCase(wordArrayCapitalize[0]);
            list.add(new String(wordArrayCapitalize));
        }

        String string = String.join(" ", list);
        return string;
    }

}

