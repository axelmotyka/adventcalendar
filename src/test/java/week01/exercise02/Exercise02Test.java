package week01.exercise02;

import static org.junit.Assert.*;

import org.junit.Test;

import week01.exercise01.Exercise01;

public class Exercise02Test {

    //@Test
    //public void runMethodReturnsCapitalizedString() {
        //Exercise02 tester = new Exercise02();

        //String text = "Hello dev";

        //assertEquals("HELLO DEV", tester.run(text));

    //}
    @Test
    public void searchWordTest() {
        Exercise02 tester = new Exercise02();

        String text = "Hello dev this is your";

        assertEquals("Hello Dev This Is Your", tester.searchWord(text));

    }
}

