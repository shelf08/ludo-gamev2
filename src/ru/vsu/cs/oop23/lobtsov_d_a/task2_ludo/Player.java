package ru.vsu.cs.oop23.lobtsov_d_a.task2_ludo;

public class Player {

    public String color;
    public Piece[] piece;
    public int numberRolled;
    public boolean hasRolledSix;
    GameLogic gameLogic = new GameLogic();

    public void rollDice() {

        numberRolled = new Dice().DiceNum();

    }
    public Player(String color) {

        this.color = color;

        piece = new Piece[4];

        for(int i=0; i<4; i++)
            piece[i] = new Piece(i, color);

    }
    Piece getPiece(int pieceNumber) {
        return piece[pieceNumber];
    }

    String getColor() {
        return color;
    }
    boolean hasRolledSix() {
        return hasRolledSix;
    }

    int getNumberRolled() {
        return numberRolled;
    }

    @Override
    public String toString() {
        return " Игрок " + color;
    }

    public void hasWon() {

        for(int i=0; i<4; i++) {
            if (piece[i].isCompleted()) {
                System.out.println(gameLogic.currentPlayer + " победил в игре!" );
            }
        }

        // победа

    }
}
