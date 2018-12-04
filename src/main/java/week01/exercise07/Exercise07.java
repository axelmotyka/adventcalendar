package week01.exercise07;

import week01.exercise06.Exercise06;

import java.util.HashMap;
import java.util.logging.Logger;

/**
 * Caesar cipher
 * The Caesar cipher is one of the earliest known and simplest ciphers. It is a type of substitution cipher in which each letter in the plaintext is 'shifted' a certain number of places down the alphabet.
 * For example, with a shift of an offset of `1`, `A` would be replaced by `B`, `B` would become `C`, and so on.
 * The method is named after Julius Caesar, who apparently used it to communicate with his generals.
 *
 */
public class Exercise07 {
    private static final Logger log = Logger.getLogger( Exercise07.class.getName() );

    /**
     * Generate the cipher as a HashMap.
     * @param offset offset for the alphabet cipher
     * @return HashMap, Like: {[a]=[c], [b]=[d], [c]=[e]}
     */
    public HashMap<Character,Character> generateCipher(int offset) {
        HashMap h = new HashMap<Character,Character>();
        int overflow = 0;
        int result = 0;
        for (int i=65; i<=90; i++) {
            if ((i + offset) > 90) overflow = -26;
            result = i + offset + overflow;
            h.put((char)i, (char)(result));
            h.put((char)(i + 32), (char)(result + 32));
        }
        return h;
    };

    /**
     * Encrypts a unencrypted String with the given cipher.
     * @param message
     * @return
     */
    public String encryptString(String message, HashMap cipher) {
        return new String();
    }

    /**
     * Decrypts a encrypted String with the given cipher
     * @param encryptedMessage
     * @return
     */
    public String decryptString(String encryptedMessage, HashMap cipher) {
        return new String();
    }

    /**
     * Generates a cipher and encrypts the given message.
     * @param offset
     * @return
     */
    public String run(int offset, String message) {
        return new String();
    }
}
