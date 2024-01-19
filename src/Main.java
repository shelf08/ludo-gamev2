
import java.util.ArrayList;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) {

        GameLogic gameLogic = new GameLogic();
        BoardRed boardRed = new BoardRed();
        BoardBlue boardBlue = new BoardBlue();


        gameLogic.runGame();
        System.out.println();
        System.out.print("Игровое поле: ");
        gameLogic.continueGame();

//        boardBlue.blueWay();



    }

}