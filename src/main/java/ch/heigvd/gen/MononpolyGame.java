package ch.heigvd.gen;

import java.util.LinkedList;

/**
 * Cette classe représente le jeu du monopoly. C'est dans cette classe
 * que le déroulement du jeu est défini.
 * @author Loris Gilliand
 * @version 1.0
 * @since 03.05.2019
 */
public class MononpolyGame {
    private final int NUMB_OF_ROUNDS = 20;
    private final int NUMB_OF_DICE = 2;
    private final Board board;
    private final LinkedList<Die> dice = new LinkedList<Die>();
    private final LinkedList<Player> players = new LinkedList<Player>();

    /**
     * Constructeur du jeu monopoly. Crée les joueurs et les dés.
     * @param players noms des joueurs
     */
    public MononpolyGame(String[] players) {
        for (String playerName : players) {
            this.players.add(new Player(playerName));
        }

        for (int i = 0; i < NUMB_OF_DICE; ++i) {
            dice.add(new Die());
        }
    }

    public static void main( String[] args ) {
        System.out.println( "Hello World!" );
    }
}
