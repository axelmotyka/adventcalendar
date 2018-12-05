package week01.exercise09;

import org.junit.Test;

import static org.junit.Assert.*;

public class Exercise09Test {

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

    @Test
    public void specialSmallStringTest() {
        Exercise09 tester = new Exercise09();

        String message = "a";

        assertEquals("Wrong result!", "a", tester.run(message));
    }
    @Test

    public void veryLongStringTest() {
        Exercise09 tester = new Exercise09();

        String message = "efghugfeugugufegugfweugfuifeguifgfiugegfipugfiufgeiwgfgiwegip wgigiwghigighfguefgiufguegifgfigigifgig wig" +
                "fgegffgfjfgegfkgfgjegföegfkjfgfkjegfkejwgfkjgkekewghkwghkwekgewkgkwghewgheiwhgioghkewghkewgkwehgewkghoeghgewewgkgekgezzzejvgjegewgewgekw" +
                "gfjewgfegfggegheggehgeigewigegggewggwfaaaaccccccfffffefufgugiufqgfqugfiqgfgfqgfiugffqguqgfuqwgfpqgpqgffpqgfqpgqgfpqgfgqgfufuguqggfqgqgfqfpg" +
                "gffggfqufgqwpfgpwqfpqgfqfqwzzzzzzgwfgfupfggpqgfpfugfwuguqgfqgfpqgfuqgwwqgfqwgufpwgffgffwfguqfqgfguiwgfifgfiwgfgfgffpgfgfwgfipqgfu";

        assertEquals("Wrong result!", "aaaacccccceeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeeefffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffggggggggggggggggggggggggggggggggggggggggggggggggggggggggggggggggggggggggggggggggggggggggggggggggggggggggggggggggggggggggggggggggggggggggggghhhhhhhhhhhhhhhiiiiiiiiiiiiiiiiiiiiiiiiiiiiiijjjjjjjjjkkkkkkkkkkkkkkkkkkkooppppppppppppppppppqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqquuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuuvwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwwzzzzzzzzz", tester.run(message));
    }
}