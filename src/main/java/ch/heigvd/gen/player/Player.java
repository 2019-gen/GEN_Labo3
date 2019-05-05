package ch.heigvd.gen.player;

import ch.heigvd.gen.monopoly.Board;
import ch.heigvd.gen.monopoly.dice.Cup;
import ch.heigvd.gen.monopoly.Piece;
import ch.heigvd.gen.monopoly.square.Square;

public class Player {
    private final String name;
    private final Piece piece;
    private int cash;

    public Player(String name, String pieceName, Square startSquare) {
        this.name = name;
        this.piece = new Piece(pieceName, startSquare);
        this.cash = 1500;
    }

    public void takeTurn(Board board, Cup cup) {
        System.out.println(this + " commence son tour...");

        int score = 0;
//        cup.roll();
//        int score = cup.getTotal();

        System.out.println(this + " a fait un lancé de " + score);

        Square oldLocation = piece.getLocation();
        piece.setLocation(board.getSquare(oldLocation, score));

        System.out.println(this + " avance sa pièce " + piece + " de la case " + oldLocation + " a la case "
                + piece.getLocation());
    }

    public String toString() {
        return name;
    }

    public void addCash(int value) {
        if (cash < 0) {
            throw new IllegalArgumentException("Impossible d'ajouter du cash negatif");
        }
        cash += value;
    }

    public void reduceCash(int value) {
        if (cash < value) {
            throw new IllegalArgumentException("Impossible d'avoir du cash en negatif");
        }
        cash -= value;
    }

    public Piece getPiece() {
        return piece;
    }

    public int getNetWorth() {
        return cash;
    }
}
