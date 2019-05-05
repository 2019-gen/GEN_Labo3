package ch.heigvd.gen.monopoly;

import java.util.ArrayList;

/**
 * Cette classe représente le plateau dans le jeu Monopoly
 *
 * @author Luc Wachter
 * @version 1.0
 * @since 05.05.2019
 */
public class Board {
    private static int NBR_OF_SQUARES = 40;

    private ArrayList<Square> squares = new ArrayList<>(); // Liste ordonnée de cases du plateau

    /**
     * Constructeur : génère les cases du plateau
     */
    Board() {
        // La première case s'appelle Go
        squares.add(new Square("Go"));

        // Les autres sont numérotées
        for (int i = 1; i < NBR_OF_SQUARES; i++) {
            squares.add(new Square("Square " + i));
        }
    }

    /**
     * Permet d'obtenir la case sur laquelle la pièce va se déplacer
     *
     * @param oldLoc La case sur laquelle la pièce se trouve
     * @param fvTot  Le total obtenu après avoir lancé les dés
     * @return La case sur laquelle la pièce doit se déplacer
     */
    public Square getSquare(Square oldLoc, int fvTot) {
        return squares.get((squares.indexOf(oldLoc) + fvTot) % NBR_OF_SQUARES);
    }

    /**
     * Simple getter pour le nombre de cases dans le plateau
     *
     * @return Le nombre de cases dans le plateau
     */
    public int getNbrOfSquares() {
        return NBR_OF_SQUARES;
    }

    /**
     * Simple getter pour la liste de cases dans le plateau
     *
     * @return La liste de cases dans le plateau
     */
    public ArrayList<Square> getSquares() {
        return squares;
    }
}
