class Piece {

    private int pieceNumber;
    private String color;
    private boolean takenOut;
    private boolean completed;

    Piece(int pieceNumber, String color) {

        this.pieceNumber = pieceNumber+1;
        this.color = color;

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
