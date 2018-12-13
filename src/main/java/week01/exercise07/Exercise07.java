package week01.exercise07;

import java.util.HashMap;

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
        // learn how how a haschmap works

        // Generate Hashmap

        HashMap<String, String> hmap = new HashMap<String, String>();

        // Generate datatypes for using hashmap generation
        int firstCharacter=97;
        char originalChar=0 ;
        char decodeChar=0;


        // Generate Hashmap
        for (int i = 0 ; i <= 25 ; i++)
        {



            originalChar=(char)(firstCharacter);

            // Special case if the next char is an abc (overrun)
            if ((firstCharacter+offset) >= 123)
            {
                decodeChar=(char)(firstCharacter+offset-26);

            }
            else
            {
                decodeChar=(char)(firstCharacter+offset);
            }

            // Generate the hashmap
            hmap.put(Character.toString(originalChar), Character.toString(decodeChar));
            firstCharacter++;

        }


        return hmap;
    };

    /**
     * Encrypts a unencrypted String with the given cipher.
     * @param message
     * @return
     */
    public String encryptString(String message, HashMap cipher) {

        //System.out.println("this is the message this should be encrypted " + message);

        char[] chars = message.toCharArray();

        // Encrypt the message in the for loop
        for( int x = 0; x < chars.length; x++ )
        {
            //ignore special characters .. these should not be encrypted

            if ((int)chars[x] <  97 || (int)chars[x] >  122 )
            {
                // all upper case should be translated into lower cases
                if ((int)chars[x] >= 65 && (int)chars[x] <=  122 )
                {
                    chars[x]=  (char) (int)(chars[x]+32);

                    chars[x] = (cipher.get(Character.toString(chars[x]))).toString().toCharArray()[0];
                }
            }
            else
            {
                chars[x] = (cipher.get(Character.toString(chars[x]))).toString().toCharArray()[0];
            }


        }

        System.out.println("Crypted text " + new String(chars));

        return new String(chars);

    }

    /**
     * Decrypts a encrypted String with the given cipher
     * @param encryptedMessage
     * @return
     */
    public String decryptString(String encryptedMessage, HashMap cipher) {

        char[] chars = encryptedMessage.toCharArray();
        HashMap<String, String> hmap = new HashMap<String, String>();

        // Exchange the hashmap key and values

        for (Object key : cipher.keySet() )
        {
            //System.out.println(key);
            //ystem.out.println(cipher.get(key));

            hmap.put((String) cipher.get(key),(String) key);

        }

        // Now we can use the encrypt mechanism the mechanism is for both the same

        String message = encryptString( encryptedMessage,  hmap);

        return message;
    }

    /**
     * Generates a cipher and encrypts the given message.
     * @param offset
     * @return
     */
    public String run(int offset, String message) {

        // Use the generateCipher function ;

        HashMap<String, String> hmap = generateCipher(offset);

        // use the encryptstring method ;

        String encryptedmessage = encryptString(message, hmap) ;

        return encryptedmessage;
    }
}