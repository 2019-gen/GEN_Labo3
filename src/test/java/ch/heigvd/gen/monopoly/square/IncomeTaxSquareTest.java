package ch.heigvd.gen.monopoly.square;

import ch.heigvd.gen.player.Player;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class IncomeTaxSquareTest {
    private static IncomeTaxSquare incomeTaxSquare;
    private static Player player;

    @BeforeEach
    void initPlayer() {
        player = new Player("test-player", "test-piece", new GoSquare());
    }

    @BeforeAll
    static void setUp() {
        incomeTaxSquare = new IncomeTaxSquare();
    }

    @Test
    void playerShouldPay150AfterLandedOnIncomeTaxSquare() {
        player.getPiece().setLocation(incomeTaxSquare);
        player.getPiece().getLocation().landedOn(player);
        assertEquals(player.getNetWorth(), 1350);
    }

    @Test
    void playerShouldPay200AfterLandedOnIncomeTaxSquare() {
        player.addCash(1000);   // Player cash : 2500
        player.getPiece().setLocation(incomeTaxSquare);
        player.getPiece().getLocation().landedOn(player);
        assertEquals(player.getNetWorth(), 2300);
    }
}
