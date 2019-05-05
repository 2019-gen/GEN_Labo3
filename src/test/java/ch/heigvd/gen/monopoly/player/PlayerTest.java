package ch.heigvd.gen.monopoly.player;

import ch.heigvd.gen.monopoly.board.Board;
import ch.heigvd.gen.monopoly.dice.Cup;
import ch.heigvd.gen.monopoly.square.RegularSquare;
import ch.heigvd.gen.monopoly.square.Square;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

/**
 * Tests unitaires pour la classe Player
 */
public class PlayerTest {
    private static Player player;
    private static RegularSquare square = new RegularSquare("Go");

    @BeforeEach
    void setUp()  {
        player = new Player("Test", "Chevalier", square);
    }

    @Test
    void aPlayerShouldHaveCorrectAttributesAfterConstruction() {
        assertEquals(player.toString(), "Test");
        assertEquals(player.getPiece().getName(), "Chevalier");
        assertEquals(player.getNetWorth(), 1500);
        assertEquals(player.getPiece().getLocation(), square);
    }

    @Test
    void addingCashShouldWork() {
        player.addCash(1000);
        assertEquals(player.getNetWorth(), 2500);
    }

    @Test
    void addingNegativeAmountsOfCashShouldBeImpossible() {
        assertThrows(IllegalArgumentException.class, () -> {
            player.addCash(-123);
        });
    }

    @Test
    void reducingCashShouldWork() {
        player.reduceCash(1000);
        assertEquals(player.getNetWorth(), 500);
    }

    @Test
    void reducingCashUnderZeroShouldBeImpossible() {
        assertThrows(IllegalArgumentException.class, () -> {
            player.reduceCash(1501);
        });
    }

    @Test
    void takeTurnsShouldMakeTheGameAdvance() {
        Board board = new Board();
        Cup cup = new Cup(2);

        Square oldLocation = player.getPiece().getLocation();
        player.takeTurn(board, cup);

        assertNotEquals(oldLocation, player.getPiece().getLocation());
    }
}
