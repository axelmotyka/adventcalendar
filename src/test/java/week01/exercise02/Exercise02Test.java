package week01.exercise02;

import static org.junit.Assert.*;

import org.junit.Test;

public class Exercise02Test {

    @Test
    public void runMethodReturnsCapitalizedString() {
        Exercise02 tester = new Exercise02();
        String text = "Hello devAcademy this text should be capitalized";

        assertEquals("String is not capitalized!", "HELLO DEVACADEMY THIS TEXT SHOULD BE CAPITALIZED", tester.run(text));
    }

}