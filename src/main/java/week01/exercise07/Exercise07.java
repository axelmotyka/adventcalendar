package week01.exercise07;

import java.util.HashMap;
import java.util.Set;

/**
 * Caesar cipher
 * The Caesar cipher is one of the earliest known and simplest ciphers. It is a type of substitution cipher in which each letter in the plaintext is 'shifted' a certain number of places down the alphabet.
 * For example, with a shift of an offset of `1`, `A` would be replaced by `B`, `B` would become `C`, and so on.
 * The method is named after Julius Caesar, who apparently used it to communicate with his generals.
 *
 */
public class Exercise07 {

    /**
     * Generate the cipher as a HashMap.
     * @param offset offset for the alphabet cipher
     * @return HashMap, Like: {[a]=[c], [b]=[d], [c]=[e]}
     */
    public HashMap<String,String> generateCipher(int offset) {
        HashMap cipher = new HashMap();
        for (char i = 'A'; i <= 'Z'; ++i) {
            char chiffre = (char) (i + offset);
            if (chiffre > 'Z') {
                chiffre = (char) (chiffre - 26);
            }
            if (chiffre < 'A') {
                chiffre = (char) (chiffre + 26);
            }
            cipher.put(String.valueOf(i), String.valueOf(chiffre));
        }
        for (char i = 'a'; i <= 'z'; ++i) {
            char chiffre = (char) (i + offset);
            if (chiffre > 'z') {
                chiffre = (char) (chiffre - 26);
            }
            if (chiffre < 'a') {
                chiffre = (char) (chiffre + 26);
            }
            cipher.put(String.valueOf(i), String.valueOf(chiffre));
        }
        // Könnte man auch noch für Ziffern so machen
        return cipher;
    }

    /**
     * Encrypts a unencrypted String with the given cipher.
     * @param message
     * @return
     */
    public String encryptString(String message, HashMap cipher) {
        char charArray [] = message.toCharArray();
        String encString = "";
        for (int i = 0; i < charArray.length; ++i) {
            if (cipher.get(String.valueOf(charArray[i])) != null) {
                encString += cipher.get(String.valueOf(charArray[i]));
            }
            else encString += String.valueOf(charArray[i]);
            }
        return encString;
    }

    /**
     * Decrypts a encrypted String with the given cipher
     * @param encryptedMessage
     * @return
     */
    public String decryptString(String encryptedMessage, HashMap cipher) {
        HashMap invertedCipher = new HashMap();
        cipher.forEach((k, v) -> invertedCipher.put(v, k));
        char charArray [] = encryptedMessage.toCharArray();
        String decString = "";
        for (int i = 0; i < charArray.length; ++i) {
            if (cipher.get(String.valueOf(charArray[i])) != null) {
                decString += invertedCipher.get(String.valueOf(charArray[i]));
            }
            else decString += String.valueOf(charArray[i]);
        }
        return decString;
    }

    /**
     * Generates a cipher and encrypts the given message.
     * @param offset
     * @return
     */
    public String run(int offset, String message) {
        return encryptString(message,generateCipher(offset));
    }
}
