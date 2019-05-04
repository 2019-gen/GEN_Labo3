package ch.heigvd.gen.player;

import ch.heigvd.gen.monopoly.Die;
import ch.heigvd.gen.monopoly.MonopolyGame;

import java.util.LinkedList;

public class Player {
    private final String name;
//    private final Piece piece;

    public Player(String name) {
        this.name = name;
        // creer la piece
    }

    public void takeTurn(LinkedList<Die> dice) {
        System.out.println(this + " commence son tour ...");

        int score = 0;
        for (Die d : dice) {
            d.roll();
            score += d.getFaceValue();
        }

        System.out.println(this + " a fait un lancé de " + score);

//        get location
//        find new location (square at location + score)
//        System.out.println(this + " avance sa piece de la case " + oldLocation + " a la case " + newLocation);
    }

    public String toString() {
        return name;
    }

}
