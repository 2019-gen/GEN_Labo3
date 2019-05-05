package ch.heigvd.gen.monopoly.board;

import ch.heigvd.gen.monopoly.square.*;

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
    public Board() {
        // Création de la première case
        squares.add(new GoSquare());

        // Création des cases basiques
        for (int i = 1; i < NBR_OF_SQUARES; i++) {
            squares.add(new RegularSquare("Square " + i));
        }

        // Création des cases spéciales
        RegularSquare jail = new RegularSquare("Jail"); // Case représentant la prison
        squares.set(10, jail);
        squares.set(30, new GoToJailSquare(jail));
        squares.set(4, new IncomeTaxSquare());
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
