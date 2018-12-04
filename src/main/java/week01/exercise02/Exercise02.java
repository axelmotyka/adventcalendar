package week01.exercise02;


import com.sun.org.apache.xpath.internal.operations.Variable;
import com.sun.xml.internal.bind.v2.runtime.unmarshaller.XsiNilLoader;

import java.lang.reflect.Array;
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
        //(text.indexOf(0)).toUpperCase;
        //text.replaceFirst(text.indexOf(" ")+1, text.indexOf((text.indexOf(" ")+1)).toUpperCase);
        //text.indexOf(' ');

        int splitLength = (text.split(" ",0).length);
        //System.out.println(splitLength);    //7
        int i = 0;
        //private java.lang.reflect.Array textArray = [];
        String newText = "";
        String textArray[] = new String[splitLength];
        //textArray.length = splitLength;
        while (i < splitLength) {


            java.lang.String word = text.split(" ", 0)[i];
            //System.out.println(word);
            //word.replaceFirst(String regex, String replacement);
            textArray[i] = word;

            char firstChar = (word.charAt(0));
            char upperChar = java.lang.Character.toUpperCase(firstChar);
            //System.out.println(upperChar);
            textArray[i] = ;
            textArray[i].replace(textArray[i].charAt(0), upperChar);
            //char firstCharInTextArray = textArray[i].charAt(0);
            //firstCharInTextArray = upperChar;
            //System.out.println(firstCharInTextArray);
            System.out.println(textArray[i]);
            newText = newText + textArray[i] + " ";
            System.out.println(newText);
            i++;
        }
        //System.out.println(java.lang.Character.toUpperCase(firstChar));

        //System.out.println((text.split(" ",0))[1]);
        //System.out.println((text.split(" ",0))[1].charAt(0));

        //System.out.println(text.charAt().toUpperCase);
        //System.out.println(text.indexOf("[ \t\n\f\r]"));
        //System.out.println((text.split(" ",0))[1].toUpperCase());
        //text = textArray.toString();
        //System.out.println(newText);
        text = newText;
        return (text);    }
}
