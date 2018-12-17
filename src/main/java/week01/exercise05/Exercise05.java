package week01.exercise05;

import com.sun.xml.internal.fastinfoset.stax.events.CharactersEvent;

import java.util.Arrays;
import java.util.logging.Logger;

/**
 *Exercise05
 *
 * Take the _text_ parameter being passed and modify it using the following algorithm.
 * Replace every letter in the string with the letter following it in the alphabet (ie. c becomes d, z becomes a).
 * Then capitalize every vowel in this new string (a, e, i, o, u) and finally return this modified string.
 */
public class Exercise05 {
    private static final Logger log = Logger.getLogger(Exercise05.class.getName());

    // char[] vowels = {'a', 'e', 'i', 'o', 'u'};

    public String run(String text) {
        log.info(String.format("Run(\"%s\")", text));

        // Split the text being passed (with "text") to letters and put them in a list variable "characters".
        char[] characters;
        characters = text.toCharArray();

        // Iterate through each character in the array "characters".
        for (int i = 0; i < characters.length; i++) {
            char character = characters[i];
            int characterAscii = character;

            // Skip punctuation and blanks.
            if (Character.isSpaceChar(character)) {
                characters[i] = ' ';
            }
            else if(character == 'z'){
                characters[i] = 'a';
                }
            else if(character == 'Z'){
                characters[i] = 'A';
            }
            else {
                if (Character.isLetter(character)) {
                    // Check up the characters ASCII code and take it to find the next character.
                    // Add 1 to characterAscii in order to create the ASCII code for the next character.
                    int characterNextAscii = characterAscii + 1;
                    char characterNext = (char) characterNextAscii;
                    characters[i] = characterNext;
                }
            }
        }
        // Traverse trough the array of characters again. If a character is a vowel, then change it to upper case letter.
        for (int j = 0; j < characters.length; j++) {
            char characterToUpper = characters[j];

            if (Arrays.asList('a', 'e', 'i', 'o', 'u').contains(characterToUpper)) {
                characters[j] = Character.toUpperCase(characterToUpper);
            }
            }
        return new String(characters);
    }
}

/*

2) Iterate through "textChar" and proof, if a character is from the set [a-z] or [A-Z].
(if(Character.isLetter(textChar[i])))
3) If yes, than replace the character through the character, which follows it in the alphabet.
For this, determine the ASCII-number of the character and the folowing character.
4) Iterate through the new list of characters and look for vowels (a, e, i, o, u).
5) If the character is a vowel, then change it to upper case letter (something like:
buchstaben[i] = Character.toUpperCase(buchstaben[i]))
6) At least concatenate the changed characters to new string "textChanged".
7) Return the result and print it out.
 */
