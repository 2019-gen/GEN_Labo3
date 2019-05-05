package ch.heigvd.gen.monopoly.square;

import ch.heigvd.gen.monopoly.square.Square;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class SquareTest {
    private static Square square;
    private static String squareName;

    @BeforeAll
    static void setUp() {
        squareName = "test";
        square = new RegularSquare(squareName);
    }

    @Test
    void aSquareShouldHaveAName() {
        assertEquals(square.getName(), squareName);
    }
}
