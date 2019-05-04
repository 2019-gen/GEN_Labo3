package ch.heigvd.gen.monopoly;

/**
 * Cette classe représente une case dans le jeux Monopoly
 *
 * @author Mateo Tutic
 * @version 1.0
 * @since 03.05.2019
 */
public class Square {
    final String name;    // Nom de la case

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
}
