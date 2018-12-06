package week01.exercise02;


import java.util.logging.Logger;

/**
 * Letter Capitalize
 *
 * Take the _text_ parameter being passed and capitalize the first letter of each word. 
 * Words will be separated by only one space.
 */
public class Exercise02 {

    public String run(String text) {

        // Wandle String aus "text" in ein Array (Liste) von Buchstaben um.
        char[] buchstaben = text.toCharArray();

        for (int i = 0; i < buchstaben.length; i++) {
            // Leerstellen suchen.
            char buchstabe = buchstaben[i];
            if (buchstabe == ' ') {
                // Erhöhe den Index i um 1, um das Zeichen nach der Leerstelle zu erhalten
                i = i + 1;
                // Nehme damit den Buchstaben nach der Leerstelle und wandle es in UpperCase um
                buchstaben[i] = Character.toUpperCase(buchstaben[i]);
            }
        }
        return new String(buchstaben);
    }
}