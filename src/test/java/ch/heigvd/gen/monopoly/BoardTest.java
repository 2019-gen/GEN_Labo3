package ch.heigvd.gen.monopoly;

import ch.heigvd.gen.monopoly.square.Square;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;

import static org.junit.jupiter.api.Assertions.*;

/**
 * Tests unitaires pour la classe représentant le plateau du Monopoly
 */
class BoardTest {
    private static Board board;

    @BeforeAll
    static void setUp() {
        board = new Board();
    }

    @Test
    void aBoardShouldHaveNSquares() {
        assertEquals(board.getSquares().size(), board.getNbrOfSquares());
    }

    @Test
    void squareNamesShouldFollowSpec() {
        // Liste des noms selon la spec
        ArrayList<String> names = new ArrayList<>();
        names.add("Go");
        for (int i = 1; i < board.getNbrOfSquares(); i++) {
            names.add("Square " + i);
        }

        names.set(4, "IncomeTax");
        names.set(10, "Jail");
        names.set(30, "GoToJail");

        ArrayList<Square> squares = board.getSquares();
        for (int i = 0; i < board.getNbrOfSquares(); i++) {
            assertEquals(names.get(i), squares.get(i).getName());
        }
    }

    @Test
    void getSquareShouldReturnCorrectSquare() {
        // La pièce se trouvait sur la case 12
        Square oldLocation = board.getSquares().get(13);
        // Le joueur a fait un 8 avec les dés
        Square newLocation = board.getSquare(oldLocation, 8);

        assertEquals(newLocation, board.getSquares().get(21));
    }

    @Test
    void getSquareShouldCycleAroundTheBoard() {
        // La pièce se trouvait sur la case 36
        Square oldLocation = board.getSquares().get(37);
        // Le joueur a fait un 7 avec les dés
        Square newLocation = board.getSquare(oldLocation, 7);

        assertEquals(newLocation, board.getSquares().get(4));
    }
}