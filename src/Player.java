public class Player {

    public String color;
    public Piece[] piece;
    public int numberRolled;
    public void rollDice() {

        numberRolled = new Dice().DiceNum();

    }
    Player(String color) {

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

    int getNumberRolled() {
        return numberRolled;
    }

    @Override
    public String toString() {
        return " Игрок " + color;
    }
    boolean hasWon() {

        for(int i=0; i<4; i++)
            if(!piece[i].isCompleted())
                return false;

        // победа
        return true;

    }
}
