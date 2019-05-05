package ch.heigvd.gen.monopoly.board;

import ch.heigvd.gen.monopoly.board.square.Square;
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
        int nbrOfSquares = board.getNbrOfSquares();

        // Liste des noms selon la spec
        String[] specNames = new String[nbrOfSquares];
        specNames[0] = "Go";
        for (int i = 1; i < nbrOfSquares; i++) {
            specNames[i] = "Square " + i;
        }
        specNames[4] = "IncomeTax";
        specNames[10] = "Jail";
        specNames[30] = "GoToJail";

        // Liste des noms effectifs
        String[] effectiveNames = new String[nbrOfSquares];
        ArrayList<Square> squares = board.getSquares();
        for (int i = 0; i < squares.size(); i++) {
            effectiveNames[i] = squares.get(i).getName();
        }

        assertArrayEquals(effectiveNames, specNames);
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