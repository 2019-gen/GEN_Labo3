package ch.heigvd.gen.monopoly.player;

import ch.heigvd.gen.monopoly.Board;
import ch.heigvd.gen.monopoly.dice.Cup;
import ch.heigvd.gen.monopoly.Piece;
import ch.heigvd.gen.monopoly.square.Square;

/**
 * Cette classe représente un joueur de monopoly
 *
 * @author Loris Gilliand, Luc Wachter
 * @version 1.0
 * @since 05.05.2019
 */
public class Player {
    private final String name; // Nom du joueur
    private final Piece piece; // Pièce déplacée par le joueur
    private int cash; // Argent en possession du joueur

    /**
     * Constructeur de joueur
     *
     * @param name Le nom du joueur
     * @param pieceName La pièce déplacée par le joueur
     * @param startSquare La case sur laquelle le joueur va commencer
     */
    public Player(String name, String pieceName, Square startSquare) {
        this.name = name;
        this.piece = new Piece(pieceName, startSquare);
        this.cash = 1500;
    }

    /**
     * Méthode gérant le tour du joueur
     *
     * @param board Le plateau de jeu
     * @param cup Le bol pour lancer les dés
     */
    public void takeTurn(Board board, Cup cup) {
        System.out.println(this + " commence son tour...");

        // Le joueur lance les dés
        cup.roll();
        int score = cup.getTotal();

        System.out.println(this + " a fait un lancé de " + score);

        // La pièce est déplacée
        Square oldLocation = piece.getLocation();
        piece.setLocation(board.getSquare(oldLocation, score));

        // Action spéciale à faire en fonction de la case sur laquelle on tombe
        piece.getLocation().landedOn(this);

        System.out.println(this + " avance sa pièce " + piece + " de la case " + oldLocation + " a la case "
                + piece.getLocation());

        System.out.println(this + " a " + cash + "$");
    }

    /**
     * Surcharge de toString pour l'affichage d'un joueur
     *
     * @return Le nom du joueur
     */
    @Override
    public String toString() {
        return name;
    }

    /**
     * Ajouter de l'argent au joueur
     *
     * @param value Le montant à ajouter au joueur
     * @throws IllegalArgumentException En cas de montant négatif
     */
    public void addCash(int value) throws IllegalArgumentException {
        if (value < 0) {
            throw new IllegalArgumentException("Impossible d'ajouter du cash négatif");
        }

        cash += value;
    }

    /**
     * Retirer de l'argent au joueur
     *
     * @param value Le montant à retirer au joueur
     * @throws IllegalArgumentException En cas de montant supérieur au solde du joueur
     */
    public void reduceCash(int value) {
        if (cash < value) {
            throw new IllegalArgumentException("Impossible d'avoir du cash en négatif");
        }

        cash -= value;
    }

    /**
     * Simple getter pour la pièce du joueur
     *
     * @return La pièce déplacée par le joueur
     */
    public Piece getPiece() {
        return piece;
    }

    /**
     * Simple getter pour l'argent du joueur
     *
     * @return Le solde du joueur
     */
    public int getNetWorth() {
        return cash;
    }
}
