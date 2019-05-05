package ch.heigvd.gen.monopoly.player;

import ch.heigvd.gen.monopoly.board.square.Square;

/**
 * Cette class représente un pièce du Monopoly
 *
 * @author Mateo Tutic
 * @version 1.0
 * @since 03.05.2019
 */
public class Piece {
    private final String name;  // Nom de la pièce
    private Square location;    // Location de la pièce

    /**
     * Constructeur
     *
     * @param name     Nom de la pèce
     * @param location La location de la pièce
     */
    public Piece(String name, Square location) {
        this.name = name;
        this.location = location;
    }

    /**
     * Permet d'obtenir la location de la pièce
     *
     * @return La location de la pièce
     */
    public Square getLocation() {
        return location;
    }

    /**
     * Permet de change la location d'une pièce
     *
     * @param location La nouvelle location de la pièce
     */
    public void setLocation(Square location) {
        this.location = location;
    }

    /**
     * Permet d'obtenir le nom de la pièce
     *
     * @return Le nom de la pièce
     */
    public String getName() {
        return name;
    }

    /**
     * Surcharge de toString pour obtenir le nom de la pièce
     *
     * @return Le nom de la pièce
     */
    @Override
    public String toString() {
        return name;
    }
}
