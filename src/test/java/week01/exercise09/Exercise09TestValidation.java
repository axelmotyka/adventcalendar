package week01.exercise09;

import org.junit.Test;

import static org.junit.Assert.*;

public class Exercise09TestValidation {

    @Test
    public void shortStringTest() {
        Exercise09 tester = new Exercise09();

        String message = "hallo";

        assertEquals("Wrong result!", "ahllo", tester.run(message));
    }

    @Test
    public void LongStringTest() {
        Exercise09 tester = new Exercise09();

        String message = "hallo devacademy richtig sortiert steht das z am ende";

        assertEquals("Wrong result!", "aaaaaccddddeeeeeeghhhiiillmmnoorrrssstttttvyz", tester.run(message));
    }
}