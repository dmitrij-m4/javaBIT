package lt.dmitrij.chess.figures;

import lt.dmitrij.chess.types.Position;

public class chess {
    Position position;
    String color;

    public chess(char letter, int number, String color) {
        this.position = new Position(letter,number);
        this.color = color;
    }

    @Override
    public String toString() {
        return getClass().getSimpleName() +" "+ position + " , " + color;
    }

}
