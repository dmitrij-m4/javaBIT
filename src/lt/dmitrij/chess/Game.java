package lt.dmitrij.chess;

import lt.dmitrij.chess.figures.King;
import lt.dmitrij.chess.figures.Queen;

public class Game {
    public static void main(String[] args) {

        Queen queen = new Queen('D',8,"White");
        King king = new King('E',8,"Black");

        System.out.println(queen);
        System.out.println(king);

    }

}

