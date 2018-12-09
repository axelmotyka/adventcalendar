package week01.exercise07;

import sun.awt.SunHints;

import javax.crypto.Cipher;
import java.security.Key;
import java.util.HashMap;
import java.util.Hashtable;

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
    String alphabet = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
    public HashMap<String, String> generateCipher(int offset) {
        return (createCipher(alphabet, offset));
    }


    String transferAlphabet = "";


    public HashMap createCipher(String alphabet, int offset) {

        while (offset > alphabet.length()) {
            offset = offset - alphabet.length();
        }
        for (int i = 0; i < alphabet.length(); i++) {
            char ch = alphabet.charAt(i);
            if((char)(ch+offset)<(91)){
            char cipherChar = ((char) (ch + offset));
            transferAlphabet += cipherChar;
            }
            else{
                char cipherChar = ((char) (ch + (offset-alphabet.length())));
                transferAlphabet += cipherChar;
            }

        }
        HashMap<String, String> cipher=new HashMap<String, String>();
        for (int i = 0; i < alphabet.length(); i++) {
            cipher.put(alphabet.substring(i, i + 1), transferAlphabet.substring(i, i + 1));

        }

        return cipher;
    }


    /**
     * Encrypts a unencrypted String with the given cipher.
     *
     * @param message
     * @return
     */

    public String encryptString(String message, HashMap cipher) {

        String cipherChar= "";
        String encryptedString = "";
        for (int i = 0; i < message.length() ; i++) {
            Character ch = message.charAt(i);

            cipherChar = cipher.get(ch.toString()).toString();
            encryptedString += cipherChar;

        }

        return encryptedString;
    }


    public static Object getKeyFromValue(HashMap cipher, String chString) {
        for (Object o : cipher.keySet()) {
            if (cipher.get(o).equals(chString)) {
                return (o.toString());
            }
        }
        return null;
    }
    /**
     * Decrypts a encrypted String with the given cipher
     *
     * @param encryptedMessage
     * @return
     */
    //HashMap cipher=generateCipher(3);
    public String decryptString(String encryptedMessage, HashMap cipher) {


        String decryptedChar= "";
        String decryptedString = "";
        for (int i = 0; i < encryptedMessage.length() ; i++) {
            Character ch = encryptedMessage.charAt(i);
            String chString = ch.toString();

            decryptedChar = (getKeyFromValue(cipher, chString)).toString();

            decryptedString += decryptedChar;

    }
        return decryptedString;
    }

    /**
     * Generates a cipher and encrypts the given message.
     *
     * @param offset
     * @return
     */
    public String run(int offset, String message) {

        return (encryptString(message, generateCipher(offset)));
    }
}
