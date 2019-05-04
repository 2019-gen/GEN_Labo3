package ch.heigvd.gen;

import java.util.LinkedList;

/**
 * Cette classe représente le jeu du monopoly. C'est dans cette classe
 * que le déroulement du jeu est défini.
 *
 * @author Loris Gilliand
 * @version 1.0
 * @since 03.05.2019
 */
public class MonopolyGame {
    private static final int NUMB_OF_ROUNDS = 20;
    private static final int NUMB_OF_DICE = 2;
//    private final Board board;
//    private final LinkedList<Die> dice = new LinkedList<Die>();
//    private final LinkedList<Player> players = new LinkedList<Player>();

    private int currentRound = 0;

    /**
     * Constructeur du jeu monopoly. Crée les joueurs et les dés.
     *
     * @param players noms des joueurs
     */
    public MonopolyGame(String[] players) throws IllegalArgumentException {
        if (players.length < 2 || players.length > 8) {
            throw new IllegalArgumentException("Nombre de joueurs incompatible");
        }

        for (String playerName : players) {
//            this.players.add(new Player(playerName));
        }

        for (int i = 0; i < NUMB_OF_DICE; ++i) {
//            dice.add(new Die());
        }

//        board = new Board();
    }

    /**
     * Méthode qui lance le jeu
     */
    void playGame() {
        for (; currentRound < NUMB_OF_ROUNDS; ++currentRound) {
            playRound();
        }
    }

    /**
     * Méthode qui réalise un tour par joueur
     */
    void playRound() {
        System.out.println("Debut du tour+" + ++currentRound + " : ");
//        for (Player player : players) {
//            player.takeTurn();
//        }
    }

    /**
     * Point d'entrée du programme.
     *
     * @param args liste de nom des différents joueurs
     */
    public static void main(String[] args) {
        MonopolyGame mg = new MonopolyGame(args);
        mg.playGame();
    }
}
