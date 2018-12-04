package week01.exercise02;

import java.util.logging.Logger;

/**
 * Letter Capitalize
 *
 * Take the _text_ parameter being passed and capitalize the first letter of
 * each word. Words will be separated by only one space.
 */
public class Exercise02 {
    private static final Logger log = Logger.getLogger(Exercise02.class.getName());

    public String run(String text) {

        String toUpperCaseFirstLetterOnly(String str) {
            String[] words = str.split(" ");
            StringBuilder ret = new StringBuilder();
            for(int i = 0; i < words.length; i++) {
                ret.append(Character.toUpperCase(words[i].charAt(0)));
                ret.append(words[i].substring(1));
                if(i < words.length - 1) {
                    ret.append(' ');
                }
            }
            return ret.toString();
        }
    }
}
