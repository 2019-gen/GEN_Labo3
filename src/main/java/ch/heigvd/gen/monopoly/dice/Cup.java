package ch.heigvd.gen.monopoly.dice;

import java.util.LinkedList;

/**
 * Cette classe représente un bol pour lancer les dés
 *
 * @author Luc Wachter
 * @version 1.0
 * @since 05.05.2019
 */
public class Cup {
    private LinkedList<Die> dice = new LinkedList<>(); // Les dés à lancer

    private int total; // La somme de tous les résultats des dés

    /**
     * Constructeur du bol pour lancer les dés
     *
     * @param nbrOfDice Le nombre de dés à lancer à chaque coup
     */
    public Cup(int nbrOfDice) {
        for (int i = 0; i < nbrOfDice; i++) {
            dice.add(new Die());
        }
    }

    /**
     * Permet de lancer les dés un par un et de sommer les résultats
     */
    public void roll() {
        total = 0;

        for (Die die : dice) {
           die.roll();
           total += die.getFaceValue();
        }
    }

    /**
     * Simple getter pour le résultat des dés
     *
     * @return Le total de toutes les faces des dés lancés
     */
    public int getTotal() {
        return total;
    }

    /**
     * Simple getter pour les dés du bol
     *
     * @return Une liste des dés
     */
    public LinkedList<Die> getDice() {
        return dice;
    }
}
