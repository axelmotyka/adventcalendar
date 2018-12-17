package week02.exercise12;

import org.junit.Test;
import week01.exercise02.Exercise02;

import static org.junit.Assert.assertEquals;

public class Exercise12Test {

    @Test
    public void runMethodReturnsCapitalizedString() {
        Exercise02 tester = new Exercise02();
        String text = "Hello devAcademy this text should be capitalized";

        assertEquals("String is not capitalized!", "Hello DevAcademy This Text Should Be Capitalized", tester.run(text));
    }

}