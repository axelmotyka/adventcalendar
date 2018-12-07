package week01.exercise05;

import java.util.logging.Logger;

/**
 *Exercise05
 *
 * Take the _text_ parameter being passed and modify it using the following algorithm.
 * Replace every letter in the string with the letter following it in the alphabet (ie. c becomes d, z becomes a).
 * Then capitalize every vowel in this new string (a, e, i, o, u) and finally return this modified string.
 */
public class Exercise05 {
    private static final Logger log = Logger.getLogger( Exercise05.class.getName() );

    public String run(String text) {
        log.info(String.format("Run(\"%s\")", text));
/*
1) Slice the text being passed into characters and put them in a list variable with characters "textChar".
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
        return text;
    }
}
