package week01.exercise09;

import java.util.Arrays; 
import java.util.logging.Logger;

/**
 * Quicksort
 * Take the _str_ string parameter being passed and return the string with the letters in 
 * alphabetical order (ie. `hello` becomes `ehllo`). Spaces, numbers and punctuation symbols 
 * will not be included in the sorted string. 
 * Implement your own QuickSort.
 */
public class Exercise09 {
    private static final Logger log = Logger.getLogger( Exercise09.class.getName() );

    public String run(String text) {
        log.info(String.format("Run(\"%s\")", text));

int y = 0;
        char[] textChars= new char[text.length()];
        for (int j = 0; j < text.length() ; j++) {
            if (text.charAt(j)==' '){
                continue;
            }
            else{
                textChars[y]=text.charAt(j);
                y++;
                continue;
            }

        }

        boolean swapped=false;
        while (swapped == false){
            for (int j=1; j< textChars.length; j++){
                for (int i=0; i< textChars.length-j; i++){
                    int x = i+1;


                    char a = textChars[i];
                    char b = textChars[x];
                    //* if this pair is out of order *//*
                    if (a > b) {
                        //* swap them and remember something changed *//*
                        textChars[x]=a;
                        textChars[i]=b;
                    }
                    else {
                        continue;
                    }
                }
                swapped = true;
            }

        }
        String result = "";
        for (int i = 0; i < textChars.length; i++) {
            if (textChars[i]=='\u0000'){
                continue;
            }
            else{
                result += textChars[i];
            }

        }

        return result;
    }
}
