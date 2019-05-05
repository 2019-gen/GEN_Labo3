package ch.heigvd.gen.monopoly;

import ch.heigvd.gen.monopoly.square.Square;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class PieceTest {
    private static String pieceName;
    private static Square location;
    private static Piece piece;

    @BeforeAll
    static void setUp() {
        pieceName = "piece-test";
        location = new Square("location-test");
        piece = new Piece(pieceName, location);
    }

    @Test
    void pieceShouldHaveANameAndALocation() {
        assertEquals(pieceName, piece.getName());
        assertEquals(location, piece.getLocation());
    }

    @Test
    void pieceLocationShouldBeSet() {
        Square newLocation = new Square("location-test-2");
        piece.setLocation(newLocation);
        assertEquals(newLocation, piece.getLocation());
    }
}
