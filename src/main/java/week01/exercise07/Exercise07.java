package week01.exercise07;

import java.util.HashMap;

/**
 * Caesar cipher
 * <p>
 * The Caesar cipher is one of the earliest known and simplest ciphers. It is a type of substitution cipher in which each letter in the plaintext is 'shifted' a certain number of places down the alphabet.
 * For example, with a shift of an offset of `1`, `A` would be replaced by `B`, `B` would become `C`, and so on.
 * If you move over the end of the alphabet, move on from the beginning. That means with an offest of `1`, `Z` would become `A`.
 * Use only UpperCase letters!
 * The method is named after Julius Caesar, who apparently used it to communicate with his generals.
 */
public class Exercise07 {

    /**
     * Generate the cipher as a HashMap.
     *
     * @param offset offset for the alphabet cipher
     * @return HashMap, Like: {[A]=[C], [B]=[D], [C]=[E]}
     */
    public HashMap<Character, Character> generateCipher(int offset) {

        HashMap<Character, Character> cipher = new HashMap<>();

        if (offset >= 26) {
            int multiplier = offset / 26;
            offset = offset - (26 * multiplier);
        }

        for (int i = 65; i <= 90; i++) {
            int shiftedChar = i + offset;
            //move over to the beginning
            if (shiftedChar > 90) {
                shiftedChar = shiftedChar - 90 + 65 - 1;
            }
            cipher.put((char) i, (char) shiftedChar);
        }

        return cipher;
    }

    /**
     * Encrypts a unencrypted String with the given cipher.
     *
     * @param message
     * @return
     */
    public String encryptString(String message, HashMap<Character, Character> cipher) {

        char[] encryptedMessage = message.toCharArray();

        for(int i = 0; i < encryptedMessage.length; i++) {
            encryptedMessage[i] = cipher.get(encryptedMessage[i]);
        }

        return String.valueOf(encryptedMessage);
    }

    /**
     * Decrypts a encrypted String with the given cipher
     *
     * @param encryptedMessage
     * @return
     */
    public String decryptString(String encryptedMessage, HashMap cipher) {
        return new String();
    }

    /**
     * Generates a cipher and encrypts the given message.
     *
     * @param offset
     * @return
     */
    public String run(int offset, String message) {
        return encryptString(message, generateCipher(offset));
    }
}
