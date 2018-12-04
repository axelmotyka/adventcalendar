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
    public void generateCipherTestWith1() {

        Exercise07 tester = new Exercise07();

        HashMap<Character, Character> expectedCipher = new HashMap<>();
        expectedCipher.put('A', 'B');
        expectedCipher.put('B', 'C');
        expectedCipher.put('C', 'D');
        expectedCipher.put('D', 'E');
        expectedCipher.put('E', 'F');
        expectedCipher.put('F', 'G');
        expectedCipher.put('G', 'H');
        expectedCipher.put('H', 'I');
        expectedCipher.put('I', 'J');
        expectedCipher.put('J', 'K');
        expectedCipher.put('K', 'L');
        expectedCipher.put('L', 'M');
        expectedCipher.put('M', 'N');
        expectedCipher.put('N', 'O');
        expectedCipher.put('O', 'P');
        expectedCipher.put('P', 'Q');
        expectedCipher.put('Q', 'R');
        expectedCipher.put('R', 'S');
        expectedCipher.put('S', 'T');
        expectedCipher.put('T', 'U');
        expectedCipher.put('U', 'V');
        expectedCipher.put('V', 'W');
        expectedCipher.put('W', 'X');
        expectedCipher.put('X', 'Y');
        expectedCipher.put('Y', 'Z');
        expectedCipher.put('Z', 'A');

        assertThat(tester.generateCipher(1), is(expectedCipher));
    }

    @Test
    public void generateCipherTestWith3() {

        Exercise07 tester = new Exercise07();

        HashMap<Character, Character> expectedCipher = new HashMap<>();
        expectedCipher.put('A', 'D');
        expectedCipher.put('B', 'E');
        expectedCipher.put('C', 'F');
        expectedCipher.put('D', 'G');
        expectedCipher.put('E', 'H');
        expectedCipher.put('F', 'I');
        expectedCipher.put('G', 'J');
        expectedCipher.put('H', 'K');
        expectedCipher.put('I', 'L');
        expectedCipher.put('J', 'M');
        expectedCipher.put('K', 'N');
        expectedCipher.put('L', 'O');
        expectedCipher.put('M', 'P');
        expectedCipher.put('N', 'Q');
        expectedCipher.put('O', 'R');
        expectedCipher.put('P', 'S');
        expectedCipher.put('Q', 'T');
        expectedCipher.put('R', 'U');
        expectedCipher.put('S', 'V');
        expectedCipher.put('T', 'W');
        expectedCipher.put('U', 'X');
        expectedCipher.put('V', 'Y');
        expectedCipher.put('W', 'Z');
        expectedCipher.put('X', 'A');
        expectedCipher.put('Y', 'B');
        expectedCipher.put('Z', 'C');

        assertThat(tester.generateCipher(3), is(expectedCipher));
    }

    @Test
    public void generateCipherTestWith26() {

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

        assertThat(tester.generateCipher(26), is(expectedCipher));
    }

    @Test
    public void generateCipherTestWith29() {

        Exercise07 tester = new Exercise07();

        HashMap<Character, Character> expectedCipher = new HashMap<>();
        expectedCipher.put('A', 'D');
        expectedCipher.put('B', 'E');
        expectedCipher.put('C', 'F');
        expectedCipher.put('D', 'G');
        expectedCipher.put('E', 'H');
        expectedCipher.put('F', 'I');
        expectedCipher.put('G', 'J');
        expectedCipher.put('H', 'K');
        expectedCipher.put('I', 'L');
        expectedCipher.put('J', 'M');
        expectedCipher.put('K', 'N');
        expectedCipher.put('L', 'O');
        expectedCipher.put('M', 'P');
        expectedCipher.put('N', 'Q');
        expectedCipher.put('O', 'R');
        expectedCipher.put('P', 'S');
        expectedCipher.put('Q', 'T');
        expectedCipher.put('R', 'U');
        expectedCipher.put('S', 'V');
        expectedCipher.put('T', 'W');
        expectedCipher.put('U', 'X');
        expectedCipher.put('V', 'Y');
        expectedCipher.put('W', 'Z');
        expectedCipher.put('X', 'A');
        expectedCipher.put('Y', 'B');
        expectedCipher.put('Z', 'C');

        assertThat(tester.generateCipher(29), is(expectedCipher));
    }

    @Test
    public void generateCipherTestWith55() {

        Exercise07 tester = new Exercise07();

        HashMap<Character, Character> expectedCipher = new HashMap<>();
        expectedCipher.put('A', 'D');
        expectedCipher.put('B', 'E');
        expectedCipher.put('C', 'F');
        expectedCipher.put('D', 'G');
        expectedCipher.put('E', 'H');
        expectedCipher.put('F', 'I');
        expectedCipher.put('G', 'J');
        expectedCipher.put('H', 'K');
        expectedCipher.put('I', 'L');
        expectedCipher.put('J', 'M');
        expectedCipher.put('K', 'N');
        expectedCipher.put('L', 'O');
        expectedCipher.put('M', 'P');
        expectedCipher.put('N', 'Q');
        expectedCipher.put('O', 'R');
        expectedCipher.put('P', 'S');
        expectedCipher.put('Q', 'T');
        expectedCipher.put('R', 'U');
        expectedCipher.put('S', 'V');
        expectedCipher.put('T', 'W');
        expectedCipher.put('U', 'X');
        expectedCipher.put('V', 'Y');
        expectedCipher.put('W', 'Z');
        expectedCipher.put('X', 'A');
        expectedCipher.put('Y', 'B');
        expectedCipher.put('Z', 'C');

        assertThat(tester.generateCipher(55), is(expectedCipher));
    }

    @Test
    public void runTestWith0() {

        Exercise07 tester = new Exercise07();

        assertEquals("ABC", tester.run(0, "ABC"));
    }

    @Test
    public void runTestWith1() {

        Exercise07 tester = new Exercise07();

        assertEquals("BCD", tester.run(1, "ABC"));
    }

    @Test
    public void runTestWith3() {

        Exercise07 tester = new Exercise07();

        assertEquals("DEF", tester.run(3, "ABC"));
    }

    @Test
    public void runTestWith26() {

        Exercise07 tester = new Exercise07();

        assertEquals("ABC", tester.run(26, "ABC"));
    }

    @Test
    public void runTestWith29() {

        Exercise07 tester = new Exercise07();

        assertEquals("DEF", tester.run(29, "ABC"));
    }

    @Test
    public void runTestWith55() {

        Exercise07 tester = new Exercise07();

        assertEquals("DEF", tester.run(55, "ABC"));
    }
}