package ru.vsu.cs.oop23.lobtsov_d_a.task2_ludo;

import java.util.ArrayList;
import java.util.Arrays;

public class BoardRed<T> extends AllBoard<T> {


    public void clearList(GameLogic gameLogic){

        int numberHOD = gameLogic.currentPlayer.getNumberRolled();
        ArrayList<Integer> list = new ArrayList<>(52);
        for (int i = 0; i < 52; i++) {
            list.add(i);
        }
        list.subList(0,numberHOD).clear();
        System.out.println(list);
    }

    public void redWay() {

        ArrayList<Integer> list = new ArrayList<>(51);

        for (int i = 0; i < 51; i++) {
            list.add(i);

            if (i == 50) {
                ArrayList<Integer> boardRed = new ArrayList<>(6);
                for (int j = 1; j < 7; j++) {
                    boardRed.add(j);
                }

                System.out.println(Arrays.toString(boardRed.toArray()));
            }
        }
    }
}
