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
    private LinkedList<Die> dice = new LinkedList<>();

    public Cup(int nbrOfDice) {
        for (int i = 0; i < nbrOfDice; i++) {
            dice.add(new Die());
        }
    }
}
