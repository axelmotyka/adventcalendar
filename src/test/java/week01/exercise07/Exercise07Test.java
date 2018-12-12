package week01.exercise07;

import org.junit.Test;

import java.util.HashMap;

import static org.junit.Assert.*;

public class Exercise07Test {

    @Test
    public void generateCipherTest() {
        Exercise07 tester = new Exercise07();
        HashMap<String, String> result = tester.generateCipher(1);
        assertEquals("check cipher", "B", result.get("A"));
        assertEquals("check cipher", "C", result.get("B"));
        assertEquals("check cipher", "A", result.get("Z"));


        HashMap<String, String> result2 = tester.generateCipher(2);
        assertEquals("check cipher", "C", result2.get("A"));
        assertEquals("check cipher", "D", result2.get("B"));
        assertEquals("check cipher", "A", result2.get("Y"));
        assertEquals("check cipher", "B", result2.get("Z"));

        HashMap<String, String> result5 = tester.generateCipher(5);
        assertEquals("check cipher", "F", result5.get("A"));
        assertEquals("check cipher", "G", result5.get("B"));
        assertEquals("check cipher", "D", result5.get("Y"));
        assertEquals("check cipher", "E", result5.get("Z"));


        HashMap<String, String> resultMinus1 = tester.generateCipher(-1);
        assertEquals("check cipher", "Z", resultMinus1.get("A"));
        assertEquals("check cipher", "A", resultMinus1.get("B"));
        assertEquals("check cipher", "X", resultMinus1.get("Y"));
        assertEquals("check cipher", "Y", resultMinus1.get("Z"));


        HashMap<String, String> resultMinus3 = tester.generateCipher(-3);
        assertEquals("check cipher", "X", resultMinus3.get("A"));
        assertEquals("check cipher", "Y", resultMinus3.get("B"));
        assertEquals("check cipher", "V", resultMinus3.get("Y"));
        assertEquals("check cipher", "W", resultMinus3.get("Z"));

    }

    @Test
    public void encryptStringTest() {
        Exercise07 tester = new Exercise07();
        String result = tester.encryptString("Julius Caesar", tester.generateCipher(1));
        assertEquals("JULIUS CAESAR = ", "KVMJVT DBFTBS", result);
    }

    @Test
    public void decryptStringTest() {
        Exercise07 tester = new Exercise07();
        String result = tester.decryptString("KVMJVT DBFTBS", tester.generateCipher(1));
        assertEquals("KVMJVT DBFTBS = ", "JULIUS CAESAR", result);
    }

    @Test
    public void runTest() {
        Exercise07 tester = new Exercise07();
        String result = tester.encryptString("MESUT CEVIK", tester.generateCipher(5));
        assertEquals("MESUT CEVIK = ", "RJXZY HJANP", result);
    }
}