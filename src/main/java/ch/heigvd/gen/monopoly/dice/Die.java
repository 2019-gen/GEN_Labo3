package ch.heigvd.gen.monopoly.dice;

import java.util.Random;

/**
 * Cette classe représente un dé
 *
 * @author Mateo Tutic
 * @version 1.0
 * @since 03.05.2019
 */
public class Die {
    private int faceValue;      // Valeur du dé
    private int upperBound = 6; // Valeur max du dé
    private Random r;

    /**
     * Constructeur
     */
    public Die() {
        r = new Random();
    }

    /**
     * Constructeur
     *
     * @param upperBound Valeur max du dé
     */
    public Die(int upperBound) {
        this.upperBound = upperBound;
    }

    /**
     * Cette méthode permet de lancer le dé
     *
     * @return La valeur du dé : un nombre entre 1 et 6
     */
    public void roll() {
        faceValue = r.nextInt(upperBound) + 1;
    }

    /**
     * Cette méthode permet d'obtenir la valeur du dé
     *
     * @return La valeur du dé
     */
    public int getFaceValue() {
        return faceValue;
    }

    /**
     * Cette méthode permet d'obtenir la valeur max du dé
     *
     * @return La valeur max du dé
     */
    public int getUpperBound() {
        return upperBound;
    }
}
