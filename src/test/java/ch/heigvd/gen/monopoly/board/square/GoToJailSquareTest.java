package ch.heigvd.gen.monopoly.board.square;

import ch.heigvd.gen.monopoly.player.Player;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class GoToJailSquareTest {
    private static GoToJailSquare goToJailSquare;
    private static RegularSquare jail;
    private static Player player;

    @BeforeAll
    static void setUp() {
        jail = new RegularSquare("jail");
        goToJailSquare = new GoToJailSquare(jail);
        player = new Player("test-player", "test-piece", new GoSquare());
    }

    @Test
    void playerShouldGoToJailAfterLandedOnGoToJailSquare() {
        player.getPiece().setLocation(goToJailSquare);
        player.getPiece().getLocation().landedOn(player);
        assertEquals(player.getPiece().getLocation(), jail);
    }
}
