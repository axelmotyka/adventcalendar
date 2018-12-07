package week01.exercise05;

import java.util.logging.Logger;

/**
 * Exercise05
 * <p>
 * Take the _text_ parameter being passed and modify it using the following algorithm.
 * Replace every letter in the string with the letter following it in the alphabet (ie. c becomes d, z becomes a).
 * Then capitalize every vowel in this new string (a, e, i, o, u) and finally return this modified string.
 */
public class Exercise05 {
    private static final Logger log = Logger.getLogger(Exercise05.class.getName());

    public String run(String text) {
        log.info(String.format("Run(\"%s\")", text));
        //String[] letters= text.split("");
        int textLength = text.length();

        char[] alphabet = {'a', 'b', 'c', 'd', 'e', 'f', 'g', 'h', 'i', 'j', 'k', 'l', 'm', 'n', 'o', 'p', 'q', 'r', 's', 't', 'u', 'v', 'w', 'x', 'y', 'z'};
        char[] punct = {'!', '#', '$', '%', '&', ',', '-', '.', '/', ':', ';', '<', '=', '>', '@', ']', '_', '`', '}', '~'};
        char[] vowel = {'a', 'e', 'i', 'o', 'u'};
        char[] vowelUpper = {'A', 'E', 'I', 'O', 'U'};
        String result = "";
        for (int i = 0; i < textLength; i++) {
            int x = 0;
            while (x < alphabet.length)
                if (alphabet[x] == text.charAt(i)) {
                    if (vowel[0] == alphabet[x+1] ){
                    result = result + vowelUpper[0];
                    }
                    else if (vowel[1] == alphabet[x+1] ){
                        result = result + vowelUpper[1];
                    }
                    else if (vowel[2] == alphabet[x+1] ){
                        result = result + vowelUpper[2];
                    }
                    else if (vowel[3] == alphabet[x+1] ){
                        result = result + vowelUpper[3];
                    }
                    else if (vowel[4] == alphabet[x+1] ){
                        result = result + vowelUpper[4];
                    }
                    else {
                        result = result + alphabet[x+1];

                    }
                    break;
                } else if (punct[x] == text.charAt(i)) {
                    result = result + punct[x];

                    break;
                } else if (' ' == text.charAt(i)) {
                    result = result + ' ';
                    break;
                } else {
                    x++;

                }

                

        }




        text = result;
        return text;
    }
}
