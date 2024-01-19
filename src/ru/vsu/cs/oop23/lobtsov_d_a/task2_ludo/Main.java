package ru.vsu.cs.oop23.lobtsov_d_a.task2_ludo;

public class Main {
    public static void main(String[] args) {

        GameLogic gameLogic = new GameLogic();
        BoardRed boardRed = new BoardRed();
        BoardBlue boardBlue = new BoardBlue();


        gameLogic.runGame();
        System.out.println();
        System.out.print("Игровое поле: ");
        gameLogic.continueGame();
        gameLogic.moveGame();
        gameLogic.endGame();

//        boardBlue.blueWay();



    }

}