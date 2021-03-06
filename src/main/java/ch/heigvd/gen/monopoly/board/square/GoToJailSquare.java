package ch.heigvd.gen.monopoly.board.square;

import ch.heigvd.gen.monopoly.player.Player;

/**
 * Cette classe représente la case GoToJailSquare du jeux Monopoly
 *
 * @author Mateo Tutic
 * @version 1.0
 * @since 05.05.2019
 */
public class GoToJailSquare extends Square {
    private Square jail;    // La case représentant la prison

    /**
     * Constructeur
     *
     * @param jail La case représentant la prison
     */
    public GoToJailSquare(Square jail) {
        super("GoToJail");
        this.jail = jail;
    }

    @Override
    public void landedOn(Player p) {
        p.getPiece().setLocation(jail);
        System.out.println("Aller simple en prison !");
    }
}
