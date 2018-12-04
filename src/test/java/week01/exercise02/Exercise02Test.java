package week01.exercise02;

import static org.junit.Assert.*;

import org.junit.Test;

public class Exercise02Test {

    @Test
    public void runMethodReturnsCapitalizedString() {
        Exercise02 tester = new Exercise02();
        String text = "Hello devAcademy this text should be capitalized";

        assertEquals("String is not capitalized!", "Hello DevAcademy This Text Should Be Capitalized", tester.run(text));
    }
    @Test
    public void runMethodReturnsCapitalizedString2() {
        Exercise02 tester = new Exercise02();
        String text = "Hello devAcademy this text should be capitalized";

        assertEquals("String is not capitalized!", "Hello DevAcademy This Text Should Be Capitalized", tester.run2(text));
    }
}