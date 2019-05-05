package ch.heigvd.gen.player;

import ch.heigvd.gen.monopoly.Board;
import ch.heigvd.gen.monopoly.Die;
import ch.heigvd.gen.monopoly.Piece;
import ch.heigvd.gen.monopoly.Square;

import java.util.LinkedList;

public class Player {
    private final String name;
    private final Piece piece;

    public Player(String name, String pieceName, Square startSquare) {
        this.name = name;
        this.piece = new Piece(pieceName, startSquare);
    }

    public void takeTurn(Board board, LinkedList<Die> dice) {
        System.out.println(this + " commence son tour ...");

        int score = 0;
        for (Die d : dice) {
            d.roll();
            score += d.getFaceValue();
        }

        System.out.println(this + " a fait un lancé de " + score);

        Square oldLocation = piece.getLocation();
        piece.setLocation(board.getSquare(oldLocation, score));

        System.out.println(this + " avance sa pièce " + piece + " de la case " + oldLocation + " a la case "
                + piece.getLocation());
    }

    public String toString() {
        return name;
    }
}
