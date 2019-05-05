package ch.heigvd.gen.monopoly.square;

import ch.heigvd.gen.monopoly.player.Player;

/**
 * Cette classe représente la case IncomeTax du jeux Monopoly
 *
 * @author Mateo Tutic
 * @version 1.0
 * @since 05.05.2019
 */
public class IncomeTaxSquare extends Square {
    /**
     * Constructeur
     */
    public IncomeTaxSquare() {
        super("IncomeTax");
    }

    @Override
    public void landedOn(Player p) {
        p.reduceCash(Math.min(200, p.getNetWorth() / 10));
    }
}
