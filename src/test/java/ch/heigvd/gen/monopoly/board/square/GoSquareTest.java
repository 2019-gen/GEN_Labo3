package ch.heigvd.gen.monopoly.board.square;

import ch.heigvd.gen.monopoly.player.Player;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class GoSquareTest {
    private static GoSquare goSquare;
    private static Player player;

    @BeforeAll
    static void setUp() {
        goSquare = new GoSquare();
        player = new Player("test-player", "test-piece", new GoSquare());
    }

    @Test
    void playerCashShouldIncreaseAfterLandedOnGoSquare() {
        assertEquals(player.getNetWorth(), 1500);
        player.getPiece().setLocation(goSquare);
        player.getPiece().getLocation().landedOn(player);
        assertEquals(player.getNetWorth(), 1700);
    }
}
