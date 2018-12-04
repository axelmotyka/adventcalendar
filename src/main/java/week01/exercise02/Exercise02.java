package week01.exercise02;


import java.util.logging.Logger;

/**
 * Letter Capitalize
 * <p>
 * Take the _text_ parameter being passed and capitalize the first letter of each word.
 * Words will be separated by only one space.
 */
public class Exercise02 {
    private static final Logger log = Logger.getLogger(Exercise02.class.getName());

    public String run(String text) {
        String[] words = text.split("\\s");

        for (int i = 0; i < words.length; i++) {
            String replacement = words[i].substring(0, 1).toUpperCase() + words[i].substring(1);
            text = text.replaceFirst(words[i], replacement);
        }

        return text;
    }
}
