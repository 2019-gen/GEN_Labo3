package ch.heigvd.gen.player;

import ch.heigvd.gen.monopoly.Die;
import ch.heigvd.gen.monopoly.MonopolyGame;

public class Player {
    private final String name;
//    private final Piece piece;

    public Player(String name) {
        this.name = name;
    }

    public void takeTurn(MonopolyGame jeu) {
        System.out.println(this + " commence son tour ...");

        int score = 0;
        for (Die d : jeu.getDice()) {
            d.roll();
            score += d.getFaceValue();
        }

        System.out.println(this + " a fait un lancé de " + score);

    }

    public String toString() {
        return name;
    }

}
