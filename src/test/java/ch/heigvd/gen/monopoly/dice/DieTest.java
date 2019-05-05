package ch.heigvd.gen.monopoly.dice;

import org.junit.jupiter.api.RepeatedTest;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class DieTest {
    @Test
    void faceValueShouldBeZeroWithoutRoll() {
        Die d = new Die();
        assertEquals(0, d.getFaceValue());
    }

    @RepeatedTest(50)
    void faceValueShouldBeBetween1andUpperBound() {
        Die d = new Die();

        d.roll();
        assertTrue(d.getFaceValue() >= 1 && d.getFaceValue() <= d.getUpperBound());
    }
}
