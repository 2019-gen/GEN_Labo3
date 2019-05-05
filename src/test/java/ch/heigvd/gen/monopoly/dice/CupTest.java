package ch.heigvd.gen.monopoly.dice;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CupTest {
    private static int NBR_OF_DICE = 4;
    private static Cup cup;

    @BeforeAll
    static void setUp() {
        cup = new Cup(NBR_OF_DICE);
    }

    @Test
    void totalShouldBeZeroWithoutRoll() {
        assertEquals(0, cup.getTotal());
    }

    @Test
    void aCupShouldHaveTheCorrectNbrOfDice() {
        assertEquals(cup.getDice().size(), NBR_OF_DICE);
    }
}