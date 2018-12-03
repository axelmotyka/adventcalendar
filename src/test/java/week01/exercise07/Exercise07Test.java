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


        System.out.println("The Value is: " + hmap.get("1"));

        assertEquals(" Control the hash value expected value", "e", hmap.get("1"));


    }

    @Test
    public void encryptStringTest() {
        Exercise07 tester = new Exercise07();
    }

    @Test
    public void decryptStringTest() {
        Exercise07 tester = new Exercise07();
    }

    @Test
    public void runTest() {
        Exercise07 tester = new Exercise07();
    }
}