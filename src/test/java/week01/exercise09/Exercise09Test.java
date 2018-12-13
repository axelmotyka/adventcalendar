package week01.exercise09;

import org.junit.Test;

import static org.junit.Assert.*;

public class Exercise09Test {

    @Test
    public void shortStringTest() {
        Exercise09_neu tester = new Exercise09_neu();

        String message = "hallo";

        assertEquals("Wrong result!", "ahllo", tester.run(message));
    }

    @Test
    public void LongStringTest() {
        Exercise09_neu tester = new Exercise09_neu();

        String message = "hallo devacademy richtig sortiert steht das z am ende";

        assertEquals("Wrong result!", "aaaaaccddddeeeeeeghhhiiillmmnoorrrssstttttvyz", tester.run(message));
    }
}