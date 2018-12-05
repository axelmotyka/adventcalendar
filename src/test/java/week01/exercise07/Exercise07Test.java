package week01.exercise07;

import org.junit.Test;

import java.util.HashMap;

import static org.junit.Assert.*;
import static org.junit.Assert.assertArrayEquals;

public class Exercise07Test {

    @Test
    public void generateCipherTest() {
        Exercise07 tester = new Exercise07();
        HashMap<String, String> hmap = tester.generateCipher(5);


        System.out.println("The Value is: " + hmap.get("e"));
        assertEquals(" Control the hash map value expected value is j because e + 5 is j", "j", hmap.get("e"));
    }

    @Test
    public void encryptStringTest() {

        Exercise07 tester = new Exercise07();
        //Generate an hash map
        HashMap<String, String> hmap = tester.generateCipher(1);
        // Test that the new string is encrypted
        assertEquals("bcdefg hij klmn!!!",tester.encryptString("abcdef ghi Jklm!!!",hmap));
    }

    @Test
    public void decryptStringTest() {

        Exercise07 tester = new Exercise07();
        // Generate an hash map
        HashMap<String, String> hmap = tester.generateCipher(1);
        // Test that the given Sting is decrypted
        assertEquals("abcdef ghi jklm!!!",tester.decryptString("bcdefg hij klmn!!!",hmap));

    }

    @Test
    public void runTest() {
        Exercise07 tester = new Exercise07();
        // Test all together that hashmap is generated and that the text will be crypted .
        assertEquals("bcdefg hij klmn!!!",tester.run(1,"abcdef ghi Jklm!!!"));
    }
}