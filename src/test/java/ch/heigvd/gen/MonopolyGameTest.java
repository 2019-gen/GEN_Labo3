package ch.heigvd.gen;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertThrows;
import static org.junit.jupiter.api.Assertions.assertTrue;

/**
 * Unit test for simple MononpolyGame.
 */
public class MonopolyGameTest {
    @Test
    public void numberOfPlayerShouldBeAcceptable() {
        String[] OnePlayer = new String[1];
        String[] TenPlayer = new String[10];

        // trop peu de joueurs
        assertThrows(IllegalArgumentException.class, () -> {
            new MonopolyGame(OnePlayer);
        });

        // trop de joeurs
        assertThrows(IllegalArgumentException.class, () -> {
            new MonopolyGame(TenPlayer);
        });
    }
}
