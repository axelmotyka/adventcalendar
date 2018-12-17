package week01.exercise07;

import java.util.HashMap;
import java.util.Map;

/**
 * Caesar cipher
 *
 * The Caesar cipher is one of the earliest known and simplest ciphers. It is a type of substitution cipher in which each letter in the plaintext is 'shifted' a certain number of places down the alphabet.
 * For example, with a shift of an offset of `1`, `A` would be replaced by `B`, `B` would become `C`, and so on.
 * If you move over the end of the alphabet, move on from the beginning. That means with an offest of `1`, `Z` would become `A`.
 * Use only UpperCase letters!
 * The method is named after Julius Caesar, who apparently used it to communicate with his generals.
 */
public class Exercise07 {

    /**
     * Generate the cipher as a HashMap.
     * @param offset offset for the alphabet cipher
     * @return HashMap, Like: {[A]=[C], [B]=[D], [C]=[E]}
     */
    // This is my cipher as a HashMap (diese HashMap ist ein "dictionary" mit String-String als Key-Value-Paaren.
    public HashMap<String,String> generateCipher(int offset) {
        HashMap<String, String> toll = new HashMap<>();
        if(offset > 26){
            offset = offset % 26;
        }
        for (char alphabet = 'A'; alphabet <= 'Z'; alphabet++) {
            //System.out.println(alphabet);
            char key = alphabet; // The key in our HashMap is a character from the alphabet.
            char value = (char) (alphabet + offset); // The value to the key above is the ASCII number.

            // If the value (the ASCII number) is greater than the value of 'Z':
            if (value > 'Z') {
                int moveByOffset = value % 'Z'; // Determine the modulo: "value" modulo 'Z', ex. 92%90=2.
                value = (char) ('A' - 1 + moveByOffset); // Move from 'A'-1 (from the ASCII number) + moveByOffset.
            }
            // If the value (the ASCII number) is smaller than the value of 'A':
            else if (value < 'A') {
                int moveByOffset = 'A' % value; // Determine the modulo: value of 'A' modulo "value", ex. 65%62=3.
                value = (char) ('Z' + 1 - moveByOffset); // Move back by moveByOffset from the (ASCII number) 'Z'+1.
            }

            toll.put(String.valueOf(key), String.valueOf(value));
        }

        toll.put(" ", " "); // To handle with the spaces.


        return toll;
    }

    /**
     * Encrypts a unencrypted String with the given cipher.
     * @param message
     * @return
     */
    // The function "encryptString" has 2 parameters: "message" and "HashMap" with String-String as a cipher ???
    public String encryptString(String message, HashMap<String, String> cipher) {
        String stringToEncrypt = message.toUpperCase();

        StringBuilder result = new StringBuilder();

        for (char letter : stringToEncrypt.toCharArray()) {
            String encrypt = cipher.get(String.valueOf(letter));
            result.append(encrypt);
        }

        return result.toString();
    }

    /**
     * Decrypts a encrypted String with the given cipher
     * @param message
     * @return
     */
    public String decryptString(String message, HashMap<String, String> cipher) {
        String stringToDecrypt = message.toUpperCase();

        StringBuilder result = new StringBuilder();
        for (char letter : stringToDecrypt.toCharArray()) {
            String value = String.valueOf(letter);
            String decrypt = getKeyForValue(value, cipher);
            result.append(decrypt);
        }

        return result.toString();
    }


    public String getKeyForValue(String value, HashMap<String, String> cipher) {
        for (Map.Entry<String, String> entry : cipher.entrySet()) {
            String key = entry.getKey();
            String val = entry.getValue();
            if (value.equals(val)) {
                return key;
            }
        }
        return "";
    }

    /**
     * Generates a cipher and encrypts the given message.
     * @param offset
     * @return
     */
    public String run(int offset, String message) {
        return encryptString(message, generateCipher(offset));
    }
}
