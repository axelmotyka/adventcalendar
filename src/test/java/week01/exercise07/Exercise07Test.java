package week01.exercise07;

import org.junit.Test;

import java.util.HashMap;

import static org.junit.Assert.*;

public class Exercise07Test {

    @Test
    public void generateCipherTest() {

        Exercise07 tester = new Exercise07();
        HashMap h = tester.generateCipher(3);
        assertEquals('D', h.get('A'));
        assertEquals('B', h.get('Y'));
        assertEquals('c', h.get('z'));
        assertEquals('z', h.get('w'));
        assertEquals(52, h.size());
    }

    @Test
    public void encryptStringTest() {

        Exercise07 tester = new Exercise07();
        HashMap h = tester.generateCipher(5);
        assertEquals("Ymnx jchjwhnxj nx f unjhj tk Hfpj.", tester.encryptString("This excercise is a piece of Cake.", h));
    }

    @Test
    public void decryptStringTest() {

        Exercise07 tester = new Exercise07();
        HashMap h = tester.generateCipher(5);
        assertEquals("This excercise is a piece of Cake.", tester.decryptString("Ymnx jchjwhnxj nx f unjhj tk Hfpj.", h));
    }

    @Test
    public void runTest() {

        Exercise07 tester = new Exercise07();
        assertEquals("Kyzj zj r kvjk dvjjrxv.", tester.run(17, "This is a test message."));

    }
}