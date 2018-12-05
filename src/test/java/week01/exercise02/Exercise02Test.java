package week01.exercise02;

import static org.junit.Assert.*;

import org.junit.Test;

public class Exercise02Test {

    @Test
    public void searchWordTest() {
        Exercise02 tester = new Exercise02();
        String text = "Hello devAcademy this text should be capitalized";

        assertEquals( "Hello DevAcademy This Text Should Be Capitalized", tester.searchWord(text));
    }

    @Test
    public void searchWordSplitTest() {
        Exercise02 tester = new Exercise02();
        String text = "Hello devAcademy this text should be capitalized";

        assertEquals( "Hello DevAcademy This Text Should Be Capitalized", tester.searchWordSplit(text));
    }

}