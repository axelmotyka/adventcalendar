package week01.exercise07;

import org.junit.Test;

import java.util.HashMap;

import static org.junit.Assert.*;

public class Exercise07Test {

    @Test
    public void generateCipherTest() {
        Exercise07 tester = new Exercise07();
        int offset = 3;
        String alphabet = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";

        HashMap<String, String> cipher = tester.createCipher(alphabet, 2);
        assertEquals(cipher, (tester.generateCipher(offset)));
    }

    @Test
    public void encryptStringTest() {
        Exercise07 tester = new Exercise07();
        String message="ABC";
        int offset = 2;
        HashMap<String, String> cipher;
        cipher = tester.generateCipher(offset);
        assertEquals("encrypted message expected", "CDE", tester.encryptString(message, cipher));
    }

    @Test
    public void decryptStringTest() {
        Exercise07 tester = new Exercise07();
        String encryptedMessage="CDE";
        int offset = 2;
        HashMap<String, String> cipher;
        cipher = tester.generateCipher(offset);
        assertEquals("encrypted message expected", "ABC", tester.decryptString(encryptedMessage, cipher));
    }

    @Test
    public void runTest() {
        Exercise07 tester = new Exercise07();
        assertEquals("encrypted message expected", "ZWDDG", tester.run(356, "HELLO"));
    }
}