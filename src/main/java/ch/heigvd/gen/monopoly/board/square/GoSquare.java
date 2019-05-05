package ch.heigvd.gen.monopoly.board.square;

import ch.heigvd.gen.monopoly.player.Player;

/**
 * Cette classe représente la case Go dans le jeux Monopoly
 *
 * @author Mateo Tutic
 * @version 1.0
 * @since 05.05.2019
 */
public class GoSquare extends Square {
    private static final int REWARD = 200;

    /**
     * Constructeur
     */
    public GoSquare() {
        super("Go");
    }

    @Override
    public void landedOn(Player p) {
        // Ajout de 200$ au joueur
        p.addCash(REWARD);
        System.out.println("Case départ, récompense : " + REWARD);
    }
}
