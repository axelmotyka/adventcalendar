package week01.exercise07;

import org.junit.Test;

import java.util.HashMap;

import static org.junit.Assert.*;

public class Exercise07Test {

    @Test
    public void generateCipherTest() {
        Exercise07 tester = new Exercise07();
        int offset = 3;
        assertEquals("Characters are wrong!", "D", tester.generateCipher(offset).get("A"));
    }

    @Test
    public void encryptStringTest() {
        Exercise07 tester = new Exercise07();
        String message = "Python is bessa!";
        int offset = 3;
        HashMap cipher = tester.generateCipher(offset);
        assertEquals("Characters are wrong!", "Sbwkrq lv ehvvd!", tester.encryptString(message, cipher));
    }

    @Test
    public void decryptStringTest() {
        Exercise07 tester = new Exercise07();
        String encryptedMessage = "Sbwkrq lv ehvvd!";
        int offset = 3;
        HashMap cipher = tester.generateCipher(offset);
        assertEquals("Characters are wrong!", "Python is bessa!", tester.decryptString(encryptedMessage, cipher));
    }

    @Test
    public void runTest() {
        Exercise07 tester = new Exercise07();
        String message = "Java ist aber auch nicht schlecht.";
        int offset = 3;
        assertEquals("Characters are wrong!", "Mdyd lvw dehu dxfk qlfkw vfkohfkw.", tester.run(offset, message));
    }
}