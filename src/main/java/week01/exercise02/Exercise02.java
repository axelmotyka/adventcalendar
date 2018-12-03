package week01.exercise02;


import java.nio.charset.Charset;
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
        String subtext = "";
        String isWhite;
        String[] mySubstring = text.split(" ");
        int noOfWords = mySubstring.length;

        //for (int i: mySubstring){
        for (int i = 0; i < noOfWords; i++){
            if(i == noOfWords - 1) isWhite = "";
            else{isWhite = " ";};
            subtext = subtext + mySubstring[i].substring(0, 1).toUpperCase() + mySubstring[i].substring(1) +  isWhite;
        }
        text = subtext;
        log.info(String.format("Run(\"%s\")", text));

        return text;
    }
    public String run2(String text) {
        String res = "";
        for (String word : text.split(" ") ) {
            char firstChar = word.charAt(0);
            word = word.replaceFirst(Character.toString(firstChar), Character.toString(Character.toUpperCase(firstChar)));
            res = String.join(" ", res, word);
        }
        return res.replaceFirst(" ","");
    }
}