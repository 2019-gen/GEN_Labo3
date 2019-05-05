package ch.heigvd.gen.monopoly.board.square;

import ch.heigvd.gen.monopoly.player.Player;

/**
 * Cette classe représente une case dans le jeux Monopoly
 *
 * @author Mateo Tutic
 * @version 1.0
 * @since 03.05.2019
 */
public abstract class Square {
    private final String name;    // Nom de la case

    /**
     * Constructeur
     *
     * @param name Nom de la case
     */
    public Square(String name) {
        this.name = name;
    }

    /**
     * Permet d'obtenir le nom de la case
     *
     * @return Le nom de la case
     */
    public String getName() {
        return name;
    }

    /**
     * Surcharge de toString pour obtenir le nom de la case
     *
     * @return Le nom de la case
     */
    @Override
    public String toString() {
        return name;
    }

    /**
     * Permet de réaliser une action spéciale en fonction de la case
     *
     * @param p Joueur qui se trouve sur la case
     */
    public abstract void landedOn(Player p);
}
