package ru.vsu.cs.oop23.lobtsov_d_a.task2_ludo;

class Piece {

    public int pieceNumber;
    private String color;
    private boolean takenOut;
    private boolean completed;



    public Piece(int pieceNumber, String color) {

        this.pieceNumber = pieceNumber+1;
        this.color = color;

    }
    private int lastPieceNumber = 0;

    public int getNextPieceNumber() {
        lastPieceNumber = (lastPieceNumber % 4) + 1;
        return lastPieceNumber;
    }

    public Piece() {
    }


    String getColor() {
        return color;
    }
    int getPieceNumber() {
        return pieceNumber;
    }

    void setTakenOut(boolean mode) {
        takenOut = mode;
    }

    boolean isTakenOut() {
        return takenOut;
    }
    void setCompleted(boolean mode) {
        completed = mode;
    }
    boolean isCompleted() {
        return completed;
    }

}
