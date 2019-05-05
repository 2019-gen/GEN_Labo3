package ch.heigvd.gen.monopoly.dice;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;

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

    @ParameterizedTest
    @ValueSource(ints = {2, 4, 10})
    void aCupShouldHaveTheCorrectNbrOfDice(int nbrOfDice) {
        Cup cup = new Cup(nbrOfDice);
        assertEquals(cup.getDice().size(), nbrOfDice);
    }
}