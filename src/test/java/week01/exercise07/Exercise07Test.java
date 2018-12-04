package week01.exercise07;

import org.junit.Test;

import java.util.HashMap;

import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.*;

public class Exercise07Test {

    @Test
    public void generateCipherTestWith0() {

        Exercise07 tester = new Exercise07();

        HashMap<Character, Character> expectedCipher = new HashMap<>();
        expectedCipher.put('A', 'A');
        expectedCipher.put('B', 'B');
        expectedCipher.put('C', 'C');
        expectedCipher.put('D', 'D');
        expectedCipher.put('E', 'E');
        expectedCipher.put('F', 'F');
        expectedCipher.put('G', 'G');
        expectedCipher.put('H', 'H');
        expectedCipher.put('I', 'I');
        expectedCipher.put('J', 'J');
        expectedCipher.put('K', 'K');
        expectedCipher.put('L', 'L');
        expectedCipher.put('M', 'M');
        expectedCipher.put('N', 'N');
        expectedCipher.put('O', 'O');
        expectedCipher.put('P', 'P');
        expectedCipher.put('Q', 'Q');
        expectedCipher.put('R', 'R');
        expectedCipher.put('S', 'S');
        expectedCipher.put('T', 'T');
        expectedCipher.put('U', 'U');
        expectedCipher.put('V', 'V');
        expectedCipher.put('W', 'W');
        expectedCipher.put('X', 'X');
        expectedCipher.put('Y', 'Y');
        expectedCipher.put('Z', 'Z');


        assertThat(tester.generateCipher(0), is(expectedCipher));
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