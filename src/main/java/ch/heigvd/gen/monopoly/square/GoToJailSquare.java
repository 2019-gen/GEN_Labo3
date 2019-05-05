package ch.heigvd.gen.monopoly.square;

import ch.heigvd.gen.player.Player;

/**
 * Cette classe représente la case GoToJail du jeux Monopoly
 *
 * @author Mateo Tutic
 * @version 1.0
 * @since 05.05.2019
 */
public class GoToJail extends Square {
    private Square jail;    // La case représentant la prison

    /**
     * Constructeur
     *
     * @param jail La case représentant la prison
     */
    public GoToJail(Square jail) {
        super("GoToJail");
        this.jail = jail;
    }

    @Override
    public void landedOn(Player p) {
        p.getPiece().setLocation(jail);
    }
}
