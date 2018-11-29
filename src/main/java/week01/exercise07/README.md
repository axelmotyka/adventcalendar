### Exercise 07 - Caesar cipher
The Caesar cipher is one of the earliest known and simplest ciphers. It is a type of substitution cipher in which each letter in the plaintext is 'shifted' a certain number of places down the alphabet. For example, with a shift of an offset of `1`, `A` would be replaced by `B`, `B` would become `C`, and so on. 
The method is named after Julius Caesar, who apparently used it to communicate with his generals.
Implement and test the following functions:
```
    /**
     * Generate the cipher as a HashMap.
     * @param offset offset for the alphabet cipher
     * @return HashMap, Like: {[a]=[c], [b]=[d], [c]=[e]}
     */
    public HashMap<String,String> generateCipher(int offset) {
        return new HashMap<String,String>();
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
```