package ch.heigvd.gen.monopoly.board.square;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class RegularSquareTest {
    private static RegularSquare square;
    private static String squareName;

    @BeforeAll
    static void setUp() {
        squareName = "test";
        square = new RegularSquare(squareName);
    }

    @Test
    void aRegularSquareShouldHaveAName() {
        assertEquals(square.getName(), squareName);
    }
}
